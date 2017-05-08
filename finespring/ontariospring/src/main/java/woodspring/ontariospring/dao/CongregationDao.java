package woodspring.ontariospring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import woodspring.ontariospring.model.Congregation;


@Transactional
@Repository("congregationDao")
public class CongregationDao implements ICongregationDao {
	static final Logger logger = LogManager.getLogger(CongregationDao.class.getName());
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Congregation> getAllCongregation() {
		String hql = "FROM Congregation as cong  ORDER BY cong.insideId";
		List<Congregation> retList = (List<Congregation>) entityManager.createQuery(hql).getResultList();
		
		Gson gson = new Gson();
		retList.forEach(item->{
			String itemStr = gson.toJson( item);
			System.out.println(" ===== 030.01==="+ itemStr);			
		});
		
		System.out.println(" ===== 030.02==="+ hql+" === retList.size:"+ retList.size());
		return retList;
	}

	@Override
	public Congregation getCongregationById(long congregationId) {
		return entityManager.find(Congregation.class, congregationId);
	}

	@Override
	public List<Congregation> getCongregationByName(String name) {
		String hql = "FROM Congregation as cong WHERE cong.name = ? ";
		List<Congregation> congList = entityManager.createQuery(hql)
												.setParameter(1, name)
												.getResultList();
		return congList;
	}

	@Override
	public void addCongregation(Congregation congregation) {
		entityManager.persist(congregation);
	}

	@Override
	public void updateCongregation(Congregation congregation) {
		Congregation orgCon = getCongregationById(congregation.getId());
		orgCon.setCellNum(congregation.getCellNum());
		orgCon.setEmail(congregation.getEmail());
		orgCon.setHomeNum(congregation.getHomeNum());
		orgCon.setInsideId( congregation.getInsideId());
		orgCon.setName(congregation.getName());
		orgCon.setTeam(congregation.getTeam());
		entityManager.flush();		
	}

	@Override
	public void deleteCongregation(int congregationId) {
		entityManager.remove(getCongregationById(congregationId));
	}

	@Override
	public boolean existCongregation(String name, String team) {
		String hql = "FROM Congregation as cong WHERE cong.name = ? and cong.team = ?";
		int count = entityManager.createQuery(hql)
								.setParameter(1, name)
								.setParameter(2, team)
								.getResultList()
								.size();
		return count > 0 ? true : false;
	}

	@Override
	public Congregation save(Congregation congregation) {
		boolean bRet = true;
		Congregation orgCon = getCongregationById(congregation.getId());
		orgCon.setCellNum(congregation.getCellNum());
		orgCon.setEmail(congregation.getEmail());
		orgCon.setHomeNum(congregation.getHomeNum());
		orgCon.setInsideId( congregation.getInsideId());
		orgCon.setName(congregation.getName());
		orgCon.setTeam(congregation.getTeam());
		entityManager.flush();		
return orgCon;
	}
	

}

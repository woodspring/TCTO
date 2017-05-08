package woodspring.ontariospring.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import woodspring.ontariospring.dao.CongregationDao;
import woodspring.ontariospring.dao.CongregationRepository;
import woodspring.ontariospring.model.Congregation;


@Service("congregationService")
public class CongregationService implements CongregationServiceInf {
	static final Logger logger = LogManager.getLogger(CongregationService.class.getName());
	
	//@Autowired
	//private CongregationRepository congregationRepository;
	
	@Autowired
	private CongregationDao congregationDao;
	
	//CREATE
	@Override
	@Transactional
	public Congregation newCongregation(Congregation congregation) {
		Congregation retObj = congregationDao.save( congregation);
		//Congregation retObj = congregationRepository.save( congregation);
		return retObj;
	}

	// RETRIEVE
	@Override
	public List<Congregation> getAllCongregation() {
		System.out.println(" ===== 040.00=== service getAllCongregation starting===congregationRepository:"+ ((congregationDao == null)? "NULL": "NOT NULL"));
		//Iterable<Congregation> congregationItr = congregationRepository.findAll();
		List<Congregation> retObj = (List<Congregation>) congregationDao.getAllCongregation();
		
		return retObj;
	}

	@Override
	public List<Congregation> getCongregationByName(String name) {
		List<Congregation> congList = congregationDao.getCongregationByName(name);

//		List<Congregation> congList = new ArrayList<Congregation>();
//		Iterable<Congregation> conItr = congregationRepository.findByName( name);
//		conItr.forEach( congregation->congList.add(congregation));

		return congList;
	}

	@Override
	public Congregation getCongregationById(long id) {
		Congregation retObj = congregationDao.getCongregationById( id);
		//Congregation retObj = congregationRepository.findOne( id);
		return retObj;
	}

	
	// UPDATE
	@Override
	@Transactional
	public Congregation updateCongregation(Congregation congregation) {
		Congregation retObj = congregationDao.save( congregation);
		return retObj;
	}
	
}

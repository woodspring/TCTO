package woodspring.ontariospring.dao;

import java.util.List;

import woodspring.ontariospring.model.Congregation;

public interface ICongregationDao {
	   List<Congregation> getAllCongregation();
	    Congregation getCongregationById(long CongregationId);
	    List<Congregation> getCongregationByName(String name);
	    void addCongregation(Congregation congregation);
	    void updateCongregation(Congregation congregation);
	    void deleteCongregation(int congregationId);
	    boolean existCongregation(String title, String location);
	    Congregation save(Congregation congregation);

}

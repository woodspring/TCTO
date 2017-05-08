package woodspring.ontariospring.service;

import java.util.List;

import woodspring.ontariospring.model.Congregation;

public interface CongregationServiceInf {
	public Congregation newCongregation( final Congregation congregation);
	public List<Congregation> getAllCongregation();
	public List<Congregation> getCongregationByName(String name);
	public Congregation getCongregationById(long id);
	public Congregation updateCongregation( final Congregation congregation);
	
}

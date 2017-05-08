package woodspring.ontariospring.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.gson.Gson;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import woodspring.ontariospring.model.Congregation;
import woodspring.ontariospring.service.CongregationService;

@RestController
public class CongregationController {
	static final Logger logger = LogManager.getLogger(CongregationController.class.getName());
	
	@Autowired
	CongregationService congregationService;
	
	@RequestMapping(value = "/congregation", method = RequestMethod.GET)
	public ResponseEntity<List<Congregation>> listAllCongregations() {
		System.out.println(" ===== 050.00=== controller listAllCongregations starting===congregationService:"+ ((congregationService == null)? "NULL": "NOT NULL"));
		List<Congregation> congregationList = congregationService.getAllCongregation();
		
		Gson gson = new Gson();
		congregationList.forEach(item->{
			String itemStr = gson.toJson( item);
			System.out.println(" ===== 050.01==="+ itemStr);			
		});
		
		System.out.println(" ===== 050.02====== congregationList.size:"+ congregationList.size());
		
		
		
		return new ResponseEntity<List<Congregation>>( congregationList, HttpStatus.OK);	
	}

	@RequestMapping(value = "/congregation/id/{id}", method = RequestMethod.GET)
	public ResponseEntity<Congregation> getCongregationById( @PathVariable("id") Long id) {
		Congregation congregation = congregationService.getCongregationById( id);
		return new ResponseEntity<Congregation>( congregation, HttpStatus.OK);	
	}
	
	@RequestMapping(value = "/congregation/name/{name}", method = RequestMethod.GET)
	public ResponseEntity<List<Congregation>> getCongregationByName(@PathVariable("name") String name) {
		List<Congregation> congregationList = congregationService.getCongregationByName(name);
		return new ResponseEntity<List<Congregation>>( congregationList, HttpStatus.OK);	
	}
	
	@RequestMapping(value= "/congregation", method = RequestMethod.POST)
	public ResponseEntity<Congregation> addCongregation( @RequestBody Congregation congregation, UriComponentsBuilder builder) {
		Congregation cong = null;
		cong = congregationService.newCongregation(congregation);
		if ( cong == null)
			return new ResponseEntity<Congregation>(HttpStatus.CONFLICT);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/congregation/{id}").buildAndExpand( congregation.getId() ).toUri());
		return new ResponseEntity<Congregation>( headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/congregation/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Congregation> updateCongregation( @RequestBody Congregation congregation) {
		Congregation retCong = congregationService.updateCongregation(congregation);
		return new ResponseEntity<Congregation>( retCong, HttpStatus.OK);	
	}
}

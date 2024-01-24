package com.crud.data.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.data.Model.person;
import com.crud.data.services.PersonService;

@RestController
public class PersonController {
	
	//public List<person> persons=new ArrayList<>();
	
       @Autowired
	  private  PersonService personservice;

	  @GetMapping("/getdata")
	 public List<person> getAllPerson()
	 {
		 return  personservice.getAllPerson();
	 }
	 
//	  
//	  @GetMapping("/{id}")
//	 public List<person> getPersonById(@PathVariable Long id)
//	 {
//		 return  personservice.getPersonById(id);
//	 }

	 
	 
	 @PostMapping("/post")
	 public person  saveperson(@RequestBody person Person )       
	 {
		return personservice.saveperson(Person);
	 }
	 
	 
	  @DeleteMapping("/{id}")
	  public void deleteperson(@PathVariable Long id)
	  {
		  personservice.deleteperson(id);
	  }
	  
	  @PutMapping("/{id}")
	  public person updatedperson(@PathVariable Long id,@RequestBody person updatedperson)
	  {
		  return personservice.updateperson(id, updatedperson);
	  }

}

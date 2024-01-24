package com.crud.data.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.data.Model.person;
import com.crud.data.modern.PersonRepositary;

@Service
public class PersonService {
	
 @Autowired
private PersonRepositary personrepository;

 //getting data
public List<person> getAllPerson()
	{
		return personrepository.findAll();
		
	}




//post
public  person saveperson(person Person)
{
	return personrepository.save(Person);
}

  //delete purpose
   public void deleteperson(Long id)
   {
	   personrepository.deleteById(id);  
   }
    //update purpose
   public person updateperson(Long id,person updatedperson)
   {
	   Optional<person> existingpersonOptional =personrepository.findById(id);
	   
	   if(existingpersonOptional.isPresent())
	   {
		   person existingperson=existingpersonOptional.get();
		   existingperson.setName(updatedperson.getName());
		   existingperson.setAge(updatedperson.getAge());
		   
		   return personrepository.save(existingperson);
		                                                                      
	   }else
	   {
		   System.out.println("Error");
		   return null;
	   }
   }
    public Optional <person> getpersonById(Long id)
    {
    	return personrepository.findById(id);
    }
}


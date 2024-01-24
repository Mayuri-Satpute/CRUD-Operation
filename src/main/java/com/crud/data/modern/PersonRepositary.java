package com.crud.data.modern;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.data.Model.person;
@Repository
public interface PersonRepositary extends JpaRepository<person,Long> {
	
	

}

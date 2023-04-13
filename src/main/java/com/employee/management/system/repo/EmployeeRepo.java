package com.employee.management.system.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.management.system.pojo.EmployeePojo;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeePojo, Integer> {

   
	
}







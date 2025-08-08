package com.dyashin.spboot.repositoryPackage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dyashin.spboot.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
   // for manual way
//	public List<Employee> findByName(String name);
}

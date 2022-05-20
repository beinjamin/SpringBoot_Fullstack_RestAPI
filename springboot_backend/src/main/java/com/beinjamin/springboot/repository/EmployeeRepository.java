package com.beinjamin.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beinjamin.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Long>{

}


package com.mvc.SpringMvcCrudOp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.SpringMvcCrudOp.dto.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

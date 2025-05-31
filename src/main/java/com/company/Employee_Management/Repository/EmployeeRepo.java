package com.company.Employee_Management.Repository;


import com.company.Employee_Management.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}


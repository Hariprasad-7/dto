package com.datatransfer.web.repository;

import com.datatransfer.web.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeRepository extends JpaRepository<Employee,Integer> {
}

package com.example.crud2.repository;

import com.example.crud2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> { //Obj long di chung voi id


}

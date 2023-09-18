package com.example.crud2.controller;

import com.example.crud2.model.Employee;
import com.example.crud2.service.EmployeeServiceImpl;
import com.example.crud2.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/employee")//gắn một URL pattern (đường dẫn URL) với cont roller này
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    //Test
    @GetMapping("/")
    public String test(){
        return"timoday";
    }

    //API add employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return iEmployeeService.addEmployee(employee);
    }
    //API update employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id,@RequestBody Employee employee){
        return iEmployeeService.updateEmployee(id,employee);
    }
    //API delete employee
    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable("id") long id){
        return iEmployeeService.deleteEmployee(id);
    }
    //API lay danh sach
    @GetMapping("/list")
    public List<Employee> getEmployeeList(){
        return iEmployeeService.getAllEmployee();
    }
}

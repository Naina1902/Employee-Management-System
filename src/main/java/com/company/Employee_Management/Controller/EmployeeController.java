package com.company.Employee_Management.Controller;

import com.company.Employee_Management.Model.Employee;
import com.company.Employee_Management.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("employee", new Employee());
        return "index"; // view name (Thymeleaf)
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeRepo.save(employee);
        return "success"; // after saving
    }
}


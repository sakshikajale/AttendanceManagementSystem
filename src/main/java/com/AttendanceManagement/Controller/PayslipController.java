package com.AttendanceManagement.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AttendanceManagement.Model.Empl;
import com.AttendanceManagement.Model.Payslip;
//
//@RestController
//@RequestMapping("/api/payslip")
//public class PayslipController {
//
//    private final EmployeeService employeeService;
//
//    @Autowired
//    public PayslipController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Payslip> generatePayslip(@PathVariable Long id) {
//        Optional<Employee> employeeOptional = employeeService.getEmployeeById(id);
//        if (employeeOptional.isPresent()) {
//            Employee employee = employeeOptional.get();
//            // Fetch other relevant details such as salary, deductions, etc.
//            BigDecimal basicSalary = employee.getBasicSalary();
//            BigDecimal allowances = employee.getAllowances();
//            BigDecimal deductions = employee.getDeductions();
//            
//            // Calculate net salary
//            BigDecimal netSalary = basicSalary.add(allowances).subtract(deductions);
//
//            // Create and return the payslip
//            Payslip payslip = new Payslip(employee.getId(), employee.getName(), basicSalary, allowances, deductions, netSalary);
//            return ResponseEntity.ok(payslip);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//}

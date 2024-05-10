package org.kravchenko.hotel.controller;

import org.kravchenko.hotel.service.dto.EmployeeDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("api/hotel/employee")
public interface EmployeeController {

    @GetMapping("/find")
    EmployeeDto findEmployee(@RequestParam Long id);

    @PutMapping("/add")
    void addEmployee(@RequestBody EmployeeDto employeeDto);

    @DeleteMapping("/delete")
    void deleteEmployee(@RequestParam Long id);

}

package com.example.batch9.controller;

import com.example.batch9.entity.Company;
import com.example.batch9.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/addCompany")
    public Company addCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    @PostMapping("/addCompanies")
    public List<Company> addCompanies(@RequestBody List<Company> companies) {
        return companyService.saveCompanies(companies);
    }

    @GetMapping("/getCompanies")
    public List<Company> findAll() {
        return companyService.getCompanies();
    }

    @GetMapping("/getCompanyByAddress/{address}")
    public Company findByAddress(@PathVariable String address) {
        return companyService.getCompanyByAddress(address);
    }

    @DeleteMapping("/deleteCompany/{id}")
    public String deleteCompany(@PathVariable int id) {
        return companyService.deleteCompany(id);
    }

    @PutMapping("/updateCompany")
    public Company updateCompany(@RequestBody Company company) {
        return companyService.updateCompany(company);
    }

}

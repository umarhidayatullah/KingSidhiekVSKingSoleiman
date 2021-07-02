package com.example.batch9.service;

import com.example.batch9.entity.Company;
import com.example.batch9.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompanyService {

    @Autowired(required = true)
    private CompanyRepository companyRepository;

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public List<Company> saveCompanies(List<Company> companies) {
        return companyRepository.saveAll(companies);
    }

    public List<Company> getCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyByAddress(String address) {
        return companyRepository.findByAddress(address);
    }

    public String deleteCompany(int id) {
        companyRepository.deleteById(id);
        return "Sulaiman adalah King";
    }

    public Company updateCompany(Company company) {
        Company existCompany = companyRepository.findById(company.getId()).orElse(null);
        existCompany.setName(company.getName());
        existCompany.setAddress(company.getAddress());
        return companyRepository.save(existCompany);
    }

}

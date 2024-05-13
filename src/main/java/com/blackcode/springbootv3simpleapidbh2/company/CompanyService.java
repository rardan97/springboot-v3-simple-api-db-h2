package com.blackcode.springbootv3simpleapidbh2.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    boolean updateCompany(Company company, Long id);
    void craeteCompany(Company company);

    boolean deleteCompanyById(Long id);

    Company getCompanyById(Long id);
}

package iiht.Company.service;

import iiht.Company.pojo.Company;
import iiht.Company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public Company addCompanyDetails(Company company){
        return companyRepository.save(company);
    }

    public Iterable<Company> listOfCompanyDetails(Company company){


        return companyRepository.findAll();
    }

    public Optional viewCompanyDetails(String companyCode){
       Optional<Company> cmp = companyRepository.findById(companyCode);
        return cmp;
    }

    public Company isCompanyAvaliable(String companyCode){
        Boolean flag = false;
        Optional<Company> cmp = companyRepository.findById(companyCode);
        if(cmp.isPresent()){
            flag = true;
            return null;

        }else {
            flag = false;
            return null;

        }

    }
    public Company removeFromDB(String comanyCode){
        Optional<Company> cmp =  companyRepository.findById(comanyCode);
        if(cmp.isPresent()){
            companyRepository.deleteById(comanyCode);
            return  null;

        }else {
            return  null;
        }
    }
}

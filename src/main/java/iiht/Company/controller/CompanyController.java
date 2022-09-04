package iiht.Company.controller;

import iiht.Company.pojo.Company;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.SSLEngineResult;

@Controller
@RequestMapping("/api")
public class CompanyController {

    @GetMapping("/")
    public ResponseEntity<Company> addCompany(@RequestBody Company company){

        return new ResponseEntity<Company>(company, HttpStatus.OK);
    }
    @GetMapping("/f")
    public ResponseEntity<Company> listOfCompany(){

        return new ResponseEntity<Company>(HttpStatus.OK);
    }

    public ResponseEntity<?> viewCompany(@PathVariable ("id") String companyCode){
       return  new ResponseEntity<>("",HttpStatus.OK);
    }

    public ResponseEntity<Company> isCompanyPresent(@PathVariable ("id") String companyCode){
        return new ResponseEntity<Company>(HttpStatus.OK);
    }

    public ResponseEntity<?> removeCompany(@PathVariable String companyCode){

        return new ResponseEntity(HttpStatus.OK);
    }
}

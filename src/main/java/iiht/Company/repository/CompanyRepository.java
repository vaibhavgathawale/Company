package iiht.Company.repository;

import iiht.Company.pojo.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company,String> {

}

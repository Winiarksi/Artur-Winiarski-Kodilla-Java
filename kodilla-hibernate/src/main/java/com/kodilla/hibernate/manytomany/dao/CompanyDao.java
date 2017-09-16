package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

  //  List<Company> findByDuration(int duration);

    @Query(nativeQuery = true)
    List<Company> findForSelectedBusinessNames();

}

/*
Zmodyfikuj kontrolery repozytorium encji Employee oraz Company tak, aby udostępniały metody zwracające dane wyszukiwane przy pomocy named queries

 */
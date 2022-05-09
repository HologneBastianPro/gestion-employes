package com.openclassroom.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassroom.api.model.Employee;


/** Ça simple implémentation binder avec Employée permet de
  bénéficier de plusieurs des methodes crud sur l'entité Employé.
  Doc : https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {


}
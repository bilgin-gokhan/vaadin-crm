package com.vaadin.tutorial.crm.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaadin.tutorial.crm.backend.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}

package com.vaadin.tutorial.crm.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaadin.tutorial.crm.backend.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}

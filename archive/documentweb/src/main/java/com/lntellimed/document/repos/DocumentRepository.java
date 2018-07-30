package com.lntellimed.document.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lntellimed.document.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}

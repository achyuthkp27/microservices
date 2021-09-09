package com.fisglobal.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fisglobal.training.model.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Integer>{
	
}

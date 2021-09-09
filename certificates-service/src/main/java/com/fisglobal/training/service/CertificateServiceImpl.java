package com.fisglobal.training.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Certificate;
import com.fisglobal.training.repository.CertificateRepository;

@Service
public class CertificateServiceImpl implements CertificateService{

	@Autowired
	private CertificateRepository certificateRepository;
	
	@Override
	public boolean saveCertificate(Certificate certificate) {
		certificate.setDateOfIssue(LocalDate.now());
		certificateRepository.save(certificate);
		return true;
	}

	@Override
	public boolean updateCertificate(Certificate certificate) {
		certificateRepository.save(certificate);
		return true;
	}

	@Override
	public boolean deleteCertificate(Integer id) {
		certificateRepository.deleteById(id);
		return true;
	}

	@Override
	public Certificate getById(Integer id) {
		return certificateRepository.getById(id);
	}

	@Override
	public List<Certificate> findAll() {
		return certificateRepository.findAll();
	}

}

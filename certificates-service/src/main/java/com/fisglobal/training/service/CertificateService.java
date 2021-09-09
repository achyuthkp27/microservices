package com.fisglobal.training.service;

import java.util.List;

import com.fisglobal.training.model.Certificate;


public interface CertificateService {
	public boolean saveCertificate(Certificate certificate);

	public boolean updateCertificate(Certificate certificate);

	public boolean deleteCertificate(Integer id);

	public Certificate getById(Integer id);

	public List<Certificate> findAll();
}

package com.fisglobal.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisglobal.training.model.Certificate;
import com.fisglobal.training.service.CertificateService;


@RestController
@RequestMapping("/api")
public class CertificateRestController {
	@Autowired
	private CertificateService certificateService;
	
	@GetMapping("/certificates/{id}")
	public Certificate getCertificateById(@PathVariable("id") Integer id) {
		return certificateService.getById(id);
	}
	
	@GetMapping("/certificates")
	public List<Certificate> getAllEmployees() {
		return certificateService.findAll();
	}
	
	@PostMapping("/certificates")
	public Certificate addCertificate(@RequestBody Certificate certificate) {
		certificateService.saveCertificate(certificate);
		return certificate;
	}
	
	@PutMapping("/certificates")
	public Certificate updateCertificate(@RequestBody Certificate certificate) {
		certificateService.updateCertificate(certificate);
		return certificate;
	}
	
	@DeleteMapping("/certificates/{id}")
	public boolean deleteCertificate(@PathVariable("id") Integer id) {
		return certificateService.deleteCertificate(id);
	}
}

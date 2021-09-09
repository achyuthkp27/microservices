package com.fisglobal.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Skill;
import com.fisglobal.training.repository.SkillsRepository;

@Service
public class SkillServiceImpl implements SkillService{
	
	@Autowired
	private SkillsRepository skillRepository;
	
	@Override
	public boolean saveSkill(Skill skill) {
		skillRepository.save(skill);
		return true;
	}

	@Override
	public boolean updateSkill(Skill skill) {
		skillRepository.save(skill);
		return true;
	}

	@Override
	public boolean deleteSkill(Integer id) {
		skillRepository.deleteById(id);
		return true;
	}

	@Override
	public Skill getById(Integer id) {
		return skillRepository.getById(id);		
	}

	@Override
	public List<Skill> findAll() {
		return skillRepository.findAll();
	}

}

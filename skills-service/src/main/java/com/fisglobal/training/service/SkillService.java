package com.fisglobal.training.service;

import java.util.List;

import com.fisglobal.training.model.Skill;

public interface SkillService {
	public boolean saveSkill(Skill skill);

	public boolean updateSkill(Skill skill);

	public boolean deleteSkill(Integer id);

	public Skill getById(Integer id);

	public List<Skill> findAll();
}

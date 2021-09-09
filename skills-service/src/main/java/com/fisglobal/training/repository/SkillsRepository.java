package com.fisglobal.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fisglobal.training.model.Skill;

@Repository
public interface SkillsRepository extends JpaRepository<Skill, Integer>{
	
}

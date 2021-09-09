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

import com.fisglobal.training.model.Skill;
import com.fisglobal.training.service.SkillService;



@RestController
@RequestMapping("/api")
public class SkillsRestController {
	@Autowired
	private SkillService skillService;
	
	@GetMapping("/skills/{id}")
	public Skill getSkillById(@PathVariable("id") Integer id) {
		return skillService.getById(id);
	}
	
	@GetMapping("/skills")
	public List<Skill> getAllSkills() {
		return skillService.findAll();
	}
	
	@PostMapping("/skills")
	public Skill addSkill(@RequestBody Skill skill) {
		skillService.saveSkill(skill);
		return skill;
	}
	
	@PutMapping("/skills")
	public Skill updateSkill(@RequestBody Skill skill) {
		skillService.updateSkill(skill);
		return skill;
	}
	
	@DeleteMapping("/skills/{id}")
	public boolean deleteSkill(@PathVariable("id") Integer id) {
		return skillService.deleteSkill(id);
	}
}

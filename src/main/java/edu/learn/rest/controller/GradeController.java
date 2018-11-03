package edu.learn.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.learn.rest.business.GradeService;
import edu.learn.rest.model.Grade;

@RestController
public class GradeController {
	@Autowired
	private GradeService gradeService;
	
	@RequestMapping("/grades")
	public List<Grade> findAll() {
		return gradeService.findAll();
	}

	@RequestMapping("/grades/{gradeCode}")
	public Grade getgradeCode(@PathVariable String gradeCode) {		
		return gradeService.findGrade(gradeCode);
	
	}
	@RequestMapping("/grades/gt/{gradeRange}")
	public List<Grade> getGradeRange(@PathVariable float gradeRange) {
		return gradeService.findRange(gradeRange);
	}


	
}
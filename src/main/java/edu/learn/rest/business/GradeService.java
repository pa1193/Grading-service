package edu.learn.rest.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import edu.learn.rest.model.Grade;

import java.util.*;
@Service

public class GradeService {
	private static List<Grade> list = new ArrayList<>();
	static {
		list.add(new Grade("A", 93f, 100f, 4.0f));
		list.add(new Grade("A-", 90f, 92.9f, 3.7f));
		list.add(new Grade("B+", 87f, 89.9f, 3.3f));
		list.add(new Grade("B", 83f, 86.9f, 3.0f));
		list.add(new Grade("B-", 80f, 82.9f, 2.7f));
		list.add(new Grade("C+", 77f, 79.9f, 2.3f));
		list.add(new Grade("C", 70f, 76.9f, 2.0f));
		list.add(new Grade("D", 60f, 69.9f, 1.0f));
		list.add(new Grade("F", 0f, 59.9f, 0.0f));

	}

	public List<Grade> findAll() {
		return list;
	}

	public Grade findGrade( String gradeCode) {
		for(Grade grade : list) {
			if(grade.getLettergrade().equalsIgnoreCase(gradeCode)) {
				return grade;
			}
		}
		return null;
	}

	public List<Grade> findRange(float gradeRange) {
		List<Grade> range = new ArrayList<>();
	for(Grade grade: list) {
		if(grade.getRange1() >= gradeRange) {
			range.add(grade);
			
		}
		
	}
	return range;

	}
	
}

package tech.raj.college.dao;

import java.util.List;

import tech.raj.college.model.College;

public interface CollegeDao {

	void save(College college);

	List<College> getAll();

	College findById(String id);
}

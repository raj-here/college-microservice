package tech.raj.college.service;

import java.util.List;

import tech.raj.college.bean.CollegeBean;

public interface CollegeService {

	void save(CollegeBean college);

	List<CollegeBean> getAll();

	CollegeBean findById(String id);

}

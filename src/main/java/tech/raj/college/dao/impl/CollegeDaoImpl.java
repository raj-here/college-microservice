package tech.raj.college.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tech.raj.college.dao.CollegeDao;
import tech.raj.college.model.College;
import tech.raj.college.repository.CollegeRepository;

@Repository
public class CollegeDaoImpl implements CollegeDao {

	@Autowired
	private CollegeRepository collegeRepository;

	@Override
	@Transactional
	public void save(College college) {
		collegeRepository.save(college);
	}

	@Override
	public List<College> getAll() {
		return collegeRepository.findAll();
	}

	@Override
	public College findById(String id) {
		return collegeRepository.findById(id).get();
	}

}

package tech.raj.college.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.raj.college.bean.CollegeBean;
import tech.raj.college.dao.CollegeDao;
import tech.raj.college.model.College;
import tech.raj.college.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private CollegeDao collegeDao;

	@Override
	public void save(CollegeBean collegeBean) {
		collegeDao.save(new College(collegeBean));
	}

	@Override
	public List<CollegeBean> getAll() {
		return collegeDao.getAll().stream().map(CollegeBean::new).collect(Collectors.toList());
	}

	@Override
	public CollegeBean findById(String id) {
		return new CollegeBean(collegeDao.findById(id));
	}
}

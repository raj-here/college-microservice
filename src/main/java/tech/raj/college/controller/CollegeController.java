package tech.raj.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tech.raj.college.bean.CollegeBean;
import tech.raj.college.bean.OutputBean;
import tech.raj.college.service.CollegeService;

@RestController
@RequestMapping(value = "/college")
@Api(value = "CollgeController")
public class CollegeController {

	@Autowired
	CollegeService collegeService;

	@ApiOperation(value = "Get list of colleges")
	@RequestMapping(path = "", method = RequestMethod.GET)
	public OutputBean<List<CollegeBean>> getColleges() {
		return new OutputBean<>("data", collegeService.getAll());
	}

	@ApiOperation(value = "Get college by id")
	@RequestMapping(path = "/{collegeId}", method = RequestMethod.GET)
	public OutputBean<CollegeBean> getCollege(@PathVariable("collegeId") String collegeId) {
		return new OutputBean<>("data", collegeService.findById(collegeId));
	}

	@ApiOperation(value = "save a college")
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public void saveCollege(@RequestBody CollegeBean college) {
		collegeService.save(college);
	}

}

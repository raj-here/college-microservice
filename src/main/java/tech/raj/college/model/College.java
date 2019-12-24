package tech.raj.college.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.raj.college.bean.CollegeBean;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "colleges")
public class College extends BaseModel {

	@Column(name = "college_name")
	@NotNull
	@Size(max = 100)
	private String name;

	@Column(name = "city")
	private String city;

	public College(CollegeBean collegeBean) {
		super();
		this.id = collegeBean.getId();
		this.name = collegeBean.getName();
		this.city = collegeBean.getCity();
	}
}

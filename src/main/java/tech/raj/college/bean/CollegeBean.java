package tech.raj.college.bean;

import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.raj.college.model.College;

@Getter
@Setter
@NoArgsConstructor
public class CollegeBean extends BaseBean {

	private String id;

	@NotNull
	@Size(max = 100)
	private String name;

	private String city;

	public CollegeBean(College collge) {
		super(collge.getCreatedDate(), collge.getUpdateDate());
		this.id = collge.getId();
		this.name = collge.getName();
		this.city = collge.getCity();
	}
}

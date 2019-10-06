package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "TMP_USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotBlank(message = "SSN is mandatory")
	@Pattern(regexp = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$")
	private String ssn;

	@NotBlank(message = "DOB is mandatory")
	private String dob;

	@NotBlank(message = "Name is mandatory")
	@Pattern(regexp = "^[a-zA-Z]+$")
	private String name;

	@NotBlank(message = "Address is mandatory")
	@Pattern(regexp = "^[a-zA-Z0-9\\.\\-\\s\\,]+$")
	private String address;

	@NotNull(message = "Salary should be > 0")
	@Min(value = 1, message = "Salary should be > 0")
	private Integer salary;

	@NotBlank(message = "Gender is mandatory")
	private String gender;
	 
	private Integer count;
	 
	private Integer current;

	public User() {
	}

	public User(@NotBlank(message = "SSN is mandatory") String ssn, @NotBlank(message = "DOB is mandatory") String dob,
			@NotBlank(message = "Name is mandatory") String name,
			@NotBlank(message = "Address is mandatory") String address,
			@Min(value = 0, message = "Salary min value is 0") Integer salary,
			@NotBlank(message = "Gender is mandatory") String gender) {

		this.ssn = ssn;
		this.dob = dob;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.gender = gender;
	}

	public Integer getCount() {
		return count;
	}

	public Integer getCurrent() {
		return current;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public long getId() {
		return id;
	}

	public String getSsn() {
		return ssn;
	}

	public String getDob() {
		return dob;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Integer getSalary() {
		return salary;
	}

	public String getGender() {
		return gender;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", ssn=" + ssn + ", dob=" + dob + ", name=" + name + ", address=" + address
				+ ", salary=" + salary + ", gender=" + gender + "]";
	}

}

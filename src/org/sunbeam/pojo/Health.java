package org.sunbeam.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Health {
	private Integer hid;
	private String bmi;
	private String gender;
	private Integer age;
	private Integer dpid;
	private Integer woid;
	
	public Health() {
		// TODO Auto-generated constructor stub
	}

	public Health(Integer hid, String bmi, String gender, Integer age, Integer dpid, Integer woid) {
		super();
		this.hid = hid;
		this.bmi = bmi;
		this.gender = gender;
		this.age = age;
		this.dpid = dpid;
		this.woid = woid;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="HID")
	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}
	
	@Column(name="BMI")
	public String getBmi() {
		return bmi;
	}

	public void setBmi(String bmi) {
		this.bmi = bmi;
	}
	
	@Column(name="GENDER")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name="AGE")
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name="DPID")
	public Integer getDpid() {
		return dpid;
	}

	public void setDpid(Integer dpid) {
		this.dpid = dpid;
	}

	@Column(name="WOID")
	public Integer getWoid() {
		return woid;
	}

	public void setWoid(Integer woid) {
		this.woid = woid;
	}

	@Override
	public String toString() {
		return "Health [hid=" + hid + ", bmi=" + bmi + ", gender=" + gender + ", age=" + age + ", dpid=" + dpid
				+ ", woid=" + woid + "]";
	}
	
}

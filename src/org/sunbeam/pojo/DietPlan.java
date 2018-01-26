package org.sunbeam.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DietPlan {
	private Integer dpid;
	private String url;
	private String timing;
	private String description;
	private String name;
	
	public DietPlan() {
		// TODO Auto-generated constructor stub
	}

	public DietPlan(Integer dpid, String url, String timing, String description, String name) {
		super();
		this.dpid = dpid;
		this.url = url;
		this.timing = timing;
		this.description = description;
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DPID")
	public Integer getDpid() {
		return dpid;
	}

	public void setDpid(Integer dpid) {
		this.dpid = dpid;
	}

	@Column(name="URl")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name="TIMING")
	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	@Column(name="DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DietPlan [dpid=" + dpid + ", url=" + url + ", timing=" + timing + ", description=" + description
				+ ", name=" + name + "]";
	}

}

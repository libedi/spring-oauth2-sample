package com.example.demo.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Member implements Serializable {
	private static final long serialVersionUID = 6388068334213889190L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String username;
	private String remark;
	
	public Member() {}

	public Member(String name, String username, String remark) {
		this.name = name;
		this.username = username;
		this.remark = remark;
	}
	
}

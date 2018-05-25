package com.libedi.demo.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * Member entity
 * @author Sangjun, Park
 *
 */
@Data
@Entity
public class Member implements Serializable {
	
	private static final long serialVersionUID = -20693614570267933L;
	
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

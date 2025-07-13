package com.management.app.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "user_info_seq", sequenceName = "user_seq", allocationSize = 1)
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_info_seq")
	private Long id;
	
	private Long adharNo;
	
	private String pan;
}

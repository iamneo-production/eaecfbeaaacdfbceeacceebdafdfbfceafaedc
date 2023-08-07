package com.examly.springapp;

import javax.persistence.ColumnResult;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long taskId;

	@javax.persistence.Column
	private String taskHolderName;
	@javax.persistence.Column
	private String taskDate;
	@Column
	private String taskName;
	@Column
	private String taskStatus;
}
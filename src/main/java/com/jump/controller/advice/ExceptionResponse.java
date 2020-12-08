package com.jump.controller.advice;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {
	
	private String errorDetails;
	private String errorCode;
	private LocalDate timestamp;
}
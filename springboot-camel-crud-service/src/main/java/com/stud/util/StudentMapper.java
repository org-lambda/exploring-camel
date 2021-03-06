package com.stud.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stud.bean.StudentDto;
import com.stud.entity.StudentEntity;

public class StudentMapper {
	public static StudentDto entityToDto(StudentEntity entity) {
		return new ObjectMapper().convertValue(entity, StudentDto.class);
	}

	public static StudentEntity dtoToEntity(StudentDto user) {
		return new ObjectMapper().convertValue(user, StudentEntity.class);
	}

	public static StudentDto addCountry(StudentDto studentDto) {
		studentDto.setAddress(new StringBuilder()
				.append(studentDto.getAddress())
				.append(AppConstants.COMMA_SEPARATOR)
				.append(AppConstants.KEYWORD_INDIA)
				.toString());
		return studentDto;
	}
}

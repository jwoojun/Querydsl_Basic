package com.example.querydsl.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.example.querydsl.dto.QUserDto is a Querydsl Projection type for UserDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QUserDto extends ConstructorExpression<UserDto> {

    private static final long serialVersionUID = 1088539581L;

    public QUserDto(com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<Integer> age) {
        super(UserDto.class, new Class<?>[]{String.class, int.class}, name, age);
    }

}


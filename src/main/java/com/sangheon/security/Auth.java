package com.sangheon.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( { ElementType.TYPE, ElementType.METHOD } )
@Retention( RetentionPolicy.RUNTIME )
public @interface Auth {
	public enum Role {ADMIN, USER}

	public Role role() default Role.USER;
	//String value() default "user";
	//int test() default 1;
}

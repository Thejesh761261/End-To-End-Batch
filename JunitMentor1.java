package com.javasampleapproach.springrest.mysql;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.Mentor1;

public class JunitMentor1 {

	Mentor1 m= new Mentor1();
	
	@Test
	public void test() {
	assertEquals(5, m.NoOfCourses(2, 3));
	}
	
}

package com.jlc.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { JLCConfig.class })
public class JlcTest {

	@Autowired
	private Student stud;

	@Test
	public void testStudent() {
		String msg = stud.getMessage();
		assertEquals("HelloSri", msg);
	}
}

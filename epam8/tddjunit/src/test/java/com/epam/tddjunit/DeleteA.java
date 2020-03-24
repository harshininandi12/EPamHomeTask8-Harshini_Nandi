package com.epam.tddjunit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class DeleteA {
	RemoveA r;
	@Before
	public void setUp() {
		r = new RemoveA();
	}
	
	@Test
	public void delete1() {
		assertEquals("",r.removeA("AA"));
	}
	@Test
	public void delete2() {
		assertEquals("BCD",r.removeA("ABCD"));
	}
	@Test
	public void delete3() {
		assertEquals("CD",r.removeA("AACD"));
	}
	@Test
	public void delete4() {
		assertEquals("BCD",r.removeA("BACD"));
	}
	@Test
	public void delete5() {
		assertEquals("BBAA",r.removeA("BBAA"));
	}
	@Test
	public void delete6() {
		assertEquals("BAA",r.removeA("AABAA"));
	}
	@Test
	public void delete7() {
		assertEquals("",r.removeA(""));
	}
	@Test
	public void delete8() {
		assertEquals("AAAA",r.removeA("AAAAAA"));
	}
}



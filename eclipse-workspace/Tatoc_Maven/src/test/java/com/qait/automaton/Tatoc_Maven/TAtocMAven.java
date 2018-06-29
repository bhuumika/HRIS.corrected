package com.qait.automaton.Tatoc_Maven;

import org.testng.annotations.Test;

public class TAtocMAven extends LAunchUrl {

	LAunchUrl l = new LAunchUrl();

	@Test
	public void launchUrl() {

		l.launch();

	}

	@Test
	public void selectBasicCourse() {
		l.selectBasicCourse();
	}

	@Test
	public void testFunctionality1() {
		l.gridGate();
	}

	@Test
	public void testFunctionality2() {
		l.frameDungeon();
	}

	@Test
	public void testFunctionality3() {
		l.dragAround();
	}

   @Test
	public void testFunctionality4()
	{
		l.popUpWindow();

	}

	@Test
	public void testFunctionality5() {
		l.addCookie();
	}
}

package com.rapidftr.controllers;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.rapidftr.screens.CustomScreen;
import com.rapidftr.screens.UiStack;

public class ControllerTest {

	private CustomScreen screen;
	private UiStack uiStack;
	private Controller controller;

	@Before
	public void setUp() {
		screen = mock(CustomScreen.class);
		uiStack = mock(UiStack.class);
		controller = new Controller(screen, uiStack) {
		};
	}

	@Test
	public void shouldSetControllerOnScreenInstance() {
		verify(screen).setController(controller);
	}

	@Test
	public void shouldPushScreenToUiStack() {
		controller.show();
		verify(uiStack).pushScreen(screen);
	}

}

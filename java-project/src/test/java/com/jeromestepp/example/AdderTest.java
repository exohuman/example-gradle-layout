package com.jeromestepp.example;

import org.junit.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class AdderTest {

    private Adder adder;

    public AdderTest() {
    }

    @Before
    public void setUp() {
	adder = new Adder();
    }

    @Test
    public void shouldAddTwoNumbersTogether() {
	assertThat(adder.add(2, 3), is(5));
    }
}

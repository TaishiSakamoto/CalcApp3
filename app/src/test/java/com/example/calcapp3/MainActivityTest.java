package com.example.calcapp3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    private MainActivity mainActivity;

    @Before
    public void setUp() throws Exception {
        mainActivity = new MainActivity();
    }

    @Test
    public void calcNum() {
        assertEquals(20,mainActivity.calcNum(10,10));
    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testOldEnough() {
        Assertions.assertTrue(App.oldEnough(16));
        Assertions.assertFalse(App.oldEnough(15));
        Assertions.assertTrue(App.oldEnough(33));
    }
}
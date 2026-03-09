package com.sidhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    public void testApp() {
        App app = new App();
        assertTrue(app.test());
    }
}

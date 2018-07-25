package it.badelt.playground;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleAppTest {

    public SimpleAppTest() {
    }

    @Test
    public void testSayHello() {
        SimpleApp app = new SimpleApp("to me");
        assertEquals("Hello to me!", app.sayHello());
    }
}
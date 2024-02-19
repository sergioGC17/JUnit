package org.example.E12.Tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.example.E12.Tags.ComponenteA.operacionA;
import static org.example.E12.Tags.ComponenteB.operacionB;
import static org.junit.jupiter.api.Assertions.*;



public class TestTags {

    @Test
    @Tag("ComponenteA")
    public void testOperacionA() {
        assertEquals("Resultado de operación A", operacionA("A"));
    }

    @Test
    @Tag("ComponenteB")
    public void testOperacionB() {
        assertEquals(42, operacionB(2));
    }
}
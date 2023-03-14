package com.example.au_demo_live;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedListTest {
    private LinkedList<Integer> list;

    @BeforeEach
    void setup(){
        list = new LinkedList<>();
    }
    @Test
    @DisplayName("Given the index is negative, getElement() should throw RuntimeException")
    public  void theGetElement_shouldThrowEceptionOnNegativeIndex(){
//        final var list = new LinkedList<Integer>();
        assertThrows(RuntimeException.class, ()-> list.getElement(-1));
    }
    @Test
    @DisplayName("Given a valid index, getElement() should return the value")
    void testGetElement_shouldReturnElementOnValidIndex(){
//        final var list = new LinkedList<Integer>();

        list.addElement(10);
        assertEquals(10,list.getElement(0));
    }

    @Test
    @DisplayName("Given index greater than the size of the list, getElement()")
    void testGetElement_shouldThrowsExceptionOnINdexGreaterThanSize(){
//        final  var list = new LinkedList<Integer>();
        list.addElement(10); //index 0
        list.addElement(20); //index 1
        final var exception = assertThrows(RuntimeException.class,()->list.getElement(2));
        assertEquals("Index greater than the size of the list", exception.getMessage());
    }
}



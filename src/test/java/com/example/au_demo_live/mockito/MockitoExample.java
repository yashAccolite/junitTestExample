package com.example.au_demo_live.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoExample {

    @Test
    public void testLinkedListGetElement(){
        final var list  = Mockito.mock(java.util.LinkedList.class);
        when(list.size()).thenReturn(10);
        assertEquals(10,list.size());
    }

    @Test
    public void testLinkedListGetElement_ThrowException(){
        final var list = Mockito.mock(java.util.LinkedList.class);
        when(list.add(anyString())).thenThrow(new RuntimeException("You can not insert"));

        assertThrows(RuntimeException.class, ()-> list.add("Sam"));
    }

    @Test
    public void testLinkedListGetElement_ThrowException_testAnyString(){
        final var list = mock(java.util.LinkedList.class);
        when(list.add("john")).thenThrow(new RuntimeException("you cannot insert"));

        assertThrows(RuntimeException.class, ()-> list.add("john"));

    }
}

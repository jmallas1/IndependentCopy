package test;

import independentcopy.ListReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListReaderTest {

    ListReader lr;

    @BeforeEach
    void setUp() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Jared was here");
        lr = new ListReader(al);
    }

    @Test
    void readln() {
        assertEquals("Jared was here", lr.readln(), "Can read a line...");
    }
}
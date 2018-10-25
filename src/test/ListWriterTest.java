package test;

import independentcopy.ListWriter;
import independentcopy.Writer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListWriterTest {

    ListWriter lw;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ArrayList<String> al = new ArrayList<String>();
        lw = new ListWriter(al);
    }

    @org.junit.jupiter.api.Test
    void writeln()
    {
        lw.writeln("Jared was here");
        assertEquals(1, lw.getSomeList().size(), "List should have one element");
    }
}
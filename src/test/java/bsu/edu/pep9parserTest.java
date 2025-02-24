package bsu.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class pep9parserTest {

    @Test
    public void testParse() {
        InputStream testProgramStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("testProgram.pep");
        String output = pep9Parser.parser();
        Assertions.assertEquals("D0 00 48 F1 FC 16 D0 00 69 F1 FC 16 00", output);
    }
}
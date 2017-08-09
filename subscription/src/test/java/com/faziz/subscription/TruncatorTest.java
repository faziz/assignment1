package com.faziz.subscription;

import org.junit.Test;
import static org.junit.Assert.*;

public class TruncatorTest {
    
    public TruncatorTest() {
    }

    @Test
    public void testInputIsLargerThanLimit() {
        String input = "123456789012345678901234567890";
        Integer limit = 5;
        
        Truncator truncator = new Truncator();
        String truncated = truncator.truncate(input, limit);
        
        assertEquals("12 ... (truncated) ... 90", truncated);
    }
    
    @Test
    public void testInputIsSmallerThanLimit() {
        String input = "1234567890";
        Integer limit = 5;
        
        Truncator truncator = new Truncator();
        String truncated = truncator.truncate(input, limit);
        
        assertEquals(input, truncated);
    }
    
    @Test
    public void testInputIsEqualsToLimit() {
        String input = "123456789012345678901234567890";
        Integer limit = 31;
        
        Truncator truncator = new Truncator();
        String truncated = truncator.truncate(input, limit);
        
        assertEquals(input, truncated);
    }
    
    
}

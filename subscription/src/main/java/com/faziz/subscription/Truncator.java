package com.faziz.subscription;

import org.springframework.stereotype.Component;

@Component
public class Truncator {

    private static final String TRUNCATED = "... (truncated) ...";
    
    public String truncate(String input, int limit) {
        String result = String.format("%s %s %s", firstTwo(input), TRUNCATED, lastTwo(input));

        if( result.length() > input.length() || input.length() < limit){
            result = input;
        }

        return result;
    }
    
    private String firstTwo(String text) {
        return text.length() < 2 ? text : text.substring(0, 2);
    }
    
    private String lastTwo(String text) {
        return text.length() < 2 ? text : text.substring(text.length() -2, text.length());
    }
    
}

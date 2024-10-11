package com.example.project; 
public class StringProblems{ //empty constructor public StringProblems(){} 

// Given a string, return true if it ends in "ly". 
// endsLy("oddly") → true 
// endsLy("y") → false 
// endsLy("oddy") → false 
public boolean endsLy(String x){
    int length = x.length(); 
    String end = x.substring(length - 2); 
    String str = "ly"; 
    if (end.equals(str)) { 
        return true;
    } 
    return false; 
}

// Given two strings, append them together (known as "concatenation")
 // and return the result. However, if the concatenation creates a double-char, 
// then omit one of the chars, so "abc" and "cat" yields "abcat". 
// conCat("abc", "cat") → "abcat" 
// conCat("dog", "cat") → "dogcat" 
// conCat("abc", "") → "abc" 
public String conCat(String s1, String s2){ 
    String lastLetter = s1.substring(s1.length() - 1); 
    String firstLetter = s2.substring(0, 1); 
    if (lastLetter.equals(firstLetter)){
        return (s1.substring(0, s1.length() - 1)) + s2; 
    } else { 
        return s1 + s2; } 
    } 

    
    
    
}
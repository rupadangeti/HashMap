package com.core.string;
import java.util.HashMap;

public class FirstRepeatedCharacter {

	
	public static Character getCharacter(String input){
        //remove all the spaces
        input = input.replaceAll(" ", "");
        Character rptChar = null;
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i <input.length(); i++) {
            Character chr = input.charAt(i);
            if(map.containsKey(chr)){
                map.put(chr,map.get(chr)+1);
            }else{
                map.put(chr, 1);
            }
        }
        
        for (int i = 0; i <input.length() ; i++) {
            if(map.get(input.charAt(i))>1){
                rptChar = input.charAt(i);
                break;
            }
        }
        return rptChar;
    }

    public static void main(String[] args) {
        String input = "Apple";
        String input2 = "madam";
        
        
        Character result = getCharacter(input);
        Character result2 = getCharacter(input2);
        if(result!=null){
            System.out.println("First Repeating Character in '"+input+"' is: " + result);
            System.out.println("First Repeating Character in '"+input2+"' is: " + result2);
        }else{
            System.out.println("No Repeating Character found");
        }
    }
}


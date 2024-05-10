package com.javaClass;

import java.util.HashMap;
import java.util.Stack;

public class StringHelper {
	
	
	public boolean isValidParantheses(String str) {
		
		HashMap<Character, Character> map = new HashMap();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');       
		
		Stack<Character> stack = new Stack();
		
		
		for(int i= 0; i < str.length(); i++) {
			
			
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				
				if(stack.pop()!=map.get(ch)) return false;
				
				
			}else {
				
				
				stack.push(ch);
			}
			
			
			
		}
		
		
		return stack.empty();
		
	}

}

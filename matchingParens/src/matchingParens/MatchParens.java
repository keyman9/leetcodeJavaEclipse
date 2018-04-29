package matchingParens;

import java.util.Stack;

public class MatchParens {

	public static void main(String[] args) {
		
		String test1 = "[[]]";
		System.out.printf("Testing: %s\n",test1);
		if(isValid(test1)) {
			System.out.printf("%s is valid.\n",test1);
		}
		else {
			System.out.printf("%s is not valid\n", test1);
		}
		
		String test2 = "[[stop]";
		System.out.printf("Testing: %s\n", test2);
		if(isValid("[[stop]")) {
			System.out.printf("%s is valid.\n", test2);
		}
		else {
			System.out.printf("%s is not valid.\n", test2);
		}
		
		String test3 = "()";
		System.out.printf("Testing: %s\n",test3);
		if(isValid(test3)) {
			System.out.printf("%s is valid.\n",test3);
		}
		else {
			System.out.printf("%s is not valid\n", test3);
		}
		
		String test4 = "(){}[]";
		System.out.printf("Testing: %s\n", test4);
		if(isValid(test4)) {
			System.out.printf("%s is valid.\n",test4);
		}
		else {
			System.out.printf("%s is not valid\n", test4);
		}
		
		String test5 = "(]";
		System.out.printf("Testing: %s\n", test5);
		if(isValid(test5)) {
			System.out.printf("%s is valid.\n",test5);
		}
		else {
			System.out.printf("%s is not valid\n", test5);
		}
		
		String test6 = "(((())}";
		System.out.printf("Testing: %s\n", test6);
		if(isValid(test6)) {
			System.out.printf("%s is valid\n", test6);
		}
		else {
			System.out.printf("%s is not valid\n", test6);
		}
		
		String test7 = ")";
		System.out.printf("Testing: %s\n", test7);
		if(isValid(test7)) {
			System.out.printf("%s is valid\n", test7);
		}
		else {
			System.out.printf("%s is not valid\n", test7);
		}
		
		String test8 = ") {";
		System.out.printf("Testing: %s\n", test8);
		if(isValid(test8)) {
			System.out.printf("%s is valid\n", test8);
		}
		else {
			System.out.printf("%s is not valid\n", test8);
		}
		
		String test9 = "[])";
		System.out.printf("Testing: %s\n", test9);
		if(isValid(test9)) {
			System.out.printf("%s is valid\n", test9);
		}
		else {
			System.out.printf("%s is not valid\n", test9);
		}
		
		String test10 = "[)]";
		System.out.printf("Testing: %s\n", test10);
		if(isValid(test10)) {
			System.out.printf("%s is valid\n", test10);
		}
		else {
			System.out.printf("%s is not valid\n", test10);
		}
	}
	
	public static boolean isValid(String s) {
		Stack<String> opening = new Stack<>();
	    if(s.length() == 0 || s == null){
	    	return true;
	    }
	    else{
	    	for(int i = 0; i < s.length(); i++){
	    		String paren = s.substring(i, i+1);
	    		switch(paren) {
	    			//push opening parens to stack
	    			case "[":
	    				opening.push(paren);
	    				break;
	    			case "(":
	    				opening.push(paren);
	    				break;
	    			case "{":
	    				opening.push(paren);
	    				break;
	    			//if it's a closing paren
	    			//peek at a non-empty stack searching for match
	    			case "]":
	    				if(!opening.isEmpty()) {
	    					if(opening.peek().toString().equals("[")) {
	    						opening.pop();
	    					}
	    					else {
	    						opening.push(paren);
	    					}
	    				}
	    				else {
    						opening.push(paren);
    					}
	    				break;
	    			case ")":
	    				if(!opening.isEmpty()) {
	    					if(opening.peek().toString().equals("(")) {
	    						opening.pop();
	    					}
	    					else {
	    						opening.push(paren);
	    					}
	    				}
	    				else {
    						opening.push(paren);
    					}
	    				break;
	    			case "}":
	    				if(!opening.isEmpty()) {
	    					if(opening.peek().toString().equals("{")) {
	    						opening.pop();
	    					}
	    					else {
	    						opening.push(paren);
	    					}
	    				}
	    				else {
    						opening.push(paren);
    					}
	    				break;
	    			default:
	    				break;
	    				
	    		}
	    	}
	    	if(opening.isEmpty()) {
	    		return true;
	    	}
	    	else {
	    		
	    		return false;
	    	}
	    }
	}

}

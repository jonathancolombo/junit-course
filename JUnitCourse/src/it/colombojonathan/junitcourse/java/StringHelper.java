package it.colombojonathan.junitcourse.java;
//comment
public class StringHelper {
	
	//AACD => CD	ACD => CD	CDEF => CDEF
	public String truncateAInFirst2Positions(String str) {
		if(str.length() <= 2)
			return str.replaceAll("A", "");
		
		String first2Chars = str.substring(0,2);
		String stringMinusFirst2Chars = str.substring(2);
		
		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	}
	
	//ABCD => FALSE		ABAB => TRUE	AB => TRUE	A => FALSE					
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {
		if(str.length() <= 1)
			return false;
		if(str.length() == 2)
			return true;
		
		String first2Chars = str.substring(0,2);
		String last2Chars = str.substring(str.length() - 2);
		
		return first2Chars.equals(last2Chars);
	}
	
	

}

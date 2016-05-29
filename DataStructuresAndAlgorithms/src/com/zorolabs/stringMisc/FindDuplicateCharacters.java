package com.zorolabs.stringMisc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicateCharacters {
	
	public static void main(String[] args){
		Map<Character,Integer> dupMapper = duplicateFinder("SoccerIsGreat");
		Iterator<Map.Entry<Character, Integer>>  myIt = dupMapper.entrySet().iterator();
		while(myIt.hasNext()){
            Map.Entry<Character, Integer> charEntry = myIt.next();
            if(charEntry.getValue()>1){
                System.out.println("String: "+charEntry.getKey()+"  Value: "+charEntry.getValue());
   }
		}
		
	}
	
	static Map<Character, Integer> duplicateFinder(String st){
		char[] arr = st.toCharArray();
		Map<Character,Integer> dupMapper = new HashMap<Character, Integer>(); 
		for(Character ch: arr){
			
			dupMapper.put(ch, dupMapper.containsKey(ch) ? dupMapper.get(ch)+1:1);

		}
		return dupMapper;
		
	}
	
	

}

package com.zorolabs.stringMisc;

public class RemoveDuplicates {
	
	
public static void main(String[] args){
	
	String temp = "ddaalamera";
	char[] str = temp.toCharArray();
	removeDuplicates(str);
	System.out.println(str);
	
//	String stt = "2.0.3";
//	System.out.println(stt.indexOf('.'));
	
	
	
}

public static void removeDuplicates(char[] str){
	
	if(str == null)
		return;
	int len = str.length;
	if (len <2) return;
	
	int tail= 1;
	
	for(int i=1;i<len;++i){
		int j;
		for(j=0;j<tail;++j){
			if(str[i] ==str[j])
				break;
		}
		if (j == tail) {
			str[tail] = str[i];
			++tail;
		}
		
	}
	str[tail] =0;
	
	
}

}

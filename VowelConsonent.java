package com.masai;

public class VowelConsonent {

	
	String l = "abcdefghijklmnopqrstuvwxyz";
	
	String u = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	void check(char x){
		
		boolean flag = false;
		
		for(int i=0; i<26; i++) {
			
			if(x == l.charAt(i) || x == u.charAt(i)) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Enter valid character");
		}
		else {
				
			if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
			{
				System.out.println("Character is Vowel");
			}
			else{
				System.out.println("Character is Consonent");
			}

		}
	}
	
	public static void main(String[] args) {
		
		VowelConsonent x = new VowelConsonent();
		
		x.check('h');
		x.check('i');
		x.check('$');
		
	}
	
}

/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
import java.lang.StringBuilder;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		System.out.println("Here's your word in pig latin: ");
		int newIndex = 0;
		while (newIndex<sentence.length()){
			
			int index = sentence.indexOf(" ", newIndex);
			if (index == -1){
				index = sentence.length();
			}
			String word = sentence.substring(newIndex, index);
			String firstLetter = (word.substring(0, 1)).toLowerCase();
			String secondLetter = (word.substring(1,2)).toLowerCase();
			if (firstLetter.equals("a")||firstLetter.equals("e")||firstLetter.equals("i")||firstLetter.equals("o")||firstLetter.equals("u")){
				word=word+"-way";
			
			}
			else if (secondLetter.equals("a")||secondLetter.equals("e")||secondLetter.equals("i")||secondLetter.equals("o")||secondLetter.equals("u")){
				word = word.substring(1)+"-"+word.substring(0,1)+"ay";
		
			}
			else {
				word = word.substring(2)+"-"+word.substring(0,2)+"ay";
				
			}
			System.out.print(word+" ");
			newIndex = index+1;
		}
		
	
		}
	}


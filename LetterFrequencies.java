/*
 * Activity 2.4.4
 */
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";

		System.out.println("The following shows the letter frequencies for the phrase");
		

    /* your code here */
	
		for(int i = 0; i < 26; i++)
		{
			String letter = letters.substring(i,i+1);
			int counter = 0;

			for(int j = 0; j < phrase.length(); j++){
				
				String speech = phrase.substring(j,j+1);

				if(letter.equals(speech)){
					counter +=1;
				}
			}

			System.out.println("There are " + counter +  " " + letter );

		}
	}
	
	}

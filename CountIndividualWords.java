package assignment1;
import algs4.*; 
/* 
* <Tsvety Sotonov>
*<Count Individual Words>
*/
public class CountIndividualWords 
{

	public static void main(String[] args) 
	{
		
		StdIn.fromFile("data/tale.txt");
		BinarySearchST<String, Integer> wordCountTest = new BinarySearchST<String, Integer>();
		String[] words = StdIn.readAllStrings();
		int count = 0; 
		
		for (int i = 0; i < words.length; i++) 
		{
		String w = words[i].toLowerCase(); 
		if (!wordCountTest.contains(w))
			wordCountTest.put(w, 1);
		}
		
		for(String s : wordCountTest.keys())
			count++; 
		StdOut.println("There are " + count + " individual words in the file.");
	}
}
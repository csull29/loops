/*
 *ReverseApp.java
 *@author C Sullivan
 *18th April 2017
 */
 import javax.swing.JOptionPane;
 public class ReverseApp{
	 public static void main(String args[]){
		 String word;
		 int len;

		 word = JOptionPane.showInputDialog(null, "Enter a word");
		 len = word.length();

		 for(int i= len-1; i >= 0; i = i -1){
			 System.out.println(word.charAt(i));
		 }


	 }
 }
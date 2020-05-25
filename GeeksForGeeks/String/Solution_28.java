import java.util.*;
class GFG { 
  
// utility function to check for vowel 
    static boolean isVowel(char c) { 
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U'); 
    } 
  
// Function to reverse order of vowels 
static String reverseVowel(String str) { 
    // Start two indexes from two corners 
    // and move toward each other 
    int i = 0; 
    int j = str.length()-1; 
    char[] str1 = str.toCharArray(); 
    while (i < j) 
    { 
        if (!isVowel(str1[i])) 
        { 
            i++; 
            continue; 
        } 
        if (!isVowel(str1[j])) 
        { 
            j--; 
            continue; 
        } 
  
        // swapping 
        char t = str1[i]; 
        str1[i]= str1[j]; 
        str1[j]= t; 
          
  
        i++; 
        j--; 
    } 
    String str2 = String.copyValueOf(str1); 
    return str2; 
} 
  
// Driver function 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
     	sc.nextLine();
		for(int i=1;i<=T;i++){
		    String s =sc.nextLine();
        System.out.println(reverseVowel(s)); 
		}
    } 
} 
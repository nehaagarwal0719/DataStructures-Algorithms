 public static void reverseWords(String sd) {

        String s[] = sd.split("\\."); 
        String ans = ""; 
        for (int i = s.length - 1; i >= 0; i--) { 
            ans += s[i] + "."; 
        } 
        System.out.print(ans.substring(0, ans.length() - 1)); 
    }
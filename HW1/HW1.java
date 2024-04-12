package HW1;

class HW1 {
    public boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length()-1;
        //char character;
        //int ascii;

        while(start<last){
            char charFirst = s.charAt(start);
            char charLast = s.charAt(last);
            if(!Character.isLetterOrDigit(charFirst)){
                start++;
        }
            else if(!Character.isLetterOrDigit(charLast)){
                last--;
        }
            else{
                if(Character.toLowerCase(charFirst) != Character.toLowerCase(charLast)){
                    return false;
            }
            start++;
            last--;
}
    
}
return true;
}
}
        
    
/*     
    public boolean isPalindrome(String s) {
        s.toLowerCase();
        s.replace(" ", "");
        int lengthOfString = s.length();
        char character;
        int ascii;

        for(int i = 0; i<lengthOfString; i++)
            character = s.charAt(i);
            ascii = int(character)
            if(!(ascii>=97 && character<=122)){
                
                s.deleteCharAt(i);
            }

        
        for(int i = 0; i<lengthOfString/2; i++)
            if(!(s.charAt(i) == s.charAt(lengthOfString-i-1))){
                return false;
            }
        return true;
    }
} 
}            
        for(int i = 0; i<s.length(); i++)
            int character = s.charAt[i];
            if(!(character>=97 && character<=122)){
                s.replace()
            }
        */    
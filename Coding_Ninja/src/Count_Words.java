
public class Solution {

	public static int countWords(String str) {	 
        if(str.length() == 0)
            return 0;
     int spaceCount = 0;
     for (char c : str.toCharArray()) {
         
     if (c == ' ') {
         spaceCount++;
    }
       

}

        return spaceCount+1;
	}
}



`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````


public class Solution {

	public static int countWords(String str) {	 
        if(str.length() == 0)
            return 0;
     int spaceCount = 0;
     for (char c : str.toCharArray()) {
         
     if (c == ' ') {
         spaceCount++;
    }
       

}

        return spaceCount+1;
	}
}

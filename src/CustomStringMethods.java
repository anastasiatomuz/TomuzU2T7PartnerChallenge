public class CustomStringMethods {
    public CustomStringMethods(){}


    /* Client provides searchFor and searchIn and method returns true if searchFor
              is located somewhere in searchIn , and returns false otherwise.

              For example, if searchFor is ple and searchIn is apples, this method returns true.
              If searchFor is hello and searchIn is apples, this method returns false.
     */
    public boolean foundIn(String searchFor, String searchIn) {
        int ind = searchIn.indexOf(searchFor);
        if (ind != -1){
            return true;
        }else{
            return false;
        }
    }

    /* Client provides myString and maxLength and method returns true if the length of myString
            exceeds maxLength, and returns false otherwise.

            For example, if myString is apples and maxLength is 5, this method returns true.
            if myString is apples and maxLength is 6, this method returns false.
      */
    public boolean longerThan(String myString, int maxLength) {
        int len = myString.length();
        if (len > maxLength){
            return true;
        }else{
            return false;
        }
    }

    /* Client provides str and idx and method returns a new String created by appending
            the character located at index idx of str to the beginning of str and the end of str

             For example, if str is apples and idx is 4, this method returns the string eapplese
             If str is apples and idx is 0, this method returns the string aapplesa
   */
    public String funnyString(String str, int idx) {
        String word = str;
        int index = idx;
        String letter = word.substring(index, index + 1);
        return letter + word + letter;
    }

    /* Client provides a single word as orig and the method returns a String that represents orig
              written in “Pig Latin”, which means that the first letter of the word is removed from the front and
              added to the end, and then “ay” is appended.

              For example, if orig is bananas, then the method returns the “Pig Latin” version, ananasbay
    */
    public String pigLatin(String orig) {
        String word = orig;
        String letter = word.substring(0, 1);
        int wordLength = word.length();
        String shortenedWord = word.substring(1, wordLength);
        return shortenedWord + letter + "ay";
    }

    public String starBetween(String str){
        String newStr = "";
        int strLen = str.length();
        int i = 0;
        while (i != (strLen - 1)){
            String newChar = str.substring(i,i + 1);
            newStr += newChar;

            if (i != (strLen - 1)){
                newStr += "*";
            }
            i ++;
        }
        return newStr.substring(0,newStr.length() - 1);
    }









    /**Client provides two strings, str1 and str2,and method prints a message to the user that states
     whether str1 comes before str2, comes after, or they are the same alphabetically.
     This method has no return value (void).

     Example:  if str1 is "apple" and str2 is "banana", this method should print a message like:
     "apple comes BEFORE banana alphabetically"
     Example:  if str1 is "banana" and str2 is "apple", this method should print a message like:
     "banana comes AFTER apple alphabetically"
     Example:  if str1 and str2 are both "apple", this method should print a message like:
     "apple and banana are the SAME string!"
     */
    public void alphabetical(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " comes BEFORE " + str2 + " alphabetically.");
        } else {
            if (str1.compareTo(str2) > 0) {
                System.out.println(str2 + " comes BEFORE " + str1 + " alphabetically.");
            } else {
                System.out.println(str1 + " and " + str2 + " are the same thing");
            }
        }
    }

    /**Client provides myString and the method returns a String that represents mystring
     with its halves reversed; for example, for the string: "reverse me!" the method would
     return  "e me!revers"; strings of odd length should have the extra character be a part
     of the second half when initially halved (and appear in the first half in the returned String).
     */
    public String halvesReversed(String myString) {
        String firstHalf = myString.substring(0, myString.length()/2);
        String secondHalf = myString.substring(myString.length() /2);
        return secondHalf + firstHalf;
    }

    //       The method below will require the use of  String methods toLowerCase() and toUpperCase,
    //        neither of which are required on the AP Exam but both are very useful Java methods to know.
    //        Look them up in the Java API docs to see how they work!

    /**Client provides myString and this method should return a String with all characters in myString
     in uppercase if the first letter of myString is an uppercase letter.  If the first letter of myString is a
     lowercase letter, this method should return a String with all characters in myString in lowercase.
     You can assume myString will always begin with a letter (and not a number or some other character).

     Example:  If myString is "Hello James!", this method returns the String  "HELLO JAMES!"
     because the first letter of myString , "H", is an uppercase letter.
     Example:  If myString is "hello James!", this method returns the String  "hello james!"
     because the first letter of myString, "h", is a lowercase letter.
     */
    public String yellOrWhisper(String myString) {
        if (myString.substring(0,1).compareTo("a") < 0) {
            return myString.toUpperCase();
        } else {
            return myString.toLowerCase();
        }
    }


    /**Client provides myString and the method returns a new String with the last numToCap characters in
     uppercase, if not already; if myString has less than numToCap characters, uppercase the entire
     String. Any punctuation marks at the end should count towards numToCap.

     Example:  If myString is "hello" and numToCap is 3, this method returns the String  "heLLO"
     Example:  If myString is "hello" and numToCap is 6, this method returns the String  "HELLO"
     Example:  If myString is "Gigantic" and numToCap is 3, this method returns the String
     "GiganTIC"
     Example:  If myString is "Gigantic!!" and numToCap is 3, this method returns the String
     "GigantiC!!"
     */
    public String endUp(String myString, int numToCap){
        int len = myString.length();
        if (len < numToCap) {
            return myString.toUpperCase();
        }
        String sub1 = myString.substring(0,len - numToCap);
        String sub2 = myString.substring(len - numToCap);
        return sub1 + sub2.toUpperCase();
    }

    /**Client provides myString and removeIdx and method returns a new String with the character
     located at removeIdx in myString removed.  If removeIdx is outside the bounds of myString,
     the method should return myString unchanged.

     Example:  If myString is "Halloween" and removeIdx is 5, this method should the String
     "Halloeen"
     Example:  If myString is "Halloween" and removeIdx is 0, this method should the String
     "alloween"
     Example:  If myString is "Halloween" and removeIdx is 9 (outside the bounds of myString),
     this method should return the String "Halloween" (the original myString unchanged).
     */
    public String removeCharacter(String myString, int removeIdx) {
        if (myString.length() <= removeIdx){
            return myString;
        }
        if (removeIdx < myString.length())  {
            String sub1 = myString.substring(0, removeIdx);
            String sub2 = myString.substring(removeIdx + 1);
            return sub1 + sub2;
        }
        return "";
    }

    /**Client provides orig, insertText, and searchStr, and the method returns a new String where
     insertText has been inserted into orig starting at the index where searchStr is first found in
     orig, "pushing” all characters that come after insertIdx in orig behind insertText.
     In the event insertText is not found in orig, append insertText onto the end of orig and
     return that String.

     Example:  If myString is "ghost", insertText is  "BOO!", and searchStr is "o",
     this method would return the String "ghBOO!ost" (since in orig, searchStr is found at index 2).
     Example:  If myString is "ghost", insertText is  "BOO!", and searchStr is "st",
     this method would return the String "ghoBOO!st" (since in orig, searchStr is found at index 3).
     Example:  If myString is "ghost", insertText is  "BOO!", and searchStr is "m",
     this method would return the String "ghostBOO!" (since searchStr is not found in orig).
     */
    public String insertAt(String orig, String insertText, String searchStr) {
        int ind = orig.indexOf(searchStr);
        if (ind == -1){
            return orig + insertText;
        }
        String sub1  = orig.substring(0, ind);
        String sub2 = orig.substring(ind);
        return sub1 + insertText + sub2;
    }



}
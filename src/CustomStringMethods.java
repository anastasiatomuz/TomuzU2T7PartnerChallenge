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
}

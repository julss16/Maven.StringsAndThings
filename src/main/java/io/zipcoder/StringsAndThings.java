package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {


        char y, z;
        int counter = 0;

        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i) == 'z' || input.charAt(i) == 'y') {
                //if (i < input.length() - 1 && !Character.isLetter(input.charAt(i + 1)))

                counter++;
                if (counter == 2) {
                    break;
                }


            }

        }
        return counter;

    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {

        String newStr;
        newStr = base.replace(remove, "");


        return newStr;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return False
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {

        String is = "is";
        String not = "not";
        int count = 0;
        int count2 = 0;
        int index = 0;
        int index1= 0;


        for (int i = 0; i <= input.length(); i++) {
            index = input.indexOf("is", index + 1);


            if (index != -1)


                count++;

            //if (input.contains(in))
            //count++;
            //lastIndex += 1;
        }

        for (int j = 0; j <= input.length(); j++) {

            //if (input.contains(not))
            index1 = input.indexOf("not", index1 + 1);
            //count2++;
            if (index1 != -1)
                count2++;
        }
        if (count == count2) {

            return true;
        } else {

            return false;

        }

    }





            /**
             * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
             * Return true if all the g's in the given string are happy.
             * example : gHappy("xxggxx") // Should return  true
             *           gHappy("xxgxx") // Should return  false
             *           gHappy("xxggyygxx") // Should return  false
             */
    public Boolean gIsHappy (String input) {


        String happy = "gg";
        int index = 0;

        for (int i = 0; i <= input.length(); i++) {
            index = input.indexOf("gg" , index + 1);


        }  if (index != -1)


                return true;

            else {


                return false;
            }
        }



        /**
         * We'll say that a "triple" in a string is a char appearing three times in a row.
         * Return the number of triples in the given string. The triples may overlap.
         * example :  countTriple("abcXXXabc") // Should return 1
         *            countTriple("xxxabyyyycd") // Should return 3
         *            countTriple("a") // Should return 0
         */
        public Integer countTriple (String input){
            char [] t= input.toCharArray();
            //String newStr = String.valueOf(t);
            int count = 0;
            //int index= 0;




            for (int i =0; i <= input.length()-3; i++){

                //index = input.indexOf(newStr, index +1);


                if (t[i] == t[i+1] && t[i]== t[i+2]){

                    count++;

                }

            }


            return count;
        }}

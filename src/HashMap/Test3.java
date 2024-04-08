package HashMap;
/*
A sentence is made up of a group of words.
        Each word is a sequence of letters, ('a'-'z', 'A'-'Z'), that may contain one or more hyphens and may end in a punctuation mark:
        period (.), comma (,), question mark (?), or exclamation point (!). Words will be separated by one or more white space characters.
        Hyphens join two words into one and should be retained while the other punctuation marks should be stripped.
        Determine the number of words in a given sentence.

        Function Description
        Write a function howMany which has the following parameter(s):
        sentence: a string
        Returns:
        int: an integer that represents the number of words in the string
        Constraints
        0 < length of s ≤ 105


        ===================================================================================================================
        ==========================================================================================================================================

        Example 1

        s = 'How many eggs are in a half-dozen, 13?'
        Returns 7
        Explanation:
        The list of words in the string is ['How', 'many', 'eggs', 'are', in', 'a', 'half-dozen'].
        Notice that the numeric string, '13', is not a word because it is not within the allowed character set.

        Example 2

        s = 'he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?'
        Returns 21
        Explanation:
        The substring '865' is not a word, so is not included in the count.
        The hyphenated words 'test-cases' and 'Done-done' each count as 1 word.
        The total number of words in the string is 21.

        Example 3

        s = 'jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.'
        Returns 21
        Exaplanation:
        Note that the substring 'bf[l' is not a word because of the invalid character.
        Other substrings that are not words are '878', '7475' and '748'.
        The total number of words in the string is 21. */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        String str = "jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.";
        String st[]= str.split(" ");
int count=0;
int count2=0;
        for(int i=0;i<st.length;i++)
        {
          Pattern pattern = Pattern.compile("[A-Za-z]");
            Matcher m = pattern.matcher(st[i]);
       if(m.find()){
           System.out.println(st[i]);
           for(int j=0;i<st[i].length()-1;j++)
           {
               Pattern pattern2 = Pattern.compile("[A-Za-z]");
               Matcher m2 = pattern2.matcher(st[i]);
               if(m2.find())
               {
                   System.out.println();
                   count2++;
               }
           }
           count++;
       }

        }
        System.out.println(count);
        }


    }


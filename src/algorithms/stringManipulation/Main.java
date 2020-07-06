package algorithms.stringManipulation;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] names) {

        usefulJavaMethods();

        System.out.println("\n -----------------Counting vowels:");
        var str = "Hello world";
        int count = StringUtils.countVowels(str);
        System.out.println(count);

        System.out.println("\n -----------------Reversing strings");
        var reversed = StringUtils.reverse(str);
        System.out.println(reversed);

        System.out.println("\n -----------------Reversing words");
        var reversedWords = StringUtils.reverseWords(str);
        System.out.println(reversedWords);

        System.out.println("\n -----------------Checking rotations:");
        //abcd -> dabc -> cdab -> bcda -> abcd
        var str1 = "abcd";
        var str2 = "dabc";
        System.out.println(StringUtils.areRotations(str1, str2));

        System.out.println("\n -----------------Removing duplicates:");
        System.out.println(StringUtils.removeDuplicates(str));

        System.out.println("\n -----------------Most repeated char:");
        System.out.println(StringUtils.getMaxOccuringChar(str));

        System.out.println("\n -----------------Anagram using sorting:");
        str1 = "listen";
        str2 = "silent";
        System.out.println(StringUtils.areAnagrams(str1, str2));

        System.out.println("\n -----------------Anagram using histogramming:");
        System.out.println(StringUtils.areAnagram2(str1, str2));

        System.out.println("\n -----------------Palindrome:");
        str = "madam";
        System.out.println(StringUtils.isPalindrome(str));


    }

    public static void usefulJavaMethods(){
        System.out.println("\n -----------------Useful Java methods:");
        var sentence = "trees are beautiful";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int[] numbers = {2, 1, 3, 5, 9, 7};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] array1 = {1, 5, 3, 4};
        int[] array2 = {1, 5, 3, 4};
        Boolean areEqual = Arrays.equals(array1, array2);
        System.out.println(areEqual);

        // getting the list view of Array:
        String a[] = new String[] { "A", "B", "C", "D" };
        List<String> list1 = Arrays.asList(a);

        Integer[] i = new Integer[]{1,2,3,4,5};
        List<Integer> list2 = Arrays.asList(i);

        Collections.sort(list1);
        Collections.reverse(list1);
    }
}



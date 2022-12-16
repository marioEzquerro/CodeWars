package exercise;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Create_phone_number {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {5,5,2,1,5,4,8,5,7,6}));
    }

    /*
     * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
     * Example:
     * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) => returns "(123) 456-7890"
     * The returned format must be correct in order to complete this challenge.
     * Don't forget the space after the closing parentheses!
     */
    public static String createPhoneNumber(int[] numbers) {
        StringBuffer str = new StringBuffer();
        Arrays.stream(numbers).mapToObj(Integer::toString).forEach(str::append);
        return String.format("(%s) %s-%s", str.substring(0,3),str.substring(3,6),str.substring(6,10));
    }
}

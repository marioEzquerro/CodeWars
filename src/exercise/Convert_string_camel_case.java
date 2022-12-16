package exercise;

import java.util.regex.Pattern;

public class Convert_string_camel_case {
    public static void main(String[] args) {
        System.out.println(toCamelCase("Hello_brother-anakin"));
    }

    /*
    * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
    * The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case,
    * also often referred to as Pascal case). The next words should be always capitalized.
    *
    * > Examples
    * "the-stealth-warrior" gets converted to "theStealthWarrior"
    * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
    */
    public static String toCamelCase(String str){
        return str.replaceAll("[-_][a-z]{1}", str.charAt(str.indexOf(Pattern.compile("[-_][a-z]{1}").flags()));
    }

}

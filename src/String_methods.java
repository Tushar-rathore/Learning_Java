public class String_methods {
    public static void main(String[] stringsmethod ) {
        String firstmethod = "TestingString";
//        Methods of Strings
        System.out.println("this will show the length of the characters:" + firstmethod.length());
        System.out.println("this will change the characters to uppercase :" +firstmethod.toUpperCase());
        System.out.println("this will change the characters to Lowercase :" +firstmethod.toLowerCase());
        String trimmedstring = "                  Testing-String                    ";
        System.out.println(trimmedstring);
        System.out.println("this will trim :" +trimmedstring.trim());
        System.out.println("this will show substring index start from 0 and start index is included and end index is excluded:" +firstmethod.substring(0,7));
        System.out.println("as clear as crystal the name says it all:"+firstmethod.replace("Test", "test"));
        System.out.println(firstmethod.startsWith("Test"));
        System.out.println(firstmethod.endsWith("Test"));
        System.out.println(firstmethod.charAt(1)); // shows the character in that place
        System.out.println(firstmethod.indexOf("e")); // shows index of the character
        System.out.println(firstmethod.lastIndexOf('i',7));
        System.out.println(firstmethod.equalsIgnoreCase("TestingSTRING")); // ignores case but check the string
        //escape sequence - /
        // /t for tab, /n for newline
        System.out.println("i am trying \" \t \\ \n it  is the " );




    }
}

package day1;

public class StringPractice {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String str ="Java is fun";
        System.out.println(str);
        int c =0;
        for (int i = 0; i <str.length() ; i++) {
            if((str.charAt(i)+"").equals("a")){
               c++;

            }

        }
        System.out.println(c);
    }
}

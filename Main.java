package k1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_numbers= scanner.nextInt();
        scanner.nextLine();
        String list_of_numbers=scanner.nextLine();
        int loop_counter=0;
        int expecting_number=1;
        while(expecting_number<number_of_numbers){
            int number_of_digits=String.valueOf(expecting_number).length();
            String currentNumberAsString=list_of_numbers.substring(loop_counter,loop_counter+number_of_digits);
            int currentNumber=Integer.parseInt(currentNumberAsString);
            if((expecting_number)!=currentNumber){
                System.out.println((expecting_number));
                return;
            }
            expecting_number++;
            loop_counter+=number_of_digits;
        }
        System.out.println(number_of_numbers);
    }
}

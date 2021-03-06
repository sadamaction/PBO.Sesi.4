
import java.util.Scanner;
/**
 *
 * @author M. Sadam Fadilah
 */
public class No2 {

    public static void main(String[] args) {
    int angka;
    int closestPalindrome;
    Scanner input = new Scanner(System.in);

    System.out.print("Input : ");
    angka = input.nextInt();

    if (angka <= 10) {
      closestPalindrome = 11;
    }

    closestPalindrome = findClosestPalindrome(angka);
    System.out.println("Palindrom Terdekat : " + closestPalindrome);
  }

  
  public static int findClosestPalindrome(int number) {
    int closestPalindrome = 0;

    while (!isPalindrome(number)) {
      number++;
    }

    return number;
  }

  public static boolean isPalindrome(int number) {
    int reversedNumber = reverseNumber(number);
    return reversedNumber == number;
  }

  public static int reverseNumber(int number) {
    int reversedNumber = 0;

    while (number != 0) {
      int remainNumber = number % 10;
      reversedNumber = reversedNumber * 10 + remainNumber;
      number = number / 10;
    }

    return reversedNumber;
  }
    
}

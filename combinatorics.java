//This file is a user-input calculator for combinatorics
//General statistics notation used: n is used to mean the number of items in the set to choose from and k is the number of elements being chosen
import java.util.Scanner;

class combinatorics{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    boolean keepGoing = true;
    while( keepGoing ){
      //ask and access each method
      System.out.println("What calculation would you like to perform? (respond with digit) ");
      System.out.println( "1: Permutation "); System.out.println( "2: Variation "); System.out.println( "3: Combination");
      System.out.println( "4: Permutation w/ Repeats"); System.out.println( "5: Variation w/ Repeats"); System.out.println( "6: Combination w/ Repeats");
      int choice = s.nextInt();
      System.out.println( "How many items are there to choose from? (n) ");
      int user_n = s.nextInt();
      //if( choice != 1 || choice != 4 ){
          System.out.println( "How many items are you choosing? (k) ");
          int user_k = s.nextInt();
      //}
      if( choice == 1 ){ System.out.println( permutation(user_n) + " ways");}
      else if( choice == 2){System.out.println( variation(user_n, user_k) + " ways"); }
      else if( choice == 3){System.out.println( combination(user_n, user_k) + " ways"); }
      //else if( choice == 4){System.out.println( permutationRepetition(user_n, user_k) + " ways"); }
      else if( choice == 5){System.out.println( variationRepetition(user_n, user_k) + " ways"); }
      else if( choice == 6){System.out.println( combinationRepetition(user_n, user_k) + " ways"); }
      else { System.out.println("Invalid choice"); }
      //Ask user if they want to computer more combinatorics
      System.out.println("Would you like to perform another calculation? (y or n)" );
      char cont = s.next().charAt(0);
      if( cont == 'n' ){
        keepGoing = false;
      }
    }
  }
  //This function returns the int factorial product of the inputed integer
  public static int factorial(int x){
    if( x == 0 ){
      return(1);
    }
    if( x != 1 ){
      x = x * factorial(x-1);
    }
    return( x );
  }

  public static int permutation(int n){
    return( factorial(n) );
  }

  public static int variation(int n, int k){
    return( factorial(n)/factorial(n-k) );
  }

  public static int combination(int n, int k){
    return( variation(n,k) / factorial(k) );
  }

  public static int variationRepetition(int n, int k){
    return( n^k );
  }

  public static int combinationRepetition(int n, int k){
    return( variation(n+k-1,k) );
  }

}

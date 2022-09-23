import java.util.Scanner;
class CompoundInterest {
   public static void main (String args[]){
      double principle, rate, time, compound_interest;
      Scanner my_scanner = new Scanner(System.in);
      principle = my_scanner.nextInt();
      rate = my_scanner.nextInt();
      time = my_scanner.nextInt();
      compound_interest = principle * (Math.pow((1 + rate / 100), time));
      System.out.format("%.2f",compound_interest);
   }
}
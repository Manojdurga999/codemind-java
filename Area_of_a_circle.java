import java.util.Scanner;
class AreaOfCircle {
   public static void main(String args[]){
      int radius;
      double area;
      Scanner sc = new Scanner(System.in);
      radius = sc.nextInt();
      area = (radius*radius)*3.14;
      System.out.format("%.2f",area);
   }
}
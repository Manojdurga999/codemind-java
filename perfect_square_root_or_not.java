import java.util.Scanner;  
class CheckPerfectSquareExample1  
{   
static boolean checkPerfectSquare(double number)    
{   
double sqrt=Math.sqrt(number);   
return ((sqrt - Math.floor(sqrt)) == 0);   
}   
public static void main(String[] args)    
{   
Scanner sc=new Scanner(System.in); 
double number=sc.nextDouble();   
if (checkPerfectSquare(number))   
System.out.print("True");   
else  
System.out.print("False");   
}   
}   
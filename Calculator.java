/JAVA/<CALCULATOR>.java

  import java.io.*; 

public class ALL

{
 public static void main(String args[])throws IOException 

 { 
 InputStreamReader isr=new InputStreamReader(System.in); 

 BufferedReader br=new BufferedReader(isr); 

 System.out.println("Enter a number "); 

 int n1=Integer.parseInt(br.readLine()); 

 System.out.println("Enter another number "); 

 int n2=Integer.parseInt(br.readLine()); 

 System.out.println("Enter an operator ");
char op=(char)br.read(); 

 int ans; 

 switch(op) 

 { 
 case '+': ans=n1+n2; 

 System.out.println("Sum = "+ans); 

 break; 

 case '-': ans=Math.abs(n1-n2); 

 System.out.println("Absolute difference = "+ans); 

 break; 

 case '*': ans=n1*n2; 

 System.out.println("Product = "+ans); 

 break; 

 case '/': int g=Math.max(n1,n2); 

 int s=Math.min(n1,n2); 

 if(s!=0) 

 { 
 double q=(double)g/s; 

 System.out.println("Dividing greater by the smaller"); 

 System.out.println("Quotient = "+q); 

 } 

 else 

 { System.out.println("Division by 0 not allowed"); 

 } 

 break; 

 default: System.out.println("Wrong operator"); 

 break; 

 }//switch 

 }//main 

}//class

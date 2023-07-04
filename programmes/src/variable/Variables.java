package variable;

public class Variables {
	 static char a='t'; //static   
	 int i = 100;
	 public static void main(String[] args) {                                                            
	     float b = 5;  //local variable                                                                                  
	     Variables i1 = new Variables() ; //object for instance variable                                 
	     System.out.println(a);  //calling static   variable                                             
	     System.out.println(Variables.a);//another way for calling static variable  by using class name  
	     System.out.println(i1.i); //calling instance variable                                           
	     System.out.println(b);     //calling local  variable  
	 }
}

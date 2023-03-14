package com.eum;

enum Beer
{
	Ko,Fc{
	void m1() {
		System.out.println("dangerous");
	}
	},Rc;
	void m1() {
		System.out.println("normal");
	}
   Beer(){
	   System.out.println("constructor");
   }
@Override
public String toString() {
	     System.out.println("ka bhaiya");
   return super.toString();
	  
}
   
}
public class Test {

	public static void main(String[] args)
	{
      Beer b = Beer.Fc;
      //Internally it print b.tostring
      System.out.println(b);
      Beer[] x= Beer.values();
      
      
      for(Beer x1:x)
      {
    	  System.out.print(x1+" "+x1.ordinal());
    	   x1.m1();
      }
     
     /* switch(b)
      {
      case Ko:
    	  System.out.println("A");
    	  break;
      case Fc:
    	  System.out.println("B"); 
    	  break;
      case Rc:
    	  System.out.println("C");
    	  break;
       default:
    	   System.out.println("default statment");
    	   */
      }
	}
	


	









public class NestedTry {
	  static void throwOne() throws IllegalAccessException {
      	System.out.println("Inside throwOne.");
      	throw new IllegalAccessException("demo");
      	}
	  static void demoproc() {
		// create an exception
		  NullPointerException e = new NullPointerException("top layer");
		  // add a cause
		  e.initCause(new ArithmeticException("cause"));
		  throw e;
	  }
public static void main(String args[]) {
try {
int a = args.length;
 a=2;
int b = 42 / a;
System.out.println("a = " + a);
try { // nested try block

/*if(a==1) 
	a = a/(a-a); // division by zero*/

if(a==2) {
int c[] = { 1 };

c[42] = 99; // generate an out-of-bounds exception
}
} catch(ArrayIndexOutOfBoundsException e) {
System.err.println("Array index out-of-bounds: " + e);
}
} catch(ArithmeticException e) {
System.err.println("Divide by 0: " + e);
}

//Null pointer exception
try {
demoproc();
} catch(NullPointerException e) {
// display top level exception
System.err.println("Caught: " + e);
// display cause exception
System.err.println("Original cause: " + e.getCause());
}
//Number format exception
String str ="123!23";
	        try{
	            float i = Float.valueOf(str); 
	            //float i = Float.parseFloat(str);
                 System.out.println("Value parsed :"+i);
	        }catch(NumberFormatException ex){
                System.err.println("Ilegal input");
	        }
	        
//Illegal Access exception
	     
	        try {
	        	 throwOne();
	        	} catch (IllegalAccessException e) {
	        	System.err.println("Caught " + e);
	        	}
}	

}
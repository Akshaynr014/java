package oops;

public class Polymorpism {
	//compile time and method overloading
     int add(int a,int b) {
    	 return a+b;
     }
     int sub(int a,int b) {
    	 return a-b;
     }
     double add(double a,double b) {
    	 return a+b;
     }
     double sub(double a,double b) {
    	 return a-b;
     }
     public static void main(String[] args) {
		Polymorpism s = new Polymorpism();
		System.out.println(s.add(23,47));
		System.out.println(s.sub(23,47));
	}
}
































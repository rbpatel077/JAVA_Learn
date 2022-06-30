package com.inheritance;

class grandfather{
static	void oldhouse() {
		System.out.println("granfather has old house...");
	}
}

 class father extends grandfather{
	 int a=10;
 	static void newapart() {
	 System.out.println("child buid new house...");
	
 }

 }
public class child extends grandfather  {
	
	void newhouse() {
		System.out.println("child buid new house...");
	}
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	child ch=new child();
	child.oldhouse();
	ch.newhouse();
	father.newapart();
	father.oldhouse();
	for(int i=0; i<=10; i++) {
		System.out.println(i);
	}
	for(int j=10; j>=0; j--) {
		System.out.println("the value of j is decrease..." + j );
	}
	}
 
}

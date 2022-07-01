package com.exception;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 System.out.println("this try and cath ....");
        	 int a=10 / 0 ;
        	 System.out.println("the value of the a is ...."+a);
        	 
         }
         catch (Exception e){
        	 System.out.println("error");
        	 System.out.println(e.getMessage());
        	 
         }
	}

}

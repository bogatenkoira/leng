/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author дом
 */
public class JavaApplication1 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //static class Formula {
	//public static void vivod() {System.out.println("Максим Р.И");}
	
        double s =5.5;
        double o = 3.3;
        System.out.printf("%.2f",s/o);
        
        
        double p = formula(4, 5, 6);
	 //      System.out.println("%.2f", p);
               
        convert();
}

    public static double formula(int a,int b,int c) {
		double  S=1;
		if(a>5)
		     S = a/b - c*5;
		if(a<5)
			 S = Math.cos(b)+ Math.exp(c);
		if(a==5)
			 S = 12 - a;	
		return S;
	}
	
	public static void convert()
	{
		char number='1';
		int inT=(int) number;
		System.out.println("char convert in int " + inT);
		
		double d = (double) inT;
		System.out.println("int convert in double " + d);
	}
	
    
}
	

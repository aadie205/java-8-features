package com.java8.random;

import java.util.function.*;
import java.util.*;

class SupplierDemo{
	public static void main(String agrs[]){

		//Demo Program-1 For Supplier to generate Random Name:

		Supplier<String> s = () -> {
			String[] s1= {"Aditya", "Naveen", "Trisha", "Dinkar", "Soumya"};
			
			int x=(int)(Math.random()*4);
			return s1[x];
		};

		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println("----------");
	

		//Demo Program-2 For Supplier to supply System Date:

		Supplier<Date> s2=() -> new Date();

		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println("----------");
		

		//Demo Program-3 For Supplier to supply 6-digit Random OTP
		
		Supplier<String> s3= () -> {
			String otp="";

			for(int i=0;i<6;i++)
				otp+= (int)(Math.random()*10);

			return otp;
		};

		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println("----------");
	
		
		//Demo Program-4 For Supplier to supply Random Passwords:
		Supplier<String> s4= () -> {
			String symbols="QWERTYUIOPASDFGHJKLZXCVBNM!@#$%_";
			Supplier<Integer> d= () -> (int)(Math.random()*10);
			Supplier<Character> ch = () -> symbols.charAt((int)(Math.random()*32));

			StringBuilder sb= new StringBuilder();
			for(int i=0; i<=8; i++){
				if(i%2==0)
					sb.append(d.get());
				else
					sb.append(ch.get());
			}
			return sb.toString();
		};

		System.out.println(s4.get());
		System.out.println(s4.get());
		System.out.println(s4.get());
		System.out.println(s4.get());
		System.out.println("----------");
	}
}
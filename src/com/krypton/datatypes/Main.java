package com.krypton.datatypes;

public class Main {

   /* public static void main(String[] args) {*//*

       *//**//* int myValue = 1000;

		//wrapper class - Integer
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;

	    System.out.println("Integer min value is: "+ myMinIntValue);
	    System.out.println("Integer max value is: "+ myMaxIntValue);

	    //This concept is called overflow (two larger number in a smaller number) throws garbage.
		System.out.println("Bustervalue is " + (myMaxIntValue+1));

		//This concept is called underflow (two minimum number in a smaller number) throws garbage.
		// Java and version 7 and higher
		int acceptableReadbale = 2_147_483_647;


		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;

		System.out.println("Byte min value is: "+ myMinByteValue);
		System.out.println("Byte max value is: "+ myMaxByteValue);


		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;

		System.out.println("short min value is: "+ myMinShortValue);
		System.out.println("short max value is: "+ myMaxShortValue);

		//long is also

		//challene
		byte challen1 = 33;
		short challShort = 646;

		int test1 = 32423;

		long testLong = 50000 + 10*(challen1+challShort);
		System.out.println(testLong);*//**//*

		//math fiunctions mostly return doubles and more used in libarary hence use double - default for java

		// Challenge Float point

		*//**//*int userInputPounds = 5;
		double onePoundValue = 0.45359237d;
		double convertedValue = userInputPounds * onePoundValue;

		System.out.println("The converted weight in kg is: "+ convertedValue);

		//BigDecimals - precise calculations
		//Appending using String Buffer

		double value1 = 20.0d;
		double value2 = 80.0d;

		double testValues = (value1+value2)*100;

		double remain = testValues % 40;

		boolean challengeValue = (remain == 0) ? true:false;
		System.out.println(challengeValue);
		if (!challengeValue){
			System.out.println("Got some remainder");
		}*//**//*
		// 53 keywords

*//*
    }*/
}

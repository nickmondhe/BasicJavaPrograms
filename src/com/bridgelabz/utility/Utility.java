package com.bridgelabz.utility;

import java.util.Scanner;


public class Utility {
	
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * This method takes an input Float from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The Float which is passed as input to the scanner
	 */
	public float inputFloat() {
		return scanner.nextFloat();
	}
	
	/**
	 * This method takes an input Double from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The double which is passed as input to the scanner
	 */
	public double inputDouble() {
		return scanner.nextDouble();
	}
	
	/**
	 * This method takes an input String from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The string which is passed as input to the scanner
	 */
	public String inputString() {
		return scanner.next();
	}
	
	
	/**
	 * This method takes an input Integer from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The integer which is passed as input to the scanner
	 */
	public Integer inputInteger() {
		return scanner.nextInt();
	}
	

	/**
	 * This method is used to replace the string template with the 
	 * provided input given by the user.
	 * 
	 * @param userName input given by the user
	 * @param template string which needs to be modified
	 * @return output the out string given back to the user
	 */
	
	public String replaceString(String userName, String template) {
		if (userName.length() <= 3)
			return "Please input string with more than 3 characters";
		else {
			String output = template.replace("<<UserName>>", userName);
			return output;
		}
	}
	
	/**
	 * This is method is used to find the Harmonic number input 
	 * given by the user.
	 * 
	 * @param number integer is provided by the user 
	 * @return
	 */
	
	public Integer findHarmonicNumber(Integer number) {
		double result=1;
		while(number>0)
		{
			result=result+(double)1/number;
			number--;
			System.out.println(""+result);
		}
		return 0;
	}

	/**
	 * This method is used to check the leap year
	 * 
	 * @param year integer the user entered 
	 * @return
	 */
	
	public static boolean leapYearCheaker(int year)
	{
		if(year>1000)
		{
		   if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		   {
		       return true;
		   }
		}
		return false;
	}

	/**
	 * This method is used to find the prime factor with the input 
	 * provided by the user.
	 * 
	 * @param number Integer take user input 
	 * @return 
	 */
	
	public Integer primefactor(Integer number) {
		while(number%2==0)
		{
			System.out.println("2");
			number/=2;
		}
		for (int i=3;i<Math.sqrt(number);i+=2)
		{
			while(number%i==0)
			{
				System.out.println(i);
				number/=i;
			}
		}
		if(number>2)
		{
			System.out.println(number);
		}
		return null;
	}
	
	/**
	 * This method is used to calculate  the Windchill which is 
	 * value taken form the user.
	 * 
	 * @param temperature double this taken as a input
	 * @param windspeed double this taken by the user
	 * @return output given by to user as a output
	 */
	
	public double findwindchill(double temperature, double windspeed) {
		
		double output = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windspeed, 0.16);
		
		return output;
	}
	
	/**
	 * This method is used to calculate the number of times a 
	 * player wins and looses in gambling
	 * 
	 * @param stake number that a player have
	 * @param goal number, the player have to make to win
	 * @param chance number of times the player is allowed to play
	 */
	
	public static void calWinLossInGambling(int stake, int goal, int chance) {       
		int win = 0;
		int loss = 0;

		for (int i = 0; i < chance; i++) {
			while (stake < goal && stake > 0 && chance > 0) {
				if (Math.random() >= 0.5)
				{
					stake++;
					win++;
					chance--;
				} 
				else 
				{
					stake--;
					loss++;
					chance--;
				}
			}
		}
		double percentWin = (win * 100) / (win + loss);
		double percentLoss = (loss * 100) / (win + loss);
		System.out.println("the player won " + win + " times.");
		System.out.println("the player lost " + loss + " times.");
		System.out.println("percentage of win is " + percentWin + "%");
		System.out.println("percentage of loss is " + percentLoss + "%");
	}

	/**
	 * This method is used to find the distance of Quadrant
	 * 
	 * @param x1 First quadrant
	 * @param y1 second quadrant
	 * @param x2 third quadrant
	 * @param y2 fourth quadrant
	 * @return output
	 */
	public double finddistance(int x1, int y1, int x2, int y2) {
		
		return Math.sqrt(Math.pow(x1-y1,2)+Math.pow(x2-y2,2)*1.0);	
		
	}

	/**
	 * This function is used to check string Anagram 
	 * 
	 * @param str1 First string from user input
	 * @param str2 Second string for user input
	 */
	
	public void checkAnagram(String str1 ,String str2) {
		 int len, len1, len2, i, j, found=0, not_found=0;
		 len1 = str1.length();
	        len2 = str2.length();
			
	        if(len1 == len2)
	        {
	            len = len1;
	            for(i=0; i<len; i++)
	            {
	                found = 0;
	                for(j=0; j<len; j++)
	                {
	                    if(str1.charAt(i) == str2.charAt(j))
	                    {
	                        found = 1;
	                        break;
	                    }
	                }
	                if(found == 0)
	                {
	                    not_found = 1;
	                    break;
	                }
	            }
	                if(not_found == 1)
	                {
	                	System.out.print("Strings are not Anagram to Each Other");
	                }
	                else
	                {
	                	System.out.print("Strings are Anagram");
	                }
	        }
	        else
	        {
	            System.out.print("Both Strings Must have the same number of Character to be an Anagram");
	        }
	    }

	/**
	 * This function is used to find prime numbers 
	 * between 0 to 1000
	 */
	
	public void findprimenumber() {
		for(int i=0;i<1000;i++)
		{
			boolean isprime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}		
			}
			if(isprime)
			{
				System.out.println(" "+i);
			}
		}
	}

	/**
	 * This method is used to sort the words by using insertion algorithm
	 * 
	 * @param words it given input from user
	 */
	
	public static void insertionsortWords(String[] words) {
		int number=words.length;
		String value;
		int index;
		for (int i=1;i<number;i++)
		{
			char currentcharvalue =words[i].charAt(0);
			value= words[i];
			index=i;

            if(currentcharvalue == words[i - 1].charAt(0))
            {
                while (index > 0 && words[index - 1].charAt(1) > words[index].charAt(1))
                {
                    words[index] = words[index - 1];
                    index = index - 1;
                }
            }
            else
            {
                while (index > 0 && words[index - 1].charAt(0) > currentcharvalue)
                {
                    words[index] = words[index - 1];
                    index = index - 1;
                }
            }
            words[index] = value;
        }
	}
	
	/**
	 * Function is used to merge the elements and separated
	 * into two halves
	 * 
	 * @param array integer taken a array number from the user
	 * @param First integer the number is first element form array
	 * @param mid integer is the middle value of array
	 * @param  Last integer the number is last element from array
	 */
	public void merge(int array[], int First, int mid, int last) 
    { 
         
        int n1 = mid - First + 1; 
        int n2 = last - mid; 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = array[First + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[mid + 1+ j]; 

        int i = 0, j = 0;         
        int k = First; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                array[k] = L[i]; 
                i++; 
            } 
            else
            { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            array[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	
	/**
	 * Function is used to sort the number which is provided
	 * by the user
	 * 
	 * @param array taken as a input from user
	 * @param First integer the number is first element form array
	 * @param Last integer the number is last element from array
	 */
	public void sort(int array[], int First, int last) 
    { 
        if (First < last) 
        { 
            int mid = (First+last)/2; 
            sort(array, First, mid); 
            sort(array , mid+1, last); 
            merge(array, First, mid, last); 
        } 
    } 
	
	/**
	 * Function is used to display the array 
	 * @param array integer taken a array number from the user
	 */
	public static void printArray(int array[]) 
    { 
        int number = array.length; 
        for (int i=0; i<number; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    } 
	
	/**
	 * This function is used to sort the number by using bubbleSort Algorithm
	 * 
	 * @param num integer array provided the value through user
	 */
	public void bubbleSort(int[] num) {
		int n=num.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(num[j]>num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
	}

	/**
	 * This method is used to find the word from the list
	 * using binary search algorithm.
	 *  
	 * @param word String is taken input from user
	 * @param words are string array to store the list 
	 * @param a integer  
	 * @param b integer
	 * @return the middle value from string array
	 */
	
	public int binarysearchWord(String word, String[] words, int a, int b) {
		if(b <= a)
			return -1;
		
		if(b - a == 1)
			return words[a].equals(word) ? a : -1;

		int mid = (a + b)/2;
		
		if(word.compareTo(words[mid]) < 0)
		{
			return binarysearchWord(word, words, 0, mid-1);
		}
		else if(word.compareTo(words[mid]) > 0)
		{
			return binarysearchWord(word, words, mid, b);
		}
		return mid;
	}

	/**
	 * This function is used to find the number which is provided 
	 * input by the user
	 * 
	 * @param array provide the list from the user 
	 * @param first integer first number in an array
	 * @param last integer last number in an array
	 * @param key integer this number you want find  
	 */
	
	public void binarySearchInteger(int[] array, int first, int last, int key) {
		int mid = (first + last)/2;  
		while( first <= last )
		{  
			if ( array[mid] < key )
		    {  
				first = mid + 1;     
		    }
		    else if ( array[mid] == key )
		    {  
		    	System.out.println("Element is found at postion: " + mid);  
		        break;  
		    }
		    else
		    {  
		    	last = mid - 1;  	
		    }  
		    mid = (first + last)/2;  
		}  
		   if ( first > last )
		   {  
		      System.out.println("Element is not found!");  
		   }  
	}
	
	/**
	 * @param requiredAmount the amount which we calculate the change
	 */
	
	public void giveMinimumChange(int requiredAmount) 
	{
		int[] notesAvailable= {1000,500,100,50,10,5,2,1};
		int i=0;
		int count=0;
		int quotient=0;
		while(requiredAmount>=1)
		{
			quotient=requiredAmount/notesAvailable[i];
			if(quotient>0)
			{
				System.out.println(notesAvailable[i]+"Rs. note="+quotient);
				count=count+quotient;
				requiredAmount=requiredAmount%notesAvailable[i];
			}		
			i++;
		}
		System.out.println("minimum number of notes required is ="+count);		
	}

	/**
	 * Function is used to convert temperature Fahrenheit to Celsius
	 *  
	 * @param fahrenheit take user input temperature as a Fahrenheit  
	 */
	public void temperatureinCelsius(double fahrenheit) {
		
		double Celsius=(fahrenheit-32)*5/9;
		System.out.println("The temperature in Celsius :"+Celsius);
	}

	/**
	 * Function is used to convert temperature Celsius to Fahrenheit 
	 *  
	 * @param celsius take user input temperature as a celsius
	 */
	public void temperatureinFahrenheit(double celsius) {
		
		double fahrenheit=(celsius*9/5)+32;
		System.out.println("The temperature in Fahrenheit :"+ fahrenheit);
	}

	
	/**
	 * Function is used to calculate the MonthlyPayment
	 * 
	 * @param principal it is the principal amount
	 * @param numberOfYears it is the number of years in which the user have to earn the repay amount
	 * @param rateOfIntrest it is the rate of interest
	 * @return output final monthly payment
	 */
	public double calmonthlyPayment(double principal, double numberOfYears, double rateOfIntrest) 
	{
		 double payment;
		 double r =rateOfIntrest/(12*100);
		 double months=12 * numberOfYears;
		 payment= (principal*r)/(1-1/(Math.pow((1+r), months)));
		// System.out.println("The Monthly Payment is : "+payment);
		 return payment;
	}
	/**
	 * Function is used to convert decimal to binary
	 * 
	 * @param decimal the decimal number which is converted into binary
	 * @return the binary number which is type of string
	 */
	public static String decimalToBinary(int decimal) 
	{
		String binaryNumberInString="";
		String temporary="";
		int number=decimal;
		while(number>=1)
		{
			binaryNumberInString=binaryNumberInString+number%2;
			number=number/2;
		}
		if(binaryNumberInString.length()>0 && binaryNumberInString.length()<8)
		{
			binaryNumberInString+=giveZero(8-binaryNumberInString.length());
		}
		for(int i=binaryNumberInString.length()-1;i>=0;i--)
		{
			temporary+=binaryNumberInString.charAt(i);
		}
		binaryNumberInString=temporary;
		return binaryNumberInString;
	}
	
	/**
	* @param numberofzeroRequired the number of zero the user needs
	* @return the string value 
	*/
	public static String giveZero(int numberofzeroRequired) {
		String s ="";
		for(int i=0;i<numberofzeroRequired;i++)
		{
			s=s+0;
		}
		return s;
	}

	/**
	 * Function is used to find the day of week in calendar
	 * 
	 * @param month integer is the month of the calendar
	 * @param day integer is the day of the calendar
	 * @param year integer is the year of the calendar
	 * @return output is the day of week 
	 */
	
	public int dayofWeek(int month,int day,int year) {
		
		  int y0 = year - (14 - month) / 12;
	      int x = y0 + y0/4 - y0/100 + y0/400;
	      int m0 = month + 12 * ((14 - month) / 12) - 2;
	      int d0 = (day + x + (31*m0)/12) % 7;
	      return d0;
	}

	/**
	 * Function is used to swap two nibbles 
	 * 
	 * @param decimal integer the number is provided by the user
	 * @return output which are represented as a binary
	 */
	public static int swapNibbles(int decimal) {
		
		return ((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4); 
	}	
	
}

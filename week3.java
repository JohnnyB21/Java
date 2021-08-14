public class week3 {
    public static void main(String[] args) {
    // 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    // a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array 
    //(i.e. do not use ages[7] in your code). Print the result to the console.
    
    System.out.println("Question 1. a)");
        int a = ages[0];
        int b = ages[ages.length -1];
        ages[0] = a - b;
        for ( int i : ages) {
    System.out.println(i);
    }
    //b.	Add a new age to your array and repeat the step above to ensure it is dynamic 
    //(works for arrays of different lengths).
    System.out.println("Question 1. b)");
    int[] newNumber = {32};
    int[] combinedArr = new int[ages.length + newNumber.length];    

    int counter = 0;
    for ( int j : ages) {
        combinedArr[counter] = j;
        counter++;
    }
    for ( int k : newNumber ) {
        combinedArr[counter] = k;
        counter++;
    }

    for ( int h = 0; h < combinedArr.length; h++) {
        System.out.println(combinedArr[h]);
    }
    //c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
    System.out.println("Question 1. c)");
    
    double total = 0;

    for ( int o = 0; o < ages.length; o++) {
        total += ages[o];
    }
    double average = total / ages.length;
    System.out.println("The average of this array is: " + average);

    //Create an array of String called names that contains the following values: 
    //“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

    String[] names = new String[6];
    names[0] = "Sam";
    names[1] = "Tommy";
    names[2] = "Tim";
    names[3] = "Sally";
    names[4] = "Buck";
    names[5] = "Bob";
    //a.	Use a loop to iterate through the array and calculate the 
    //average number of letters per name. Print the result to the console.
    System.out.println("Question 2. a)");
    double letterTotal = 0;
    for (int z = 0; z < names.length; z++) {
        letterTotal += names[z].length();
    }
    double letterAverage = letterTotal / names.length;
    System.out.println("Average number of letters per name: " + letterAverage);

    //b.	Use a loop to iterate through the array again and concatenate all the names together, 
    //separated by spaces, and print the result to the console
     System.out.println("Question 2. b)");
    StringBuffer sb = new StringBuffer();
      for(int i = 0; i < names.length; i++) {
         sb.append(names[i]);
      }
      String str = sb.toString();
      System.out.println(str);
    //5.Create a new array of int called nameLengths. Write a loop to iterate over the previously 
    //created names array and add the length of each name to the nameLengths array
      System.out.println("Question 5");
      int[] nameLengths = {3, 5, 3, 5, 4, 3};
      int length = 0;
      for ( String strn : names) {
        length = strn.length();
        System.out.println(length);
      }
    //6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
    //Print the result to the console.
    System.out.println("Question 6");
    int sum = 0;
    for (int nam : nameLengths) {
        sum += nam;
    } System.out.println(sum);
    //7.Write a method that takes a String, word, and an int, n, as arguments and returns the word 
    //concatenated to itself n number of times. 
    //(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
    System.out.println("Question 7");
    System.out.println(concat("word", 2)); 
    //8.Write a method that takes two Strings, firstName and lastName, and returns a full name 
    //(the full name should be the first and the last name as a String separated by a space).
    System.out.println("Question 8");
    System.out.println(fullName("Josh", "Smith"));
    //9.Write a method that takes an array of int and returns true if the 
    //sum of all the ints in the array is greater than 100.
    System.out.println("Question 9");
    int[] newArray = {25, 50, 30};
    System.out.println(over100(newArray));
    //10.Write a method that takes an array of double and returns the average of all the elements in the array.
    System.out.println("Question 10");
    double[] average1 = {2.5, 10.0, 7.5};
    System.out.println(averages(average1));
    //11.	Write a method that takes two arrays of double and returns true if the average of the 
    //elements in the first array is greater than the average of the elements in the second array.
    System.out.println("Question 11");
    double[] dub1 = {10.5, 25.5,5.0};
    double[] dub2 = {4.0, 20.5, 1.0};
    System.out.println(doubleGreater(dub1, dub2));
    //12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
    //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    System.out.println("Question 12");
    boolean isHotOutside = true;
    double moneyInPocket = 12.50;
    System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
    //13.Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
    System.out.println("Question 13");
    // method will return true if special characters are used in password. (!@#)
    String password = "Howdy!!";
    System.out.println(passwordCheck(password));
    }
    static String concat(String a, int n) {
        String result = "word";
        for ( int i = 0; i < n; i++) {
            
        } return result += a;
    }
    static String fullName(String firstName, String lastName) {
        String fullNamee = firstName + " " + lastName;
        return fullNamee;
    }
    static boolean over100(int[] array){
        int sum = 0;
        for (int o : array) {
            sum += o;
            if ( sum > 100) {
                return true;
            } 
                
            }            
                return false;
    }

    static double averages(double[] array) {
        double av = 0;
        for ( double ar : array) {
            av += ar;
            
        }
        return av / array.length;
    }
    static boolean doubleGreater(double[] dub1, double[] dub2) {
        double sum = 0;
        double sum2 = 0;
        for (double i : dub1){
            sum += i;
            for (double y : dub2){
                sum2 += y;
                if ( sum > sum2) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean willBuyDrink(boolean isHotOutside, Double moneyInPocket) {
        if ( isHotOutside && moneyInPocket > 10.50) {
            return true;
        }                     
        return false;
    }
    static boolean passwordCheck(String password) {
        if (password.contains("!") || password.contains("@") || password.contains("#")) {
            return true;
        }
        return false;
       

        }
}



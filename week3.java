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





    }

}
class java {
    public static void main(String[] args) {
        
    // using primaitve data types - initializing and setting variables Question 3)
    double itemPrice = 5.99;
    double itemPrice2 = 7.99;
    double amountOfMoneyInWallet = 20.00;
    double numberOfFriends = 15;
    double numberOfFriends2 = 20;
    int ageInYears2 = 30;
    int ageInYears = 25;
    String firstName = "Johnny";
    String lastName = "Hernandez";
    char middleInitial = 'J';
    String firstName2 = "Josh";
    String lastName2 = "Potter";
    char middleInitial2 = 'K';

    // Creating variable operations Question 4)
    // a.	New amount of money in wallet after buying the item
    double newMoneyAmount = amountOfMoneyInWallet - itemPrice;
    double newMoneyAmount2 = newMoneyAmount - itemPrice2;

    // b.	Number of friends you’ve made each year based on your age variable and your number of friends variable
    double friendsPerYear = ageInYears / numberOfFriends;
    double friendsPerYear2 = ageInYears2 / numberOfFriends2;

    // c.	Full name based on first name, middle initial, and last name
    String fullName = firstName + " " + middleInitial + " " + lastName;
    String fullName2 = firstName2 + " " + middleInitial2 + " " + lastName2;

    // 5.	Use System.out.println() to print out the values of all the variables you’ve created
    System.out.println("I have exactly $" + newMoneyAmount + " in my wallet.");
    System.out.println("After my second purchase I now have $" + newMoneyAmount2 + " in my wallet.");
    System.out.println("I have made " + friendsPerYear + " friends for each year I've been alive.");
    System.out.println("My brother has made " + friendsPerYear2 + " friends per year he's been alive");
    System.out.println("My full name is " + fullName);
    System.out.println("My friends full name is " + fullName2);







    }
}
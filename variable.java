public class variable{
  public static void main(String[] args) {
    // Declaring and initializing variables
    int speedLimit = 80;
    String city = "New York";
    float temperature = 19.99f;
    boolean isRaining = true;
    char grade = 'A';

    // Printing the variables
    System.out.println("The speed limit in " + city + " is " + speedLimit + " mph.");
    System.out.println("Current temperature: " + temperature + "°C");
    System.out.println("Is it raining? " + isRaining);
    System.out.println("Student grade: " + grade);

    // Modifying a variable's value
    speedLimit = 70;
    System.out.println("The new speed limit is " + speedLimit + " mph.");
  }
}
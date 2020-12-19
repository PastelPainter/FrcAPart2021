import java.util.Scanner;

public class ApartmentsCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creates a new Scanner
        int input = sc.nextInt(); // Receives the apartment's number that is being called
        apartmentsCaller(input); // Calls algorithm function with input argument as the number of the apartment that is being called
        sc.close(); // Ends Scanner after the function is finished
    }

    // Algorithm function
    public static boolean apartmentsCaller(int input) {

        // An if statement that checks if the given number is higher than the max apartments amount in the building and errors when true
        if (input > 9999) {
            System.out.println("Number given is larger than the amount of apartments in the building!");
            return false;
        }

        int apartmentIndex = 1; // The current index of apartments
        String currentApartment = String.valueOf(apartmentIndex); // The current apartment being called
        int apartmentsSum = 0; // The sum of apartments that have been called

        // While the current apartment is different from input, we build the apartment numbers and add to the sum
        while (!currentApartment.equals(String.valueOf(input))) {

            apartmentsSum += currentApartment.length(); // Counts the total length of all buttons pressed

            // Checks how to build the next number
            if (currentApartment.length() == 4) { // If the length is 4, goes to the next index and start from one number
                apartmentIndex++;
                currentApartment = String.valueOf(apartmentIndex);
            } else // If the length is less than 4, just append another index to currentApartment
                currentApartment += apartmentIndex;
        }
        // Prints out the sum of all buttons pressed; the value input isn't counted in the while loop, so it is counted here
        System.out.println("Sum buttons pressed: " + (apartmentsSum + currentApartment.length()));
        return true;
    }
}

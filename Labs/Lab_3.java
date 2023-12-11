import java.util.Scanner;

public class lab_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = DataVala(scanner);

        int[] primes = findPrimes(n);
        printPrimes(primes);
    }

    // Method for user input and data validation
    public static int DataVala(Scanner scanner) {
        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the number of prime numbers to find: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Consume invalid input
            }
        }

        return n;
    }


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find and store the first n prime numbers
    public static int[] findPrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }
            number++;
        }

        return primes;
    }

   
    public static void printPrimes(int[] primes) {
      int count = 0;
        System.out.println("The first " + primes.length + " prime numbers are:");
        for (int prime : primes) {
            count++;
            System.out.print(count+": " +prime + " ");
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter number :");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
                    Movie[] movies = {
                            new Movie("Movie1", "Studio1", "PG"),
                            new Movie("Movie2", "Studio2", "PG13"),
                            new Movie("Movie5", "Studio5", "PG")
                    };
                    ArrayList<Movie> pgMovies = casinoRoyale.getPG(movies);
                    System.out.println("\nPG Movies found: " + pgMovies.size());
                    for(Movie m : pgMovies) {
                        System.out.println("- " + m.getTitle() + " (" + m.getRating() + ")");
                    }
                    continue;

                case 2:
                    Holiday independenceDay = new Holiday("Independence Day", 4, "July");
                    Holiday christmas = new Holiday("Christmas", 25, "July");
                    System.out.println("Christmas and Independence Day in same month? " +
                            Holiday.inSameMonth(christmas, independenceDay));
                    Holiday[] holidays = {
                            independenceDay,
                            christmas,
                            new Holiday("Labor Day", 1, "September"),
                    };
                    double avgDay = independenceDay.avgDate(holidays);
                    System.out.println("\nAverage day of holidays: " + avgDay);
                    continue;

                case 3:
                    BankAccount account1 = new BankAccount(1000.0);
                    account1.setAccountId(1001);
                    System.out.println("Account 1 created with balance: " + account1.getBalance());
                    BankAccount account2 = new BankAccount();
                    account2.setAccountId(1002);
                    account2.setBalance(500.0);
                    System.out.println("Account 2 created with balance: " + account2.getBalance());
                    account1.deposit(200.0);
                    System.out.println("Account 1 new balance: " + account1.getBalance());
                    boolean success1 = account1.withdraw(300.0);
                    System.out.println("Withdrawal successful? " + success1);
                    System.out.println("Account 1 balance: " + account1.getBalance());
                    boolean success2 = account2.withdraw(2000.0);
                    System.out.println("Withdrawal successful? " + success2);
                    System.out.println("Account 2 balance:" + account2.getBalance());
                    continue;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2 or 3.");
                    return;
            }
        }
    }
}
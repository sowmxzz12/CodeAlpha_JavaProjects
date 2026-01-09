import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        room r1 = new room(101, "Standard");
        room r2 = new room(102, "Deluxe");

        System.out.println("Welcome to Hotel Reservation System");
        System.out.println("1. Book Room");
        System.out.println("2. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter customer name: ");
            String name = sc.next();

            r1.isBooked = true;
            Reservation res = new Reservation(name, r1);

            System.out.println("\n--- Booking Details ---");
            System.out.println("Customer Name: " + res.customerName);
            System.out.println("Room Number  : " + res.room.roomNumber);
            System.out.println("Room Type    : " + res.room.roomType);
            System.out.println("Payment Status: Success");
        } else {
            System.out.println("Thank you!");
        }
    }
}


class SpecialScreening {
    private int tickets = 5; // Total tickets available
    private final Object lock = new Object(); // Lock to ensure thread-safe booking

    public void bookTicket(String userName) {
        synchronized (lock) { // Synchronize to ensure thread-safe access
            if (tickets > 0) {
                System.out.println(userName + " is attempting to book a ticket...");
                try {
                    Thread.sleep(100); // Simulate processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tickets--; // Book the ticket
                System.out.println(userName + " successfully booked a ticket. Remaining tickets: " + tickets);
            } else {
                System.out.println(userName + " could not book a ticket. No tickets left.");
            }
        }
    }
}
class User extends Thread {
    private final SpecialScreening screening;
    private final String userName;

    public User(SpecialScreening screening, String userName) {
        this.screening = screening;
        this.userName = userName;
    }

    @Override
    public void run() {
        screening.bookTicket(userName);
    }
}

public class lifecycle1 {
    public static void main(String[] args) {
        SpecialScreening screening = new SpecialScreening();

        // Simulate multiple users trying to book simultaneously
        Thread user1 = new User(screening, "User-1");
        Thread user2 = new User(screening, "User-2");
        Thread user3 = new User(screening, "User-3");
        Thread user4 = new User(screening, "User-4");
        Thread user5 = new User(screening, "User-5");
        Thread user6 = new User(screening, "User-6");
        Thread user7 = new User(screening, "User-7");
        Thread user8 = new User(screening, "User-8");

        // Start the booking process for each user
        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
        user6.start();
        user7.start();
        user8.start();

        // Wait for all threads to finish
        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();
            user6.join();
            user7.join();
            user8.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Booking process completed.");
    }
}
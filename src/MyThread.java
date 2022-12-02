/*
 * Demonstrating creating an immediate thread Using Anonymous Inner class that extends a Class
 */

/* Main class */
public class MyThread {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                System.out.println("This is the child Thread");
            }
        };

        /* Start the Thread */
        t.start();

        /* Display the main thread for readabilty */
        System.out.println("This is the main Thread");
    }
}

/*
 * OUTPUT
 * 
 * This is the main Thread
 * 
 * This is the child Thread
 */

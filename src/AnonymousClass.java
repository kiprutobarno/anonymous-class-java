/*
 * Main class
 */
public class AnonymousClass {
    public static void main(String[] args) {
        /*
         * Person class is hidden inner class of Age interface whose name is not written but an
         * object to it is created
         */
        Age obj = new Age() {
            @Override
            public void getAge() {
                System.out.println("The person's age is " + x);

            }

        };
        obj.getAge();
    }


}

interface Age {
    /* Define variables and methods */
    int x = 21;

    void getAge();
}


/*
 * Class 1 Helper class implementing methods of Age interface
 */
public class Person implements Age {

    @Override
    public void getAge() {
        System.out.println("The person's age is " + x);

    }

}

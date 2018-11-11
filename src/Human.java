public class Human {

    private String firstName;
    private String lastName;
    private int age;

    public Human() {

    }

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String getFirstName() {
        return this.firstName;
    }

    private String getLastName() {
        return this.lastName;
    }

    private String getAge() {
//        if (this.age == 0 ) {
//            return "XXX";
//        } else {
//            return Integer.toString(this.age);
//        }
        return this.age == 0 ? "XXX" : Integer.toString(this.age);
    }

    public String speak() {
        return "Nazywam się " + this.getFirstName() + " " + this.getLastName() + " i mam " + this.getAge() + " lat.";
    }

}

/**
 * Created by LENOVO on 18-Jun-15.
 */
public class Nasabah {
    private String firstName;
    private String lastName;
    private Rekening account;

    public Nasabah() {
    }

    public Nasabah(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Nasabah(String firstName, String lastName, Rekening account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Rekening getAccount() {
        return account;
    }

    public void setAccount(Rekening account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}

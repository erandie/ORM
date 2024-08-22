package lk.ijse.embed;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
@Entity
public class FullName {
//    private int id;
    private String firstName;
    private String lastName;

    public FullName() {

    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
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

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

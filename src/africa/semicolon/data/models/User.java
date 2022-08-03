package africa.semicolon.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document("Users")
public class User {
    @Id

    private int id;
    private String firstName;
    private String lastName;
    @Setter
    private String password;

    private String email;
    private String phoneNumber;

    @DBRef
    private List<Contact> contacts = new ArrayList<>();


//    public User(String firstName, String lastName, String password, int id, String email, String phoneNumber) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.password = password;
//        this.id = id;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public User() {
//
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public List<Contact> getContacts() {
//        return contacts;
//    }
}

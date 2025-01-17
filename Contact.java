import java.util.Scanner;

public class Contact {
    private final int id;
    private String name, surname, tel, email;

    public Contact(int id, String name, String surname, String tel, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return (
                "ID: " + id + '\n' +
                        "NAME: " + name + '\n' +
                        "SURNAME: " + surname + '\n' +
                        "TEL: " + tel + '\n' +
                        "EMAIL: " + email + '\n'
        );
    }
}

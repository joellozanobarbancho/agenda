import java.util.Scanner;

public class Contact {
    int id;
    String name, surname, tel, email;

    public Contact(int id, String name, String surname, String tel, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tel = tel;
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

public class Contact {
    private final int id;
    private String name, surname, phone, email;

    public Contact(int id, String name, String surname, String phone, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
                        "TEL: " + phone + '\n' +
                        "EMAIL: " + email + '\n'
        );
    }
}

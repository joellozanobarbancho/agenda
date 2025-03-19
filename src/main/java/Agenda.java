import java.util.ArrayList;

public class Agenda {
    ArrayList<Contact> contacts;
    int count = 0;

    public Agenda() {
        this.contacts = new ArrayList<Contact>();
    }

    Contact createContact(String[] s) {
        if (s == null) return null;
        Contact c = new Contact(this.count, s[0], s[1], s[2], s[3]);
        this.contacts.add(c);
        this.count++;
        return c;
    }

    void updateContact(Contact c, String[] s) {
        if (c == null) return;
        c.setName(s[0]);
        c.setSurname(s[1]);
        c.setPhone(s[2]);
        c.setEmail(s[3]);
    }

    void deleteContact(int id) {
        Contact c = searchById(id);
        this.contacts.remove(c);
    }

    public Contact searchById(int id) {
        for (Contact c : this.contacts) {
            if (id == c.getId())
                return c;
        }
        return null;
    }

    public Contact searchByName(String s) {
        for (Contact c : this.contacts) {
            if (c.getName().contains(s)) {
                return c;
            }
        }
        return null;
    }

    public Contact searchBySurname(String s) {
        for (Contact c : this.contacts) {
            if (c.getSurname().contains(s)) {
                return c;
            }
        }
        return null;
    }

    public Contact searchByPhone(String s) {
        for (Contact c : this.contacts) {
            if (c.getPhone().contains(s)) {
                return c;
            }
        }
        return null;
    }

    public Contact searchByEmail(String s) {
        for (Contact c : this.contacts) {
            if (c.getEmail().contains(s)) {
                return c;
            }
        }
        return null;
    }
}

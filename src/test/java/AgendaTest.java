import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgendaTest {
    private Agenda a;

    @BeforeEach
    void setUp() {
        a = new Agenda();
    }

    @org.junit.jupiter.api.Test
    void createContact() {
        String[]    exampleData1    = {"name 1", "surname 1", "phone 1", "example1@gmail.com"};
        String[]    exampleData2    = {"name 2", "surname 2", "phone 2", "example2@gmail.com"};
        String[]    exampleData3    = {"name 3", "surname 3", "phone 3", "example3@gmail.com"};

        assertEquals(0, a.getCount());
        Contact c1 = a.createContact(exampleData1);
        assertEquals(0, c1.getId());
        assertEquals("name 1", c1.getName());
        assertEquals("surname 1", c1.getSurname());
        assertEquals("phone 1", c1.getPhone());
        assertEquals("example1@gmail.com", c1.getEmail());
        assertEquals(1, a.getCount());
        Contact c2 = a.createContact(exampleData2);
        assertEquals(1, c2.getId());
        assertEquals("name 2", c2.getName());
        assertEquals("surname 2", c2.getSurname());
        assertEquals("phone 2", c2.getPhone());
        assertEquals("example2@gmail.com", c2.getEmail());
        assertEquals(2, a.getCount());
        Contact c3 = a.createContact(exampleData3);
        assertEquals(2, c3.getId());
        assertEquals("name 3", c3.getName());
        assertEquals("surname 3", c3.getSurname());
        assertEquals("phone 3", c3.getPhone());
        assertEquals("example3@gmail.com", c3.getEmail());
        assertEquals(3, a.getCount());
    }

    @org.junit.jupiter.api.Test
    void createContactNull() {
        assertNull(a.createContact(null));
    }

    @org.junit.jupiter.api.Test
    void updateContact() {
        Contact  c          = new Contact(0,"Yoel","Lozano","987654321","yoel@gmail.com");
        String[] newData    = {"Joel","Lozano","123456789","joel@gmail.com"};

        a.updateContact(c, newData);
        assertEquals(0, c.getId());
        assertEquals("Joel", c.getName());
        assertEquals("Lozano", c.getSurname());
        assertEquals("123456789", c.getPhone());
        assertEquals("joel@gmail.com", c.getEmail());
    }

    @org.junit.jupiter.api.Test
    void deleteContact() {
        String[] exampleData1 = {"name 1", "surname 1", "phone 1", "example1@gmail.com"};
        String[] exampleData2 = {"name 2", "surname 2", "phone 2", "example2@gmail.com"};
        String[] exampleData3 = {"name 3", "surname 3", "phone 3", "example3@gmail.com"};

        a.createContact(exampleData1);
        a.createContact(exampleData2);
        a.createContact(exampleData3);
        a.deleteContact(1);
        List<Contact> all = a.getContacts();
        Assertions.assertEquals(2, all.size());
        Assertions.assertFalse(all.stream().anyMatch(x -> x.getId() == 1));
    }

    @org.junit.jupiter.api.Test
    void searchById() {
        String[]    exampleData1    = {"name 1", "surname 1", "phone 1", "example1@gmail.com"};
        String[]    exampleData2    = {"name 2", "surname 2", "phone 2", "example2@gmail.com"};
        String[]    exampleData3    = {"name 3", "surname 3", "phone 3", "example3@gmail.com"};

        Contact c1 = a.createContact(exampleData1);
        Contact c2 = a.createContact(exampleData2);
        Contact c3 = a.createContact(exampleData3);
        assertNull(a.searchById(-1));
        assertEquals(c1, a.searchById(0));
        assertEquals(c2, a.searchById(1));
        assertEquals(c3, a.searchById(2));
        assertNull(a.searchById(3));
    }

    @org.junit.jupiter.api.Test
    void searchByName() {
        String[]    exampleData1    = {"name 1", "surname 1", "phone 1", "example1@gmail.com"};
        String[]    exampleData2    = {"name 2", "surname 2", "phone 2", "example2@gmail.com"};
        String[]    exampleData3    = {"name 3", "surname 3", "phone 3", "example3@gmail.com"};

        Contact c1 = a.createContact(exampleData1);
        Contact c2 = a.createContact(exampleData2);
        Contact c3 = a.createContact(exampleData3);
        assertEquals(c1, a.searchByName("name 1"));
        assertEquals(c2, a.searchByName("name 2"));
        assertEquals(c3, a.searchByName("name 3"));
        assertNull(a.searchByName("Joel"));
    }

    @org.junit.jupiter.api.Test
    void searchBySurname() {
        String[]    exampleData1    = {"name 1", "surname 1", "phone 1", "example1@gmail.com"};
        String[]    exampleData2    = {"name 2", "surname 2", "phone 2", "example2@gmail.com"};
        String[]    exampleData3    = {"name 3", "surname 3", "phone 3", "example3@gmail.com"};

        Contact c1 = a.createContact(exampleData1);
        Contact c2 = a.createContact(exampleData2);
        Contact c3 = a.createContact(exampleData3);
        assertEquals(c1, a.searchBySurname("surname 1"));
        assertEquals(c2, a.searchBySurname("surname 2"));
        assertEquals(c3, a.searchBySurname("surname 3"));
        assertNull(a.searchBySurname("Lozano"));
    }

    @org.junit.jupiter.api.Test
    void searchByPhone() {
        String[]    exampleData1    = {"name 1", "surname 1", "phone 1", "example1@gmail.com"};
        String[]    exampleData2    = {"name 2", "surname 2", "phone 2", "example2@gmail.com"};
        String[]    exampleData3    = {"name 3", "surname 3", "phone 3", "example3@gmail.com"};

        Contact c1 = a.createContact(exampleData1);
        Contact c2 = a.createContact(exampleData2);
        Contact c3 = a.createContact(exampleData3);
        assertEquals(c1, a.searchByPhone("phone 1"));
        assertEquals(c2, a.searchByPhone("phone 2"));
        assertEquals(c3, a.searchByPhone("phone 3"));
        assertNull(a.searchByPhone("phone 4"));
    }

    @org.junit.jupiter.api.Test
    void searchByEmail() {
        String[]    exampleData1    = {"name 1", "surname 1", "phone 1", "example1@gmail.com"};
        String[]    exampleData2    = {"name 2", "surname 2", "phone 2", "example2@gmail.com"};
        String[]    exampleData3    = {"name 3", "surname 3", "phone 3", "example3@gmail.com"};

        Contact c1 = a.createContact(exampleData1);
        Contact c2 = a.createContact(exampleData2);
        Contact c3 = a.createContact(exampleData3);
        assertEquals(c1, a.searchByEmail("example1@gmail.com"));
        assertEquals(c2, a.searchByEmail("example2@gmail.com"));
        assertEquals(c3, a.searchByEmail("example3@gmail.com"));
        assertNull(a.searchByEmail("example4@gmail.com"));
    }
}
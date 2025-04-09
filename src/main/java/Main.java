public class Main {
    public static void main(String[] args) {
        Tui     t = new Tui();
        Agenda  a = new Agenda();

        while (true) {
            int option = t.showOptions();
            switch (option) {
                case 1 -> {
                    String[]    s;
                    Contact     c;

                    s = t.newContact();
                    c = a.createContact(s);
                    t.println(c);
                }
                case 2 -> {
                    int         searchOption;
                    String      s;
                    Contact     c;

                    searchOption = t.chooseSearchOption();
                    switch (searchOption) {
                        case 1 -> {
                            //show all contacts
                            for (Contact contact : a.getContacts()) t.println(contact);
                        }
                        case 2 -> {
                            s = t.toSearch();
                            c = a.searchByName(s);
                            t.println(c);
                        }
                        case 3 -> {
                            s = t.toSearch();
                            c = a.searchBySurname(s);
                            t.println(c);
                        }
                        case 4 -> {
                            s = t.toSearch();
                            c = a.searchByPhone(s);
                            t.println(c);
                        }
                        case 5 -> {
                            s = t.toSearch();
                            c = a.searchByEmail(s);
                            t.println(c);
                        }
                        //default -> go back;
                    }
                }
                case 3 -> {
                    Contact     c;
                    String[]    s;

                    c = a.searchById(t.toSearchId());
                    s = t.newContact();
                    a.updateContact(c, s);
                    t.println(c);
                }
                case 4 -> a.deleteContact(t.toSearchId());
                case 5 -> {
                    return;
                }
            }
        }
    }
}
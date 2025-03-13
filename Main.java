public class Main {
    public static void main(String[] args) {
        Tui     i = new Tui();
        Agenda  a = new Agenda();

        while (true) {
            int option = i.showOptions();
            switch (option) {
                case 1 -> {
                    String[]    s;
                    Contact     c;

                    s = i.newContact();
                    c = a.createContact(s);
                    i.println(c);
                }
                case 2 -> {
                    int searchOption = i.chooseSearchOption();
                    switch (searchOption) {
                        case 1 -> {
                            //show all contacts
                            for (Contact c : a.contacts) i.println(c);
                        }
                        case 2 -> {
                            String  s = i.toSearch();
                            Contact c = a.searchByName(s);
                            i.println(c);
                        }
                        case 3 -> {
                            String  s = i.toSearch();
                            Contact c = a.searchBySurname(s);
                            i.println(c);
                        }
                        case 4 -> {
                            String  s = i.toSearch();
                            Contact c = a.searchByPhone(s);
                            i.println(c);
                        }
                        case 5 -> {
                            String  s = i.toSearch();
                            Contact c = a.searchByEmail(s);
                            i.println(c);
                        }
                        //default -> go back;
                    }
                }
                case 3 -> {
                    Contact  c = a.searchById(i.toSearchId());
                    String[] s = i.newContact();
                    a.updateContact(c, s);
                    i.println(c);
                }
                case 4 -> a.deleteContact(i.toSearchId());
                case 5 -> {
                    return;
                }
            }
        }
    }
}
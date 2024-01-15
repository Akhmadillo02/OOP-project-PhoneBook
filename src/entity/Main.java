package entity;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook("a");
        phoneBook.add("a1","b","1234567");
        phoneBook.add("a2","b","1234568");
        phoneBook.add("a3","b","1234569");
        phoneBook.add("a4","b","1234563");
        phoneBook.add("a5","b","1234567");
        phoneBook.add("a6","b","1234565");
        phoneBook.add("a7","b","1234564");
//        phoneBook.show();
//        System.out.println(phoneBook.getContact(2));
//        System.out.println(phoneBook.toString());

        System.out.println(phoneBook.find("1234564"));
    }
}
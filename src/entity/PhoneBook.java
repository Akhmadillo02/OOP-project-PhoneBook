package entity;

import java.util.Arrays;

public class PhoneBook {

    private String name;
    private int maxIndex = 5;
    private Contact[] contacts = new Contact[maxIndex];

    private int currentIndex = 0;

    public PhoneBook(String name) {
        this.name = name;
    }

    public void add(String firstName, String lastName, String number) {
        if (this.currentIndex == this.maxIndex) {
            this.maxIndex += 5;
            Contact[] newContacts = new Contact[this.maxIndex];
            for (int i = 0; i < currentIndex; i++) {
                newContacts[i] = this.contacts[i];
            }
            this.contacts = newContacts;
        }
        Contact contact = new Contact(firstName, lastName, number);
        this.contacts[currentIndex] = contact;
        this.currentIndex++;

    }

    public String firstContact() {
        Contact contact = this.contacts[0];
        if (contact != null) {
            return contact.toString();
        }
        return "! ! !";
    }

    public String getContact(int i) {
        if (i > 0) {
            return this.contacts[i - 1].toString();
        }
        return "! ! !";
    }

    public void show() {
        for (int i = 0; i < currentIndex; i++) {
            Contact contact = this.contacts[i];
            System.out.println(contact);
        }
    }

    public String find(String text) {
        for (int i = 0; i < this.currentIndex; i++) {
            Contact contact = this.contacts[i];
            if (contact.contains(text)) {
                return contact.toString();
            }

        }
        return "! ! !";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String text = "{";
        for (int i = 0; i < this.currentIndex; i++) {
            Contact contact = this.contacts[i];
            text += contact.toString() + ", ";
        }
        return text + "}";
    }
}

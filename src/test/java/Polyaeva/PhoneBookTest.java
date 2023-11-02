package Polyaeva;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.*;


@Testable
public class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    public void setup() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void addGroupTest() {
        String groupName = "Friends";
        assertTrue(phoneBook.addGroup(groupName));
    }

    @AfterEach
    public void tearDown() {
        phoneBook = null;
    }

    @Test
    public void findContactInGroupTest() {
        String groupName = "Friends";
        String name = "Liubov";

        Contact contactExpected = null;
        Contact contact = phoneBook.findContactInGroup(name, groupName);

        assertNull(contact);
    }

    @Test
    public void addContactInGroupTest(){
        Contact contact = new Contact("Liubov", "89183380985" );
        String groupName = "Friends";
        assertTrue(phoneBook.addContactInGroup(contact, groupName));

    }
}

package com.ssf.workshop13;

import com.ssf.workshop13.model.Contact;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Workshop13ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testContact() {
        Contact c = new Contact();
        c.setName("Terence");
        c.setEmail("t@t.com");
        c.setPhoneNumber(12345678);
        // assert equals to the setter value
        assertEquals(c.getEmail(), "t@t.com");
    }

}

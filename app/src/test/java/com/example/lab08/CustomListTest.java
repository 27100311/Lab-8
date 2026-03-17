package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City lahore = new City("Lahore", "Punjab");
        City karachi = new City("Karachi", "Sindh");

        list.addCity(lahore);

        assertTrue(list.hasCity(lahore));
        assertFalse(list.hasCity(karachi));
    }
}
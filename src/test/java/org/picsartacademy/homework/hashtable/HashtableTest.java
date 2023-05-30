package org.picsartacademy.homework.hashtable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class HashtableTest {
    @Test
    public void getSizeTest() {
        Hashtable hashtable = new Hashtable();
        hashtable.put("Artyom", 80);
        hashtable.put("Sergey", 86);
        hashtable.put("Samvel", 77);
        hashtable.put("Khachatur", 90);
        hashtable.put("Taron", 69);

        assertEquals(5, hashtable.getSize());

    }

    @Test 
    public void isEmptyTest() {
        Hashtable hashtable = new Hashtable();
        assertTrue(hashtable.isEmpty());

        hashtable.put("Artyom", 80);
        hashtable.put("Sergey", 86);
        hashtable.put("Samvel", 77);
        hashtable.put("Khachatur", 90);
        hashtable.put("Taron", 69);

        assertFalse(hashtable.isEmpty());
    }
    
    @Test
    public void getKeysTest() {
        Hashtable hashtable = new Hashtable();
        hashtable.put("Artyom", 80);
        hashtable.put("Sergey", 86);
        hashtable.put("Samvel", 77);
        hashtable.put("Khachatur", 90);
        hashtable.put("Taron", 69);

        String[] keys = hashtable.getKeys();
        System.out.println(Arrays.toString(keys));
    }

    @Test
    public void getValuesTest() {
        Hashtable hashtable = new Hashtable();
        hashtable.put("Artyom", 80);
        hashtable.put("Sergey", 86);
        hashtable.put("Samvel", 77);
        hashtable.put("Khachatur", 90);
        hashtable.put("Taron", 69);

        Integer[] values = hashtable.getValues();
        System.out.println(Arrays.toString(values));
    }

    @Test
    public void getTest() {
        Hashtable hashtable = new Hashtable();
        hashtable.put("Artyom", 80);
        hashtable.put("Sergey", 86);
        hashtable.put("Samvel", 77);
        hashtable.put("Khachatur", 90);
        hashtable.put("Taron", 69);

        assertEquals(80, hashtable.get("Artyom"));

        hashtable.put("Artyom", 85);
        assertEquals(85, hashtable.get("Artyom"));
    }
}

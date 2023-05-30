# Hashtable

The `Hashtable` class in `org.picsartacademy.homework.hashtable` package is an implementation of a hash table data structure in Java. It provides key-value storage and
retrieval functionality using a hash-based indexing mechanism.

## Usage

To use the Hashtable class, follow these steps:

1. Create a new instance of the `Hashtable` class:
    ``` java
    Hashtable hashtable = new Hashtable();
    ```
2. Add key-value pairs to the hashtable using the `put()` method:
    ``` java 
    hashtable.put("key1", 10);
    hashtable.put("key2", 20);
    ```
3. Retrieve the value associated with a key using the `get()` method:
    ``` java
    Integer value = hashtable.get("key1");
    ```
4. Check the size of the hashtable using the `getSize()` method:
   ``` java
   int size = hashtable.getSize();
   ```
5. Check if the hashtable is empty using the `isEmpty()` method:
   ``` java
   boolean empty = hashtable.isEmpty();
   ```
6. Get an array of all keys in the hashtable using the `getKeys()` method:
   ``` java
   String[] keys = hashtable.getKeys();
   ```
7. Get an array of all values in the hashtable using the `getValues()` method:
   ``` java 
   Integer[] values = hashtable.getValues();
   ```

## Implementation Details
The `Hashtable` class internally uses an array of linked lists to handle collisions. Each element in the array represents a bucket, and each bucket can contain multiple key-value pairs.

## Testing
The `HashtableTest` class in `org.picsartacademy.homework.hashtable` package provides some test cases to validate the functionality of the Hashtable class. Here are a few examples:

Test cases cover various scenarios, such as checking the size of the hashtable, verifying if it is empty, retrieving keys and values, and getting the value associated with a key.

Feel free to add more test cases as needed to validate the functionality of the `Hashtable` class.

---

Please note that the code snippet for the `HashtableTest` class assumes that you are using JUnit 5 for testing. Make sure to import the necessary dependencies and configure your testing environment accordingly.

---

Feel free to customize the content and formatting of the `README.md` file to suit your specific project requirements.    

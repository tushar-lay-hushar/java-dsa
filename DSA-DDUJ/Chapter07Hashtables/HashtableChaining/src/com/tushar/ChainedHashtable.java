package com.tushar;

import java.security.Key;
import java.time.temporal.Temporal;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee StoredEmployee = null;
        while (iterator.hasNext()) {
            StoredEmployee = iterator.next();
            if (StoredEmployee.key.equals(key)) {
                return StoredEmployee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = -1;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            index++;
            if (storedEmployee.key.equals(key)) {
                break;
            }
        }
        if (storedEmployee == null) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return storedEmployee.employee;
        }
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee);
                    System.out.print(" -> ");
                }
                System.out.println("null");
            }
        }
    }
}

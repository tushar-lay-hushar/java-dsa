package com.dsa.course.deque.classroom;

import java.util.ArrayDeque;
import java.util.Deque;

public class CircularTour {

    public static void main(String[] args) {
        int petrol[] = {50, 10, 60, 100};
        int distance[] = {30, 20, 100, 10};

        System.out.println(firstPetrolPump(petrol, distance, petrol.length));
    }

    private static int firstPetrolPump(int petrol[], int distance[], int n) {
        int start = 0;
        int currPet = 0;
        int prevPet = 0;

        for (int i = 0; i < n; i++) {
            currPet += (petrol[i] - distance[i]);
            if(currPet < 0) {
                start = i + 1;
                prevPet += currPet;
                currPet = 0;
            }
        }
        return ((currPet + prevPet) >= 0) ? (start + 1) : -1;
    }
}

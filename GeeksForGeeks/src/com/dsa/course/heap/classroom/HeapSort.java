package com.dsa.course.heap.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSort {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.remove(0));

        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        System.out.println(Arrays.toString(arr));


    }

    private static ArrayList<Integer> heapSort(ArrayList<Integer> arr) {

        int[] heap = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            heap[i] = arr.get(i);
        }

        for (int i = 0; i < arr.size() / 2; i++) {
            heapify(heap, i, arr.size());
        }

        for (int i = arr.size() - 1; i > 0; i--) {
            int temp = heap[i];
            heap[i] = heap[0];
            heap[0] = temp;
            heapify(heap, 0, i + 1);
        }

        return new ArrayList<>();
    }

    private static void heapify(int[] arr, int root, int length) {
        int largest = root;
        int left = root * 2 + 1;
        int right = root * 2 + 2;

        if (left < length && arr[left] > arr[root]) {
            largest = left;
        }

        if (right < length && arr[right] > arr[root]) {
            largest = right;
        }

        int temp = arr[largest];
        arr[largest] = arr[root];
        arr[root] = arr[temp];

        heapify(arr, largest, length);
    }


}

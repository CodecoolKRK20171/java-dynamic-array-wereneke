package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private int size = 10;
    private int actualIndex = 0;
    public int[] array;

    public DynamicIntArray() {
        array = new int[size];
    }

    public DynamicIntArray(int initialSize) {
        this.size = initialSize;
        array = new int[size];
    }

    public void add(int x) {

        if (actualIndex == size) {
            this.resize();
        }
        array[actualIndex] = x;

        this.actualIndex++;
    }

    public void remove(int index) throws IndexOutOfBoundsException {

    }

    public void insert(int index, int value) throws IndexOutOfBoundsException {

    }

    private void resize() {

        this.size *= 2;
        array = copy();
    }

    private int[] copy() {

        int[] resizedArray = new int[size];
        for (int i=0; i<actualIndex; i++) {
            resizedArray[i] = this.array[i];
        }
        return resizedArray;
    }

    @Override
    public String toString() {

        StringBuilder arrayString = new StringBuilder("");

        for (int i=0; i<actualIndex; i++) {
            arrayString.append(" ");
            arrayString.append(array[i]);
        }
        return arrayString.toString();
    }
}

package com.epam.rd.autocode.iterator;

import java.util.Iterator;


public class Iterators {

    public static Iterator<Integer> intArrayTwoTimesIterator(int[] array) {
        return new Iterator<Integer>() {
            private int index = 0;
            private int count = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }

                int element = array[index];
                count++;

                if (count == 2) {
                    count = 0;
                    index++;
                }

                return element;
            }
        };
    }

    public static Iterator<Integer> intArrayThreeTimesIterator(int[] array) {
        return new Iterator<Integer>() {
            private int index = 0;
            private int count = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }

                int element = array[index];
                count++;

                if (count == 3) {
                    count = 0;
                    index++;
                }

                return element;
            }
        };
    }

    public static Iterator<Integer> intArrayFiveTimesIterator(int[] array) {
        return new Iterator<Integer>() {
            private int index = 0;
            private int count = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }

                int element = array[index];
                count++;

                if (count == 5) {
                    count = 0;
                    index++;
                }

                return element;
            }
        };
    }

    public static Iterable<String> table(String[] columns, int[] rows) {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int columnIndex = 0;
                    private int rowIndex = 0;

                    @Override
                    public boolean hasNext() {
                        return rowIndex < rows.length && columnIndex < columns.length;
                    }

                    @Override
                    public String next() {
                        if (!hasNext()) {
                            throw new java.util.NoSuchElementException();
                        }

                        String cell = columns[columnIndex] + rows[rowIndex];

                        rowIndex++;
                        if (rowIndex >= rows.length) {
                            rowIndex = 0;
                            columnIndex++;
                        }

                        return cell;
                    }
                };
            }
        };
    }
}

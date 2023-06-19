package com.epam.rd.autocode.decorator;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Decorators {
    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        return new EvenIndexElementsSubList<>(sourceList);
    }
    private static class EvenIndexElementsSubList<E> extends AbstractList<E> {
        private final List<E> sourceList;

        public EvenIndexElementsSubList(List<E> sourceList) {
            this.sourceList = sourceList;
        }

        @Override
        public E get(int index) {
            return sourceList.get(index * 2);
        }

        @Override
        public int size() {
            return (sourceList.size() + 1) / 2;
        }

        @Override
        public Iterator<E> iterator() {
            return new EvenIndexIterator();
        }

        private class EvenIndexIterator implements Iterator<E> {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size();
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                return get(currentIndex++);
            }
        }
    }


}

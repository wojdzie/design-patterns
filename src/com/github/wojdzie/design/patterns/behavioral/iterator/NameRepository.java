package com.github.wojdzie.design.patterns.behavioral.iterator;

public class NameRepository implements Container {

    private final String names[] = { "Emily", "Robert", "John", "Lora", "Jeremy" };

    private class NameIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}

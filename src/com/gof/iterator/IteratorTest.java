package com.gof.iterator;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * className: IteratorTest
 * description: 迭代器模式
 * author: staring
 * createDate: 2022/4/14
 * version: 1.0
 */
public class IteratorTest {
    interface IteratorT {
        boolean hasNext();
        Object next();
    }

    class Book {
        private String name;

        public Book(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class BookShelf {
        private Book[] books;
        private int last = 0;
        private int maxSize;

        public BookShelf(int maxSize) {
            this.maxSize = maxSize;
            books = new Book[maxSize];
        }

        public Book[] getBooks() {
            return books;
        }

        public int getLast() {
            return last;
        }

        public void setLast(int last) {
            this.last = last;
        }

        public int getMaxSize() {
            return maxSize;
        }

        public void setMaxSize(int maxSize) {
            this.maxSize = maxSize;
        }
    }

    public static void main(String[] args) {
    }
}
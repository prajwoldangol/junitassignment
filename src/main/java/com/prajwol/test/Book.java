package com.prajwol.test;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Publisher> publishers;

    public Book() {
        this.publishers = new ArrayList<>();
    }

    public void addPublisher(Publisher publisher) {
        this.publishers.add(publisher);
    }

    public void removePublisher(Publisher publisher) {
        this.publishers.remove(publisher);
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }
}

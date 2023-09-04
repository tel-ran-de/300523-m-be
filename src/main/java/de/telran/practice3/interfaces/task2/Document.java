package de.telran.practice3.interfaces.task2;

public class Document implements Searchable {

    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content.equals(keyword);
    }
}

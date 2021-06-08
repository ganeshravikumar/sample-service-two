package com.gr.ms.demo.dto;

public class Greetingtwo {
    private final long id;
    private final String content;

    public Greetingtwo(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

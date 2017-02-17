package cn.ldx.controller;

/**
 * Created by Doenix Liu on 2017/2/17.
 */
public class RestTest {
    private final long id;
    private final String content;

    public RestTest(long id, String content) {
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

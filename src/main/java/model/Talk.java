package model;

public class Talk {

    private String title;
    private int lengthMins;

    public Talk(String title, int lengthMins) {
        this.title = title;
        this.lengthMins = lengthMins;
    }

    public int getLength() {
        return lengthMins;
    }

    public String getTitle() {
        return this.title;
    }
}

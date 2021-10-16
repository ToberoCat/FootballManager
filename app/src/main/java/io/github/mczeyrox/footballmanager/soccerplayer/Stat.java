package io.github.mczeyrox.footballmanager.soccerplayer;

public class Stat {

    private Attribute[] attributes;

    public Stat() {
    }

    public Stat(Attribute... attributes) {
        this.attributes = attributes;
    }

    public Attribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute[] attributes) {
        this.attributes = attributes;
    }
}

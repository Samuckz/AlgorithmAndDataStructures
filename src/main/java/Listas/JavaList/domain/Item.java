package Listas.JavaList.domain;

public class Item {
    private String content;

    public Item(String content) {
        this.content = content;
    }

    public Item(){}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    // === METHODS ===

    public String toString(){
        return String.format("Content: %s", this.content);
    }
}

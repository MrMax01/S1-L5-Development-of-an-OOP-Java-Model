package entities;

public abstract class MultimediaElement {
    private String title;

    public MultimediaElement(String title){
        setTitle(title);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}

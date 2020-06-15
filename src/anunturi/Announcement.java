package anunturi;

public abstract class Announcement {
    private String name;
    private String description;
    private int price;

    public Announcement(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public  String getDetails() {
        return name + " " + price + " " + description;
    }
}

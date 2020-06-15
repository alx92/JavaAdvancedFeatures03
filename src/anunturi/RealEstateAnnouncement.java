package anunturi;

public class RealEstateAnnouncement extends Announcement {

    private String location;
    private double area;
    RealEstateType realEstateType;

    @Override
    public String getDetails() {
        return super.getDetails() + " " + location + " " + area + " " + realEstateType;
    }

    public enum RealEstateType {
        INTRAVILAN,
        EXTRAVILAN
    }

    public RealEstateAnnouncement(String name, String description, int price, RealEstateType realEstateType, String location, double area) {
        super(name, description, price);
        this.location = location;
        this.area = area;
        this.realEstateType = realEstateType;
    }


}

package anunturi;

import java.util.ArrayList;
import java.util.List;

public class Site {

    private String name;
    private List<Announcement> announcements = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }
}

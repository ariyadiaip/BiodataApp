package id.sch.bdg.smkn4.pwpb.biodataapp;

public class People {
    int photo;
    String namePeople;

    public People(int photo, String namePeople) {
        this.photo = photo;
        this.namePeople = namePeople;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getNamePeople() {
        return namePeople;
    }

    public void setNamePeople(String namePeople) {
        this.namePeople = namePeople;
    }
}

package id.sch.bdg.smkn4.pwpb.biodataapp.aip;

public class Project {
    private String title, subtitle, detail, year;
    private int logo;

    public Project(String title, String subtitle, String detail, String year, int logo) {
        this.title = title;
        this.subtitle = subtitle;
        this.detail = detail;
        this.year = year;
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}

package id.sch.bdg.smkn4.pwpb.biodataapp.aip;

public class Contact {
    private String isi;
    private int pic;

    public Contact(String isi, int pic) {
        this.isi = isi;
        this.pic = pic;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String content) {
        this.isi = content;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}

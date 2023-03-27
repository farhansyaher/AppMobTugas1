package id.ac.uin.suska.recyclermobile;

public class Item_Rec {

    String nama;
    String email;
    int gambar;

    public Item_Rec(String nama, String email, int gambar) {
        this.nama = nama;
        this.email = email;
        this.gambar = gambar;
    }

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return gambar;
    }

    public void setImage(int gambar) {
        this.gambar = gambar;
    }
}

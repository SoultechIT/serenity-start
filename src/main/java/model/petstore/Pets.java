package model.petstore;

import java.util.ArrayList;

public class Pets {

    private Long id;
    private String name;
    private String status;
    private ArrayList photoUrls;

    @Override
    public String toString() {
        return "Pets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(ArrayList photoUrls) {
        this.photoUrls = photoUrls;
    }
}

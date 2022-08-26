package co.gov.mintic.cartera.ingresoegreso.entity;

public class profile {
 private String id;
 private String image;
 private String phone;
 private User user;
 private date createdAt;
 private date updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public co.gov.mintic.cartera.ingresoegreso.entity.User getUser() {
        return user;
    }

    public void setUser(co.gov.mintic.cartera.ingresoegreso.entity.User user) {
        this.user = user;
    }

    public date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(date createdAt) {
        this.createdAt = createdAt;
    }

    public date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "profile{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}

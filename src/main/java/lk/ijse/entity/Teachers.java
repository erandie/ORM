package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.embed.FullName;

@Entity
@Table(name = "teachers")
public class Teachers {
    @Id
    private int id;
    private FullName name;
    private String address;

    @Override
    public String toString() {
        return "Teachers{" +
                "id=" + id +
                ", name=" + name +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Teachers() {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

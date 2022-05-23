package arquitectura.software.msclient.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "client")
@NamedQueries({
        @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
        @NamedQuery(name = "Client.findByClientId", query = "SELECT c FROM Client c WHERE c.clientId = :clientId"),
        @NamedQuery(name = "Client.findByName", query = "SELECT c FROM Client c WHERE c.name = :name"),
        @NamedQuery(name = "Client.findByLastname", query = "SELECT c FROM Client c WHERE c.lastname = :lastname")})
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_id")
    private Integer clientId;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "address_id")
    private Integer addressId;
    @Column(name = "status")
    private Integer status;

    public Client() {
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(clientId, client.clientId) && Objects.equals(name, client.name) && Objects.equals(lastname, client.lastname) && Objects.equals(email, client.email) && Objects.equals(phone, client.phone) && Objects.equals(addressId, client.addressId) && Objects.equals(status, client.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, name, lastname, email, phone, addressId, status);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", addressId=" + addressId +
                ", status=" + status +
                '}';
    }
}

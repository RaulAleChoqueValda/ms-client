package arquitectura.software.msclient.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "address")
@NamedQueries({
        @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a"),
        @NamedQuery(name = "Address.findByAddressId", query = "SELECT a FROM Address a WHERE a.addressId = :addressId"),
        @NamedQuery(name = "Address.findByAddress", query = "SELECT a FROM Address a WHERE a.address = :address")})
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "address_id")
    private Integer addressId;
    @Column(name = "address")
    private String address;
    @Column(name = "postal_cod")
    private String postalCod;
    @Column(name = "status")
    private Integer status;

    public Address() {
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCod() {
        return postalCod;
    }

    public void setPostalCod(String postalCod) {
        this.postalCod = postalCod;
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
        Address address1 = (Address) o;
        return Objects.equals(addressId, address1.addressId) && Objects.equals(address, address1.address) && Objects.equals(postalCod, address1.postalCod) && Objects.equals(status, address1.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, address, postalCod, status);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", address='" + address + '\'' +
                ", postalCod='" + postalCod + '\'' +
                ", status=" + status +
                '}';
    }
}

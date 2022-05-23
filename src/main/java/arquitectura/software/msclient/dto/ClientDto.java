package arquitectura.software.msclient.dto;

public class ClientDto {
    private Integer clientId;
    private String name;
    private String lastname;
    private String email;
    private Integer phone;
    private Integer addressId;
    private Integer status;

    public ClientDto() {
    }

    public ClientDto(Integer clientId, String name, String lastname, String email, Integer phone, Integer addressId, Integer status) {
        this.clientId = clientId;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.addressId = addressId;
        this.status = status;
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
    public String toString() {
        return "ClientDto{" +
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

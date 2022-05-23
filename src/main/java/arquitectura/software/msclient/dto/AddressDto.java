package arquitectura.software.msclient.dto;

public class AddressDto {
    private Integer addressId;
    private String address;
    private String postalCod;

    public AddressDto() {
    }

    public AddressDto(Integer addressId, String address, String postalCod) {
        this.addressId = addressId;
        this.address = address;
        this.postalCod = postalCod;
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

    @Override
    public String toString() {
        return "AddressDto{" +
                "addressId=" + addressId +
                ", address='" + address + '\'' +
                ", postalCod='" + postalCod + '\'' +
                '}';
    }
}

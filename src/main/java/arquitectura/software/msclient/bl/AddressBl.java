package arquitectura.software.msclient.bl;

import arquitectura.software.msclient.entity.Address;
import arquitectura.software.msclient.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AddressBl {

    private AddressRepository addressRepository;

    @Autowired
    public AddressBl (AddressRepository addressRepository){
        this.addressRepository=addressRepository;
    }

    public List<Address> findAll(){
        return (List<Address>) addressRepository.getAddresses();
    }

    public Address createAddress(Address address){
        return addressRepository.save(address);
    }

    public Address updateAddress(Address address, Integer addressId){
        Address addressDB = addressRepository.getAddressById(addressId);
        if (Objects.nonNull(address.getAddress()) && !"".equalsIgnoreCase(address.getAddress())){
            addressDB.setAddress(address.getAddress());
        }
        if (Objects.nonNull(address.getPostalCod()) && !"".equalsIgnoreCase(address.getPostalCod())){
            addressDB.setPostalCod(address.getPostalCod());
        }
        if (Objects.nonNull(address.getStatus())){
            addressDB.setStatus(address.getStatus());
        }
        return addressRepository.save(addressDB);
    }

    public Address findByAddressId(Integer addressId){
        return addressRepository.getAddressById(addressId);
    }

    public void deleteAddress(Integer addressId){
        Address addressDB = addressRepository.getAddressById(addressId);
        if (Objects.nonNull(addressDB.getStatus())){
            addressDB.setStatus(1);
        }
    }
}

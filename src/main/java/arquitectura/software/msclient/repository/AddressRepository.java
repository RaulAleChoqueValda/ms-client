package arquitectura.software.msclient.repository;

import arquitectura.software.msclient.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Integer> {

    @Query(value="SELECT * FROM Address", nativeQuery = true)
    List<Address> getAddresses();

    @Query(value = "SELECT * FROM Address a WHERE a.addressId = :id", nativeQuery = true)
    Address getAddressById(Integer id);
}

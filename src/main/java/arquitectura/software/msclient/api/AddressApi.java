package arquitectura.software.msclient.api;

import arquitectura.software.msclient.bl.AddressBl;
import arquitectura.software.msclient.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class AddressApi {

    private AddressBl addressBl;

    @Autowired
    public AddressApi(AddressBl addressBl) {
        this.addressBl = addressBl;
    }

    @GetMapping(value = "/addresses", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Address> listAll() {
        System.out.println("Invocando al metodo GET");
        return addressBl.findAll();
    }

    @PostMapping(path="/addresses", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Address addAddress(@RequestBody Address address) {
        System.out.println("Invocando al metodo POST");
        return addressBl.createAddress(address);
    }

    @PutMapping(path="/addresses/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Address updateAddress(@PathVariable("id") Integer id, @RequestBody Address address) {
        System.out.println("Invocando al metodo PUT");
        return addressBl.updateAddress(address, id);
    }

    @GetMapping(value = "/addresses/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Address findByAddressId(@PathVariable("id") Integer id)  {
        System.out.println("Invocando al metodo GET");
        return addressBl.findByAddressId(id);
    }

    @DeleteMapping(path="/addresses/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        System.out.println("Invocando al metodo DELETE");
        addressBl.deleteAddress(id);
        return "Borrado Exitosamente";
    }
}

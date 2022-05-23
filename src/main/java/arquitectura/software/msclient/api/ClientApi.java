package arquitectura.software.msclient.api;

import arquitectura.software.msclient.bl.ClientBl;
import arquitectura.software.msclient.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ClientApi {

    private ClientBl clientBl;

    @Autowired
    public ClientApi(ClientBl clientBl){
        this.clientBl=clientBl;
    }

    @GetMapping(value = "/clients", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Client> listAll() {
        System.out.println("Invocando al metodo GET");
        return clientBl.findAll();
    }

    @PostMapping(path="/clients", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Client addClient(@RequestBody Client client) {
        System.out.println("Invocando al metodo POST");
        return clientBl.createClient(client);
    }

    @PutMapping(path="/clients/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Client updateClient(@PathVariable("id") Integer id, @RequestBody Client client) {
        System.out.println("Invocando al metodo PUT");
        return clientBl.updateClient(client, id);
    }

    @GetMapping(value = "/clients/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Client findByClientId(@PathVariable("id") Integer id)  {
        System.out.println("Invocando al metodo GET");
        return clientBl.findByClientId(id);
    }

    @DeleteMapping(path="/clients/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        System.out.println("Invocando al metodo DELETE");
        clientBl.deleteClient(id);
        return "Borrado Exitosamente";
    }
}

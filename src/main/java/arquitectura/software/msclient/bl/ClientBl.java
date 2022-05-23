package arquitectura.software.msclient.bl;

import arquitectura.software.msclient.entity.Client;
import arquitectura.software.msclient.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClientBl {

    private ClientRepository clientRepository;

    @Autowired
    public ClientBl (ClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }

    public List<Client> findAll(){
        return clientRepository.getClients();
    }

    public Client createClient(Client client){
        return clientRepository.save(client);
    }

    public Client updateClient(Client client, Integer clientId){
        Client clientDB = clientRepository.getClientById(clientId);
        if (Objects.nonNull(client.getName()) && !"".equalsIgnoreCase(client.getName())){
            clientDB.setName(client.getName());
        }
        if (Objects.nonNull(client.getLastname()) && !"".equalsIgnoreCase(client.getLastname())){
            clientDB.setLastname(client.getLastname());
        }
        if (Objects.nonNull(client.getEmail()) && !"".equalsIgnoreCase(client.getEmail())){
            clientDB.setEmail(client.getEmail());
        }
        if (Objects.nonNull(client.getPhone())){
            clientDB.setPhone(client.getPhone());
        }
        if (Objects.nonNull(client.getAddressId())){
            clientDB.setAddressId(client.getAddressId());
        }
        if (Objects.nonNull(client.getStatus())){
            clientDB.setStatus(client.getStatus());
        }
        return clientRepository.save(clientDB);
    }

    public Client findByClientId(Integer clientId){
        return clientRepository.getClientById(clientId);
    }

    public void deleteClient(Integer clientId){
        Client clientDB = clientRepository.getClientById(clientId);
        if (Objects.nonNull(clientDB.getStatus())){
            clientDB.setStatus(1);
        }
    }
}

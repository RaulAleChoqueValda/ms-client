package arquitectura.software.msclient.repository;
s
import arquitectura.software.msclient.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    @Query(value="SELECT * FROM Client", nativeQuery = true)
    List<Client> getClients();

    @Query(value = "SELECT * FROM Client c WHERE c.clientId = :id", nativeQuery = true)
    Client getClientById(Integer id);
}

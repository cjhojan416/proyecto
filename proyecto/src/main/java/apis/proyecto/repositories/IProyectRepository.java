package apis.proyecto.repositories;

import apis.proyecto.models.ProyectModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectRepository extends JpaRepository<ProyectModel,String> {

}

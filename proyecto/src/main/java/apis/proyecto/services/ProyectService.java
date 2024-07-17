package apis.proyecto.services;

import apis.proyecto.models.ProyectModel;
import apis.proyecto.repositories.IProyectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class ProyectService {
    @Autowired
    IProyectRepository proyectRepository;
    public ArrayList<ProyectModel> getProyects(){
        return (ArrayList<ProyectModel>) proyectRepository.findAll();
    }
    public ProyectModel saveProyect(ProyectModel proyect){
        return proyectRepository.save(proyect);
    }
   public ProyectModel updateById(ProyectModel request, String id){
        ProyectModel proyect = proyectRepository.findById(id).get();
        proyect.setNombreProyecto(request.getNombreProyecto());
        proyect.setEstado(request.getEstado());
        proyect.setFechaFinalizacion(request.getFechaFinalizacion());
        proyect.setFechaFinalizacion(request.getFechaFinalizacion());
        return proyect;
   }
   public boolean deleteById(String id){
        try {
            proyectRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
   }
}

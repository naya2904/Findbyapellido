package InterfaceService;

import Modelo.Persona;
import java.util.List;
import java.util.Optional;

public interface IpersonaService {
    public List <Persona> listar();
    public Optional <Persona> listar(int id);
    public int save (Persona p);
    public void delete(int id);
}

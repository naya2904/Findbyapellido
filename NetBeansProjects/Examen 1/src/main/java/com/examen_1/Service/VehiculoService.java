package com.examen_1.Service;



import com.examen_1.domain.Vehiculo;
import java.util.List;

public interface VehiculoService {

    public List<Vehiculo> getVehiculo();

    public void save(Vehiculo vehiculo);

    public void delete(Vehiculo vehiculo);

    public Vehiculo getVehiculo(Vehiculo vehiculo);
}

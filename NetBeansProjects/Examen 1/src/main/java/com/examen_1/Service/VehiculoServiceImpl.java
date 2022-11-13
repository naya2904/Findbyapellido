package com.examen_1.Service;

import com.examen_1.Dao.VehiculoDao;
import com.examen_1.domain.Vehiculo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoDao vehiculoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Vehiculo> getVehiculo() {
        return (List<Vehiculo>) vehiculoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Vehiculo vehiculo) {
        vehiculoDao.save(vehiculo);
    }

    @Override
    @Transactional
    public void delete(Vehiculo vehiculo) {
        vehiculoDao.delete(vehiculo);
    }

    @Override
    @Transactional(readOnly = true)
    public Vehiculo getVehiculo(Vehiculo vehiculo) {
        return vehiculoDao.findById(vehiculo.getId_vehiculo()).orElse(null);
    }
}

package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> index() {
        return carDAO.index();
    }

    @Override
    public List<Car> show(int id) {
        return carDAO.show(id);
    }

}

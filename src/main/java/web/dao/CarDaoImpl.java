package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("ZAZ", "blue", 100000));
        cars.add(new Car("VAZ", "red", 80000));
        cars.add(new Car("GAZ", "white", 75000));
        cars.add(new Car("KAMAZ", "black", 700000));
        cars.add(new Car("YAZ", "grey", 150000));
        cars.add(new Car("YAZ", "grey", 150000));
        cars.add(new Car("YAZ", "grey", 150000));
    }

    public List<Car> index() {
        return cars;
    }

    public List<Car> show(int id) {
        return id>0 && id<5 ? cars.subList(0,id) : cars;
    }
}

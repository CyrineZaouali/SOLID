package com.directi.training.srp.exercise_refactored;

public class CarManager {
    private final CarDao carDao;
    private final CarRater carRater;

    public CarManager(CarDao carDao, CarRater carRater) {
        this.carDao = carDao;
        this.carRater = carRater;
    }

    public Car getCar(final String carId) {
        return carDao.findById(carId);
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : carDao.findAll()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar() {
        return carRater.getBestCar(carDao.findAll());
    }
}

package com.crist.builder.service.impl;

import com.crist.builder.enums.CarType;
import com.crist.builder.enums.Transmission;
import com.crist.builder.model.Car;
import com.crist.builder.model.Engine;
import com.crist.builder.model.GPSNavigator;
import com.crist.builder.model.TripComputer;
import com.crist.builder.service.Builder;

public class CarBuilderImpl implements Builder {
  private CarType type;
  private int seats;
  private Engine engine;
  private Transmission transmission;
  private TripComputer tripComputer;
  private GPSNavigator gpsNavigator;

  public void setCarType(CarType type) {
    this.type = type;
  }

  @Override
  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
  }

  @Override
  public void setGPSNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
  }

  public Car getResult() {
    return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
  }
}

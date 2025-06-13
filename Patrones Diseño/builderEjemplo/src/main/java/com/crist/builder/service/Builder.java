package com.crist.builder.service;

import com.crist.builder.enums.CarType;
import com.crist.builder.enums.Transmission;
import com.crist.builder.model.Engine;
import com.crist.builder.model.GPSNavigator;
import com.crist.builder.model.TripComputer;

public interface Builder {
  void setCarType(CarType type);

  void setSeats(int seats);

  void setEngine(Engine engine);

  void setTransmission(Transmission transmission);

  void setTripComputer(TripComputer tripComputer);

  void setGPSNavigator(GPSNavigator gpsNavigator);
}

import java.util.ArrayList;

// TODO: make this a singleton

class CarCollection {
  private ArrayList<Car> collection;
  
  public CarCollection() {
    collection = new ArrayList<Car>();
  }
  
  public void addCar(Car car) {
    collection.add(car);
  }
  
  public void removeCar(Car car) {
    collection.remove(car);
  }
  
  public void listCars() {
    for (Car car : collection) {
      // TODO: print sequence number AND car
    }
  }
}


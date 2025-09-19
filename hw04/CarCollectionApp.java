/*
 * file: CarCollection.java
 */

// the program does not compile, but if it did, the output would be 
// After your edits, it should compile, run, and produce this

// 1. 2020 Mazda 3 $23000
// 2. 2025 Rivian R1S $77650
// 3. 2025 Honda Prelude $37650

class CarCollectionApp {
  public static void main(String[] arg){

   CarCollection.getInstance().addCar(new Car("Mazda", "3", 2020, 23000));
   CarCollection.getInstance().addCar(new Car("Rivian", "R1S", 2025, 77650));
   CarCollection.getInstance().addCar(new Car("Honda", "Prelude", 2026, 37650));

   CarCollection.getInstance().listCars();
 }
}

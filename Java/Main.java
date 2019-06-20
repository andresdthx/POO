class Main{
    
    public static void main(String[] args){

        Car car = new Car("AMQ123", new Account("Andres","12345"));
        car.printDataCar();

        Car car2 = new Car("DNS200", new Account("Carlos","909090"));
        car2.printDataCar();

    }
}
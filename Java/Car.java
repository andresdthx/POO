class Car {
    int id;
    String license;
    Account driver; //se hereda el nombre de la clase Account
    int passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("Lisencia: " + license);
        System.out.println("Driver: " + driver.name);
        System.out.println("----------------------------------");
    }
}
class UberX extends Car{
    String brand;
    String model;

    //el motodo constructor hijo debe ser igual al del padre
    public UberX(String license, Account driver, String brand, String model){
        //se instancia la clase padre
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}
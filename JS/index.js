var account = new Account("Andres","IND134");
var car = new Car("AWS456",account);

car.passenger = 4;
car.printDataCar();

account.printDataAccount();
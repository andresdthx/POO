from car import Car #importar la clase
from account import Account

def __init__(self,name): #metodo constructor como parametro siempre debe ir el comando 'self'
    self.name = name

if __name__ == "__main__":
    # print("hola mundo python")

    account = Account("Andres", "AND123")
    car = Car("AWS234", account)
    print(vars(car)) #pasa el objeto como parametro
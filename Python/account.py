class Account:

    id       = int
    name     = str
    document = str
    email    = str
    password = str

    def __init__(self, name, document):
        self.name = name
        self.document = document
        # print("class account")
    
    #declaracion del metodo principal
    if __name__ == "__main__":
        print("class account")
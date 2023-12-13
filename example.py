class Human:
    name=""
    age=0

    def __init__(self,givenName,givenAge):
        self.name = givenName
        self.age = givenAge
    
    def funny(self):
        print("I love my food.")
    
if __name__== "__main__":
    myObject = Human("Ronaldo",38)

    print(myObject.name)
    myObject.funny()
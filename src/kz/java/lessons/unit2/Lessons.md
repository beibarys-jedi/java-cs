# Unit 2

## Object and Classes
Object is a specific instance of a class, entity made from class with their own attributes.
Class is a blueprint for creating objects with same behaviors and attributes.

Example: Class House is a blueprint. Object is many houses on a street and created from classes.
Rob's House, Sage's House, Jill's House are objects that have own colors and attributes.

## Constructors
Constructors  used to initialize the attributes for an objects.

```
    public Main(String num, int age, boolean ad) {
        this.num = num;
        this.age = age;
        this.ad = ad;
    }
```

Call by value means we pass the parameters ```"BRuce", 17, true```.

We create object using ```new``` keyword and call the constructor below:

```Dog graceDog = new Dog(""Lesley", "lab 1", 1);```

Overloading constructors means having more than 1 constructors.
No-argument or default constructor has no parameters.

```
   public Car() {
   
   }
```
means the same as below:

```
    public Car() {
        make = null;
        isSports = false;
        owner = null;
    }
```

Let's have a constructor with 2 parameters:

```
    public Car(String mk, boolean sports) {
        make = mk;
        isSports = sports;
        owner = null; // since we don't pass parameter to constructor
    }
```

## Using null in constructors.

Some tips with usage of null in constructors:
1. The keyword ```null``` is a special value used to show that reference is not associated with any object.
2. The memory associated with a variable of a reference type holds an object reference value or, if there is no object, ```null```.
This value is the memory address of the referenced object.

## Homework

Task 1. Create Employee class with name, ID and pay rate.

Task 2. Create object person1 with Simon, 7228 and 600000 dollars.

Task 3. Create objects person2, person3, person4 as shown in Employee class.

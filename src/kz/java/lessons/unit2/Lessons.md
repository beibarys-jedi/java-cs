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


# Methods

Have a look on example with Letter Class.

So let's have an example of Lamp:

Non-static methods can be called through objects of class.

Void methods do not have return values.

Practice with Calculator class.
Practice with Frog class.

Overloading means having the methods with same name but a different signature.

Method signature is a method name and ordered list of parameter types.

Non void methods return a value same type as type in signature, which
can be shown in Calculator2

```
    public double divideBill(int numFriends, double totalBill){
        double amtPerFriend = totalBill/numFriends;
        return amtPerFriend;
    }

```

# String 
Syntax of creating String class is shown below:

```
        String name1 = "Jadon Java";
        // String - class, name1 - variable, Jadon Java - String literal

        String name2 = new String("Jessica Java");
        // String - new String class using new keyword with parameter

        String name3 = new String(name1);
        // name1 will be pointing to actual parameter
```
Strings objects are immutable, which means unable to be changed. 

Concatenation is the joining of data.

Operators used to concatenate are ```+ - means joins, += means redefines```.

So you can add to 

```
int myage = 17;
String name = name1 + myage;
name1 += myage;
```

## Escaping sequences

Escaping sequences allows the output of special characters and insert actions.

```\``` Backslash used to start the escape sequences. Don't confuse with forward slash ```/```.

# String methods

```indexOf``` returns the location of the requested element in a ```String```.

```substring``` method the word which begins from index to index.

## Wrapper classes

`Integer` is a class, notice the word is Capitalized.
`int` is primitive data type, while `Integer` is a reference type.

For `Integer` we have 1 constructor, 3 methods.

For `Double` we have 1 constructor and 1 method.

## Autoboxing

Wrapper classes are used to convert primitive into referencing types.

Autoboxing is automatic conversion of data types from primitive to wrapper classes.

Unboxing is automatic conversion from the wrapper class to the primitive ones.

## JQR Math Class
```
static int abs(int x)
static double abs(double x)
static double pow(double base, double exponent)

```
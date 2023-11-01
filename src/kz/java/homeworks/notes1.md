# Notes 1
## Language features

Today we will try to cover: 

1. Packages
2. Data types
3. Operators
4. Input - Output
5. Control Structures
6. Errors

## Packages

Program consists of packages and classes.

In Java, all classes packed into libraries, and called packages.


For example,
`java.util` for Java Collections (data structures).

`import package.class`


Example 1.

Have a look at code, where Arraylist package have been imported.

```
package kz.java.homeworks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list);
    }
}
```

Notes:
1. All methods should be in class
2. Keywords - static, public, private which are reserved
3. `public` - can be used outside the class, `private` - don't allow to used outside the class
4. `static` - for methods that will not access objects of class. Example, `main` method always static.

## Comments

```        
        // Comment delimiters - Single Line

        /*
        Block line comments
        Multi line Comments
        */
        
        /**
         * Java Docs
         * API Documentation for transmitting from frontend to back
        */

```


## Data types
In Java AP, 3 data types: 
1. int like  -200, 3000, 0 
2. boolean like `True` or `False`
3. double is any scientific number `3.1123124`, `6.62xe^-34`

### How to declare and assign variables
```
// declaring x variable
int x;
int a, b, c;
double k, y, z;
boolean found;
// initializing x variable
x = 10;
found = true;
```

### Type casting int and double
```
int num = 5;
double realNum = num;
// I can cast from int to double with out declaring type casting
int reverseNum = (int) realNum;

//I have to write data type in brackets (int)
System.out.println(num); // output will be 5
System.out.println(realNum); // output will be 0.5
```

### Final 

Final is used for defining variable that will not change

```
final double TAX_RATE = 0.12;
System.out.println(TAX_RATE);

TAX_RATE = 12.4;
```
Constant variables are capitalize, by convention.

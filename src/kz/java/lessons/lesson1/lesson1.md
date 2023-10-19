# Lecture 1
## System.out.print

In Java, we have the following functions to print anything in the console.

1. System.out.print()
2. System.out.println()
But there is a slight difference between both of them, i.e.

```System.out.println()``` prints the content and switch to the next line after execution of the statement whereas

```System.out.print()``` only prints the content without switching to the next line after executing this statement.

## String
String literal in Java - exact sequence of characters in double quotation marks.

You can create string literals below:
```
System.out.println("This is a string literal");
System.out.println("1234%&ABC");
System.out.println("AP CS A Rocks");
```

## Difference between println and print
println puts a cursor of new line the String after displaying output.

Error types we have in Java:
1. Syntax/Compiler Error
2. Exception
3. Logic Error

Program won't compile or run while syntax errors are present.
Exceptions occurs while program is running, which means throws an exception.
Logic error happens when actual output is different from anticipated result.

### Task 1

Consider the following code segment.

```
System.out.print(*);     // Line 1
System.out.print("*");   // Line 2
System.out.println();    // Line 3
System.out.println("*"); // Line 4
```

The code segment is intended to produce the following output, but may not work as intended.
```
**
*
```
Which line of code, if any, causes an error?

### Task 2
Consider the following code segment.
```
System.out.print("One");   // Line 1
System.out.print("Two");   // Line 2
System.out.print("Three"); // Line 3
System.out.print("Four");  // Line 4
```
The code segment is intended to produce the following output, but does not work as intended.
```
OneTwo
ThreeFour
```

### Task 3
Consider the following code segment.
```
System.out.print("*");
System.out.println("**");
System.out.println("***");
System.out.print("****");
```
What is printed as a result of executing the code segment?


# Lecture 2
## Data types
Primitive data types are part of the Java Language. Example of primitive data types are:
1. Int - whole numbers like -1, 234
2. Boolean - true, false
3. Double - floating numbers like 3.27

There are also non-primitive data types, and they can use methods to perform actions.

Primitive ones cannot perform actions. Example of non-primitive is String. 

## Variables 
Variable is a name given to memory location that holds a specific value.
Some rules with naming:
1. may consist letters, digit or underscore
2. cannot start with digit, spaces are not allowed
3. &, @, $ are prohibited to use
4. cannot use reserved words 

camelCase start with lowercase letter like ```thisCamel```. 

Syntax for writing is below:
```dataType variableName; ``` like ```int ageStudent;```

We use ```final``` for representing Constant numbers (as we assign, we cannot change the value). 

Name using all capital case letters and underscore like:
```
final double PI;
final int DAYS_IN_ WEEK;
final boolean SINGULARITY_ROCKS;
```

# Lecture 3
## Arithmetics Expression
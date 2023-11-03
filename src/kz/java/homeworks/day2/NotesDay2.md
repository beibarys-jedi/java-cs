# Notes 2
## If, else, else if

## Loops
Loops can be:
1. for
2. while
3. do-while
4. for-each

For loops syntax:
```agsl
for(initial, termination condition, update){
    statements
}

```

example 1:
```
 for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        // 1 2 3 will printed on a new line
```

example 2:
```
   for (int i = 0; i < 3; i++) {
            System.out.println("Kazakhstan");
        }
        // Kazakhstan will printed 3 times
        // pay attention to 0 and 3
```

example 3:
```
for (int i = 4; i > 1; i--) {
     System.out.println(i);
}
// 4, 3, 2 will be printed
```

A statement `10 8 6 4 2` can be printed in 2 ways:
```
        for (int i = 10; i > 1; i--) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
```

and within `i = i -2`

```
 for (int i = 10; i >= 2; i= i-2) {
    System.out.println(i + " ");
 }
```


Example 3. While can be shown in this way;

```
       int power2 = 1;

        while (power2 < 1000){
            System.out.print(power2 + " ");
            power2 *= 2;
        }
        
        // 1 2 4 8 16 32 64 128 256 512 will be output
```

Nested loops:

```
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        /*
        Result will be following
        *****
        *****
        */
```

Errors and Exceptions:
Exception is an error during the Java program.

1. Unchecked - Java handles using methods
2. Checked - `try`, `catch`, `finally`.

ArithmeticException - when you divide by zero.
ArrayIndexOutOfBoundsException - when negative array index.
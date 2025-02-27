
# CIS 470 Homework #2

By: Matthew Greeson

Date Due: 3/5/25

## Five Selected Functions:

1. A function that reverses a string.
2. A function that converts a decimal number to binary.
3. A function that converts US gallons per week to liters per week.
4. A function that calculates the nth Fibonacci number.
5. A function that checks if a given string is a valid ISBN number.

## 1.) Reverse a String

##### 1.) ECT Coverage:

* Valid partitions: Normal words, numbers as strings, palindromes, special characters, single-character input.
* Invalid partition: null input

##### 2.) BVT Coverage:

* min- : null (invalid)
* min : "" (empty string, edge case)
* min+ : "a" (single-character string)
* max- : "LongString..." (large but valid)
* max : Largest system supported string
* max+ : Exceeding memory limits (not practically testable)

###### Valid Inputs:

* "" (empty string - BVT min)
* "a" (single character - BVT min+)
* "ab" (two-character string - BVT min+)
* "hello" (normal string)
* "12345" (numeric characters)
* "Hello, World!" (special characters)
* "racecar" (palindrome)
* "ThisStringIsSuperLongAndIsUsedForTestingPurposesOnlyInThisAssignment" (large but valid string - BVT max-)

###### Expected Outputs:

###### Invalid Input Error Message:

## 2.) Convert Decimal Number to Binary

##### 1.) ECT Coverage:

* Valid partitions: Positive integers, zero.
* Invalid partitions: Negative numbers, non-integer values.

##### 2.) BVT Coverage:

* min- : -1 (invalid)
* min : 0
* min+ : 1
* max- : Large integer within system limit
* max : System max integer
* max+ : Integer overflow (invalid)

###### Valid Inputs:

* Expected Range: Non-negative integers including 0 and any positive integer (valid within the limits of the system’s integer size).
* Variable Type: Integer (int).

###### Expected Outputs:

* Expected Range: The output will be a string representing the binary equivalent of the input decimal number. For example:
  * Input 0 → Output "0"
  * Input 1 → Output "1"
  * Input 5 → Output "101"
  * Input 112 → Output "1110000"
  * Input Interger.MAX_VALUE → Output: a 31-bit binary string representing Interger.MAX_VALUE.
* Output Variable Type: String.

###### Invalid Input Error Message:

* For Negative Input: "Invalid input: Decimal number must be non-negative."
* For Non-Integer Input: "Invalid input: Decimal number must be integer."

## 3.) Convert US Gallons per Week to Liters per Week

##### 1.) ECT Coverage:

* Valid partitions: Positive numbers (integers and decimals).
* Invalid partitions: Negative numbers, non-numeric input.

##### 2.) BVT Coverage:

* min- : -1 (invalid)
* min : 0
* min+ : 0.1 (smallest positive float)
* max- : Just below practical max (e.g., 999.9 gallons)
* max : 1000 gallons
* max+ : Exceeding max expected input

###### Valid Inputs:

###### Expected Outputs:

###### Invalid Input Error Message:

## 4.) Calculate the nth Fibonacci Number

##### 1.) ECT Coverage:

* Valid partitions: n=0, n > 0.
* Invalid partitions: Negative n, non-integer values.

##### 2.) BVT Coverage:

* min- : -1 (invalid)
* min : 0
* min+ : 1
* max- : Large n below computational limit
* max : Max n the function can handle efficiently
* max+ : Exceeding computationally feasible n

###### Valid Inputs:

###### Expected Outputs:

###### Invalid Input Error Message:

## 5.) Check if a Given String is a Valid ISBN Number

##### 1.) ECT Coverage:

* Valid partitions: ISBN-10, ISBN-13 with/without dashes.
* Invalid partitions: Wrong-length inputs, non-numeric characters (except 'X').

##### 2.) BVT Coverage:

* min- : 9-character input (too short)
* min : 10-character valid ISBN-10
* min+ : 11-character input (invalid length)
* max- : 12-character input (invalid length)
* max : 13-character valid ISBN-13
* max+ : 14-character input (too long)

###### Valid Inputs:

###### Expected Outputs:

###### Invalid Input Error Message:

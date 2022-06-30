# Instructions

Write a program that models an employee. An employee has an employee number, a name, an address, and a hire date. A name consists of a first name and a last name. An address consists of a street, a city, a state (2 characters), and a 5-digit zip code. A date consists of an integer month, day and year. All fields are required to be non-blank. The Date fields should be reasonably valid values (ex. month 1-12, day 1-31, year > 1900 and < 2020). Issue appropriate error messages when incorrect data is entered.

Create an Employee, a Name, an Address, and a Date classes in your solution. You may use the Date class from the lectures or define your own. The Java-supplied Date class cannot be used. Provide appropriate class constructors, getter methods, setter methods, toString() and any other methods you think are necessary. To keep things simple, your classes don’t need to do any editing of data. The classes should not do any direct user input/output. All user input/output will be done in the main method.

Your program should prompt the user to enter data for several employees, store the data in an array of type Employee, and then display the data.

# Thought Process

#### Assumptions
- The user is allowed to enter an unlimited amount of Employee information in 1 program run
- The Employee class can contain other help methods besides the main method
- There will not be a default initialization for any of the classes - correct information must be provided for each prompt
- Name, Address, and Date are public classes that can be used elsewhere besides Employee
- Date class only allows entry of numbers:
  - Month is 1-12
  - Day is 1-31
  - Year is 1900-2022
- The Date class does not need to check that the month, year, and day correspond to each other
- The Address class only checks for the following:
  - Street is a String
  - City is a String
  - State is 2 char String
  - Zip code is 5-digit int
- The Name class only checks for the following:
  - First name is at least 1-char String
  - Last name is at least 1-char String
- No editing of any data needs to be done once information has been entered the first time

#### Discussion
- The Employee's main method class should contain functions that allow the user to continue to provide employee information until the user is satisfied/done
  - This will be implemented with a do-while loop, to allow a first run before asing for continuation
- Data checking for all data input is done in the sub-classes' methods (Name, Address, Date) and called at the Employee class level as a static method
- Employee class instantiates each sub-class, and its methods and attributes, for every Employee entered by the user
- Data input error messages will be System.out.println(), followed by a chance to enter the info again
- An array of arrays will be used to store multiple Employee information

# Implementation Code

The program was written in VSCode on WSL 2, Ubuntu 20.04.4 LTS.

Refer to `./Employee.java` for program. See the code block below (if this is the PDF submission).

```java
// code block goes here for the actual PDF submission
```

# Implementation Output

Below is an output in the VSCode Integrated Terminal.

<img src="./Employee-Completed.png" alt="./Employee-Completed.PNG">

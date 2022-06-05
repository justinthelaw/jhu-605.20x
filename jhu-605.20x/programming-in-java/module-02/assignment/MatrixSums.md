# Instructions

Download the program named Original.java. The program prompts the user to enter six integers and then displays the integers in tabular 3 rows by 2 columns format. Modify the program so that the output looks like the output below. The user may enter any values for the integers.

<img src="./PrintJava.PNG" alt="MatrixSums.PNG" width="50%">

# Thought Process
No diagram was produced due to a lack of complexity in the interfaces and producer-consumer relationships within this assignment.

#### Discussion
Much of the printing solution for this problem has already been written out for the solver. The main things that the program must expand upon are as follows:
- Adding another column that sums up the values of its preceding row values
- Adding another row that sums up the values of its preceding column values
- Inserting a new column to the beginning where "Total" is displayed at the last row
- Adding "----", 4 dashes, to the bottom of each column

#### Assumptions
- The `Original.java` only requires 1 fix to its existing functionality (already written code), which is the addition of a space to the original user-input prompt so that it reads: "Enter 6 integers separated by a blank space: "
- All other `Original.java` existing functionality already works and is portable
- The user-provided input values are never input incorrectly, to include the following possible mistakes:
    - Not entering a values within the range of a Java integer
    - Entering values of different types
    - Not entering values at all
    - Entering too many values (should be ignored anyway)
- Checking the user-provided input values is not required, as it is not explicitly stated in this assignment

# Implementation Code
The program was written in VSCode on WSL 2, Ubuntu 20.04.4 LTS.

Refer to `./MatrixSums.java` for program. See the code block below (if this is the PDF submission).

```java
// code block goes here for the actual PDF submission
```

# Implementation Output
Below is an output in the VSCode Integrated Terminal.

<img src="./MatrixSums-Completed.PNG" alt="./MatrixSums-Completed.PNG">

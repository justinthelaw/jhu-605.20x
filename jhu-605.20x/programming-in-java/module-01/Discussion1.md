# Thought Process

I will try approaching this using the question method outlined in the Problem Solving text.

### How will my program get the input information it needs?

The program will likely declare all the variables, and their types, at the beginning of the main method, to include placeholders for user input.

### What editing, if any, must my program perform?

The program will need to be able to calculate the difference between different measurements of time, to include seconds (60/min), minutes (60/hr), hours (24/day), days (365/yr), and years (5 total, according to the problem statement).

### What information, if any, must be saved?

The user input and basic starting information on current population, days in a year, and 5 year timespan.

### What assumptions, if any, can I make?

I am allowed to assume that the the current population is 312,032,543 and that a year has 365 days. I can also assume that the test-user input will be based around the already provided statistics provided by the U.S. Census Bureau, and that this algorithm only extrapolates population growth out to 5 years per execution.

### Are my assumptions valid for the problem I am trying to solve?

My assumptions should be valid based on the problem statement.

### What would be the impact on the problem solution if my assumptions are not valid?

Due to the simple nature of this extrapolation problem, I believe the only major assumption that would make this solution incorrect is the possibility that the data provided by the user input (U.S. Census Bureau statistics) is incorrect; however, there is no way of checking it as this is a user-defined data.

### Can I simplify the overall problem to be solved by breaking it into sub-problems?

The first problem sets are to make every birth, death, and immigrant statistic scale up to a 5 year timespan. The next problem set is to sum that data with the current population data of the U.S. The final problem set is to display the user inputs and display the final result of those inputs.

### What alternate solutions are possible?

There may be solutions that calculate each of the \*\*/second and sum it to the cumulative population total each time, rather than all at once.

# Pseudo-Code

Below is a copy of the pseudo-code I would use to develop a program to solve the problem.

```js
// The below pseudo-solution assumes pure functional programming and synchronous execution in any generic programming language.
// author: Justin Law
  
extrapolateUSPopulation()
{
int daysPerYear = 365 // days per year assumption
int population = 312032543 // population assumption

print(`Assuming the starting population is ${population}, and there are ${daysPerYear} days/year...`) // starting assumptions are displayed

// _ 60 _ 60 _ 24 _ daysPerYear _ 5 is used to scale up to a 5 year time span
int birthRate = 7 _ 60 _ 60 _ 24 _ daysPerYear _ 5 // default if user provides bad input
int deathRate = -13 _ 60 _ 60 _ 24 _ daysPerYear _ 5 // default if user provides bad input, negative due to deaths
int immigrationRate = 45 _ 60 _ 60 _ 24 _ daysPerYear _ 5 // default if user provides bad input

grabUserInput()
{
// _ 60 _ 60 _ 24 _ daysPerYear _ 5 is used to scale up to a 5 year time span
birthRate = askUserForBirths() _ 60 _ 60 _ 24 _ daysPerYear _ 5
deathRate = askUserForDeaths() _ 60 _ 60 _ 24 _ daysPerYear _ 5
migrationRate = askUserForImmigrationRate() _ 60 _ 60 _ 24 _ daysPerYear _ 5
}

grabUserInput(); // call the grabUserInput function to prompt user for inputs at the start of the program

population = population += (birthrate + deathRate + migrationRate) // sum all numbers together

// print user-made inputs and final result
print(`If births are ${birthRate}/second, deaths are ${deathRate}/second, and immigration is ${migrationRate}/second, then the population will be ${population} people in 5 years.)
}

extrapolateUserInput(); // call the function when program begins
```

If you have any questions or concerns, please reply below! I would love to know if I missed anything while thinking through the problem or writing the psuedo-code. Thank you!

# Original Topic
In this course module you learned about a number of basic arithmetic operators (+, -, /, *, %) as well as shorthand arithmetic operators (++, --, +=, -=, /=, *=). What do you think are the advantages and disadvantages of using the shorthand operators versus the basic arithmetic operators?

# Response
Having experience using these operators in JS/TS mainly, below is a list of things I think shorthand operators differ from basic arithmetic operators:

- The short-hand notations are identifiers of incrementation operations
    -They help third-party programmers understand the context of the code since incrementors are easily differentiated from basic arithmetic handling
    -The short-hand notations allow for more terse (reduced logic size) and robust code
- They allow the programmer to eliminate manual reassignment of the variable to the new value after performing the arithmetic
    - Instead of `x = x + 1` it is now `x += 1`, which is easier to read and understand, abstracting away a reassignment or understanding mistake
- Chaining short hand notations could lead to third-party programmer misunderstanding
    - If more than a couple of short hand notations are used, then the order of precedence (order of operations) and character-overload (lots of signs) can be confusing to a reviewer

Using the basic arithmetic for larger formulas or operations may be easier/quicker to understand to a third-party programmer
These are the main advantages and disadvantages of the two operators from my perspective. Please let me know if I am missing anything or you disagree!
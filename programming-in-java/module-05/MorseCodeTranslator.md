# Instructions

This project involves writing a program to translate Morse code into English and English into Morse code. Your program shall prompt the user to specify the desired type of translation, input a string of Morse code characters or English characters, then display the translated results. The Morse code pattern and English letter translations must be kept and processed using either two one-dimensional or one two-dimensional arrays. When you input Morse code, separate each letter/digit with a single space, and delimit multiple words with a “|”. For example, - --- | -... . would be the Morse code input for the sentence “to be”. Your program only needs to handle a single sentence and can ignore punctuation symbols. When you input English, separate each word with a blank space.

The international version of Morse code for alphabetic characters and digits is shown in the table below.

<img src="MorseCodeTranslator.png" alt="MorseCodeTranslator.png">

# Thought Process

#### Discussion

- The program should first use a method to ask for the user's choice on what type of translation they are trying to perform
- The second method will ask the user for input in accordance with the data entry rules from the problem statement
- The final method will use the user's choice and input to cross-reference 2 arrays that store the Morse Code and English characters in a synchronized index order
- Parsing English into Morse code takes less effort than the opposite
  - Every word in the sentence is separated by a space
  - For every character in a word, translate to Morse code
  - Push Morse code into a string with a space
  - For every space in the sentence, input a "|"
  - Any punctuation or unknown character gets discarded/skipped
  - Use trim() to ensure last/first space of the sentence is eliminated
- Parsing Morse code for translation back to English is more difficult
  - Do everything similar to parsing the English
  - Difference is that every space is considered a new character
  - Difference is that every "|" is a space in the sentence

#### Assumptions

- User input can be taken and checked in any way
- User input for translation of Morse code or English is a (1) or (2)
- Punctuation and incorrect input (e.g. inputting Morse code after choosing to translate from English to Morse code) can be ignored

# Implementation Code

The program was written in VSCode on WSL 2, Ubuntu 20.04.4 LTS.

Refer to `./MorseCodeTranslator.java` for program. See the code block below (if this is the PDF submission).

```java
// code block goes here for the actual PDF submission
```

# Implementation Output

Below is an output in the VSCode Integrated Terminal.

<img src="./MorseCodeTranslator-Completed.png" alt="./MorseCodeTranslator-Completed.PNG">

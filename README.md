# Mad Libs

This project is a Kotlin implementation of the classic word game Mad Libs. In this game, players are prompted to enter various types of words (such as nouns, verbs, adjectives, etc.), which are then used to fill in the blanks of a short story. The resulting story is often funny or nonsensical, depending on the words chosen.

## Requirements

To run this project, you will need to have the Kotlin compiler installed on your machine. You can download the compiler from the [Kotlin website](https://kotlinlang.org/docs/tutorials/command-line.html).

## Getting Started

To run the program, follow these steps:

1. Open a terminal or command prompt and navigate to the directory where the `Main.kt` file is located.

2. Compile the Kotlin code using the following command:

kotlinc Main.kt -include-runtime -d madlibs.jar

3. Run the compiled program using the following command:

java -jar madlibs.jar


4. Follow the prompts in the terminal to enter the required words.

5. Once all the words have been entered, the completed story will be printed to the terminal.

## Program Overview

This program prompts the user to enter various words, such as nouns, verbs, adjectives, and so on, and then uses these words to fill in the blanks of a short story. The story is about two friends who are saving money for a road trip to see their favorite band. The program uses built-in methods in Kotlin to work with different data types and conversions, such as converting strings to integers and rounding decimal values.

The program consists of a single `main` function, which is responsible for prompting the user for input and printing the completed story to the terminal. The input is gathered using the `readLine` function, which reads a line of text from the terminal and returns it as a string. The input is then used to fill in the blanks of the story using string interpolation.

## Acknowledgments

This project was inspired by the Mad Libs word game and the Kotlin programming language. Special thanks to the Kotlin team for creating such a great language, and to the developers who contributed to the Kotlin standard library.






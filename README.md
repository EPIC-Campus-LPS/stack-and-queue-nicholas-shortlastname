# Lab 5: Stacks and Queues

## Objective

Implement a stack and queue class using an array of integer values.

## Project Details

- Create a class `Stack` which implements a simple stack using an array of integer values and contains the following
  methods
    - `push(int element)`: push element onto the top of the stack
    - `pop()`: removes and returns the top of the stack. Throws EmptyStackException if the stack is empty
    - `peek()`: returns, but does not remove, the top of the stack. Throws EmptyStackException if the stack is empty
    - `size()`: returns the number of elements in the queue
    - `isEmpty()`: returns true if there are no elements in the stack, false otherwise
- Create a class `Queue` which implements a simple queue using an array of integer values and contains the following
  methods
    - `add(int element)`: adds element to the queue
    - `remove()`: removes and returns the head of the queue. Throws NoSuchElementException if the queue is empty
    - `peek()`: returns, but does not remove, the head of the queue. Throws NoSuchElementException if the queue is empty
    - `size()`: returns the number of the elements in the queue
    - `isEmpty()`: returns true of there are no elements in the queue, false otherwise
- All operations should be efficient and run in constant time.
- For each class, add appropriate Javadoc comments and generate Stack.HTML and Queue.HTML for your classes. **Include
  the runtime of each method in each Javadoc comment description.**

## Test Cases

- To assess your Stack and Queue classes, I will run them against my own tester (similar to the tester you were provided
  for your last lab.) Since this tester is not included in the starter code for this assignment, you will be responsible
  for creating your own test cases to check the accuracy of your program before turning it in.
- Make sure your test cases check for correctness against a variety of inputs.

## Reflection Questions

- What is the fundamental principle behind a stack?
- In what situations would using a stack be beneficial?
- What is the fundamental principle behind a queue?
- In what situations would using a queue be beneficial?

## Rubric

- 4 points – All requested items are present. Functional and efficient Stack and Queue class. Javadoc reference for both
the Stack and Queue class. Reflection questions were answered in the README
- 3 points – Some of the requested items are missing. Classes are complete but are missing Javadoc reference. Classes do
not run in constant time, etc.
- 2 points – Missing or incomplete. Student should re-attempt

---

# Style Guidelines

## Lab 5: Style Guide

### Comments

The expectations for Javadoc comments are the same as the previous
lab.  [Here is the IntelliJ  documentation](https://www.jetbrains.com/help/idea/javadocs.html) again if you need more
information. In addition to Javadoc comments, your code should include regular comments to explain anything that is not
immediately obvious.

# Data Structures Style Guide

In this course, we will not only practice writing code but how to write good code. Learning how to write good code
includes a number of stylistic conventions. As we move further into the course, the expectations for appropriate style
and documentation will become more extensive as we continue to practice. It is expected that you keep the style
guidelines introduced in previous assignments in mind during the current assignment. This document will include a
generic introduction to aspects of style relevant to this class in addition to specifics regarding this assignment.

## Types of Style Guidelines

There are six main categories of guidelines to look out for during this course.

### Formatting

Formatting refers to the way code is structured. This includes indentations, brackets, and whitespace. Using clear and
consistent formatting throughout makes writing and reading code easier. It is even more important when multiple people
are working on the same program. In IntelliJ, there are built-in formatting rules which you can apply by:

- Going in the _Code_ menu and selecting _Reformat Code_.
- Using the keyboard shortcut, which by default is Ctrl+Alt+L on Windows and Opt+Cmd+L on Mac.

### Comments

Comments are statements of code that are not executed by the compiler or interpreter. We use them to explain what
different pieces of do. Regardless of the complexity of the program, commenting all of your work appropriately is a good
habit to get into.

In general, your comments should:

- Be concise: only write as much as is necessary to convey relevant information
- Help the reader: write them with the intention of a third party using them to understand your code, especially if it
  is not immediately obvious
- Break the code into smaller units: Comments help separate code at logical breaks like the beginning of a loop, a new
  step in a larger calculation, or at the beginning of a function

Commenting can be used as part of an effective code writing strategy as well. Instead of commenting after the code is
written, try commenting before writing the code. By breaking down your program logically into smaller chunks and then
working on those small chunks individually, you can avoid some bugs and logical errors

#### Javadoc

Javadoc is a tool that generates Java code documentation in the HTML format from Java source code. The documentation is
formed from Javadoc comments that are usually placed above classes, methods, or fields.

### Naming

Naming variables, constants, functions, and classes is key to writing good code. Names should help the reader understand
what is going on in your program.

In general, names should be:

- Accurate and informative: Names should reflect the contents or purpose of the entity as much as possible
- Concise: Names should be as concise as possible without sacrificing the above bullet point too much. It's a balance.
- Consistent: Use consistent names and naming conventions throughout your programs. See the section below for more
  information about Java-specific conventions.

#### Java Conventions

In Java there are a few different conventions programmers use.

- For variables and functions, we will typically use camelCase
- For constants, we use CAPS_SNAKE_CASES
- For files, we use UpperCamelCase

### Maintainability

Maintainable code is easy to work on, update, and change without the original author needing to be present.
Maintainability is a broad catch-all category for other aspects of good code that make it easy for you and others on
your team to work on and debug code.

### Efficiency

It is important to not only write code that is correct, but efficiently uses resources (primarily memory and time). We
will talk about this more extensively later in the course, but is something to keep in mind. Efficient code is
increasing important as we write code to handle larger and larger inputs.

### Concision

Your code should be as concise as possible without sacrificing readability. Just like with commenting, this is a
balance.  


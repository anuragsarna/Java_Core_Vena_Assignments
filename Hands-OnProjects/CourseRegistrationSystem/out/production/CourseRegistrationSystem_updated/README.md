# University Course Registration System

## Overview

This project implements a modular and scalable university course registration system in Java using the Java Collections Framework.

## Features

- Add students and courses
- Register students to courses with waitlisting if full
- Drop students from courses and auto-promote from waitlist
- List students by course or branch
- List and filter courses by instructor or credit count

## Project Structure

```
CourseRegistrationSystem/
├── model/
│   ├── Student.java
│   └── Course.java
├── service/
│   └── RegistrationSystem.java
├── main/
│   └── Main.java
└── README.md
```

## How to Run

1. Compile all Java files:
```bash
javac model/*.java service/*.java main/*.java
```

2. Run the main class:
```bash
java main.Main
```

## Sample Output

```
Student successfully enrolled.
Course is full. Student added to waitlist.
Student dropped successfully.

Students in CSE101:
Bob
```

# OOP Project Rules & Conventions

## 1. Naming Conventions

### Classes

-   PascalCase
-   Use nouns

Example: - Student - ResearchProject

------------------------------------------------------------------------

### Methods

-   camelCase
-   Use verbs

Example: - registerForCourse() - calculateGPA()

------------------------------------------------------------------------

### Variables

-   camelCase
-   Descriptive names

Example: - studentList - totalCredits

------------------------------------------------------------------------

### Constants

-   UPPER_CASE

Example: - MAX_CREDITS = 21

------------------------------------------------------------------------

### Enums

-   Name: PascalCase
-   Values: UPPER_CASE

Example: enum UrgencyLevel { LOW, MEDIUM, HIGH }

------------------------------------------------------------------------

## 2. Class Design Rules

-   One responsibility per class
-   Avoid "god classes"

Good: - Student → student data - Course → course data

Bad: - SystemManager doing everything

------------------------------------------------------------------------

## 3. UML Consistency

-   Every class in code must exist in UML
-   Relationships must match

------------------------------------------------------------------------

## 4. Method Design

-   Keep methods small (10--20 lines)
-   One method = one job

------------------------------------------------------------------------

## 5. Exceptions

Use custom exceptions where needed

Example: throw new InvalidSupervisorException();

------------------------------------------------------------------------

## 6. Team Workflow

-   Use branches
-   No direct push to main
-   Use pull requests

------------------------------------------------------------------------

## 7. Documentation

Each class should have a short description.


------------------------------------------------------------------------

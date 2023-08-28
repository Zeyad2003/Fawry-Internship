# Abstract Factory Task

## Task description
![Task Image](https://refactoring.guru/images/patterns/diagrams/abstract-factory/problem-en.png)

- Check the above picture and create a system that can simulate the process of creating these furniture.
- Use your knowledge in design patterns mainly the **abstract factory pattern**.

## My Solution

- I made 3 families for the furniture: **Chair**, **Table**, and **Sofa**.
- Each family has 3 types: **Modern**, **Victorian**, and **Art-Deco**.
- I created an Enum for the types of furniture.
- I created 3 Factories for each family, then `AbstractFactory` to handle these factories.
- Every Factory should detect the type of the furniture then return the appropriate object.

**Check the code for better understanding.**
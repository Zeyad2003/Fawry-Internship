# Design Pattern Task 3

## Requirements
![Task3](https://github.com/Zeyad2003/Fawry-Internship/assets/87117386/73a6f3af-57f7-416c-be2c-44534576727d)

## Solution
By using multiple design patterns, and linking them together, we can simulate the `HSS` system.
I used:
  - `Singleton` to make sure that there's only one instance created from `logger` class.
  - `Abstract Factory` to attach sensors to different families based on the manufacture company.
  - `Command` to execute the commands of the sensors.
  - `Adapter` to allow multiple message format to be sent to the home owner.

> [!NOTE]
> Run the application and wait until finish, then check the `log.txt` file to see the output.
# Singleton Pattern Task

### Requirements

- Create a singleton class that can be accessed by multiple threads at the same time.
- Discuss how different implementation of singleton pattern can impact the performance of the application.

### My Solution
**You need to run the program multiple times to see the difference in the output.**
- I created 2 classes that implements `Runnable` interface and each class has a `run()` method that will create a new instance of the singleton class.
- The 2 `run()` methods use 2 different implementations of the singleton class.
- The `badSingleton` class is not thread-safe, so it can create multiple instances of the singleton class.
- On the other hand, the `goodSingleton` class is thread-safe, so it can only create one instance of the singleton class.

**Check the code for better understanding.**
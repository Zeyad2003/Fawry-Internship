# Design Pattern Part 1

## Resources

- Eng/ Ahmed Ali [Session part 1](https://drive.google.com/drive/u/2/folders/1ei3Mu6EHKMSgOFlekMhovNn4OGTD0ts9) & [Slides and Code Samples](https://fawry-my.sharepoint.com/:f:/p/ahmed_ali/EmOyq6atUGtGkD3sl8q6Z78B_0HGYTPIDotNgSCzQKQHRA)
- Readings
    - [Refactoring Guru Website](https://refactoring.guru/design-patterns)
    - [Java-T-Point Website](https://www.javatpoint.com/design-patterns-in-java)
    - [Design Patterns for Humans](https://roadmap.sh/guides/design-patterns-for-humans#-factory-method)

- Videos
    - [Programming with Mosh Video](https://www.youtube.com/watch?v=NU_1StN5Tkk&list=PLsyeobzWxl7r2ZX1fl-7CKnayxHJA_1ol&index=1)
    - [Darek Banas Playlist](https://www.youtube.com/watch?v=vNHpsC5ng_E&list=PLF206E906175C7E07&index=1)

---

## Tasks
- [**Abstract Factory Task**](Task1)
- [**Singleton Task**](Task2)

---

## Some Notes & Explanations

**What is a Design Pattern?**
> **Important**
> _In software engineering, a software design pattern is a general reusable solution to a commonly occurring problem
within a given context in software design. It is not a finished design that can be transformed directly into source or
machine code. It is a description or template for how to solve a problem that can be used in many different situations._

- Efficient, reusable, and maintainable solutions to common software problems.
- It's like a blueprint for solving a certain type of problems, but it's not a specific set of instructions you can just
  copy.

> **Note**
> **Pattern** has some similarities with **Algorithm**, but you can imagine it as a higher level of abstraction.

**There are 3 types of Design Patterns:**

1. **Creational Patterns:**
    - Related to object creation.
    - Provide object creation mechanisms that increase flexibility and reuse of existing code.

2. **Structural Patterns:**
    - Related to object composition and relationships between classes.
    - They help to answer How to build a software component to be efficient and flexible.

3. **Behavioral Patterns:**
    - Related to communication between objects.
    - Take care of effective communication and the assignment of responsibilities between objects.

---

#### We are going to discuss 3 Design Patterns from `Creational Patterns`.

1. **[Factory](#factory)**
2. **[Abstract Factory](#abstract-factory)**
3. **[Singleton](#singleton)**

## <a name="factory"></a> Factory Design Pattern

> ![Factory Img](https://refactoring.guru/images/patterns/content/factory-method/factory-method-en.png?id=cfa26f33dc8473e803fadae0d262100a)
>
> _Consider, you are building a house and you need doors. You can either put on your carpenter clothes, bring some wood,
glue, nails, and all the tools required to build the door and start building it in your house, or you can simply call the
factory and get the built door delivered to you so that you don’t need to learn anything about the door making or to
deal with the mess that comes with making it._

- **Factory:** is a creational design pattern that provides an interface for creating objects.

### The Problem:

- To create instances of several related classes, I have to know their concrete classes and their dependencies.
- Is there a way to create an instance of a class without knowing its concrete class?
- Creating multiple objects within the same class breaks the Design Principles.

### The Solution:

- Define an interface for creating the object you want, and it will be responsible for instantiating the concrete
  classes.
- It lets the subclasses decide which class to instantiate.

**So we replace the normal instantiation with `new` keyword by using a factory method that returns the object we want.**

> ![Factory Method Pattern](https://refactoring.guru/images/patterns/diagrams/factory-method/solution1.png?id=fc756d2af296b5b4d482e548214d08ef)
>
> We used <code>createTransport()</code> factory method when we need to instantiate an object.

### When to Use?

- When creating an object is not just a few assignments and involves some logic, it makes sense to put it in a dedicated
  factory instead of repeating the same code everywhere.
- When there is some generic processing in a class but the required sub-class is dynamically decided at runtime.
  In other words, when the client does not know what exact sub-class it might need.

<details>
  <summary>
    <h3>Factory Example</h3>
  </summary>


Let’s see an example of how the factory method pattern can be applied.
Suppose we have a class called AnimalShelter that takes care of different kinds of animals.
The AnimalShelter class has a method called adoptAnimal that returns an Animal object to the caller.
The Animal object can be a Dog, a Cat, or a Bird, depending on the availability and preference of the adopter.
Here is what the AnimalShelter class might look like without using the factory method pattern.

### Before:

```java
// An interface for all animals
public interface Animal {
    void makeSound();
}
```

```java
// A concrete class for dogs
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```

```java
// A concrete class for cats
public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
```

```java
// A concrete class for birds
public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }
}
```

```java
// A class that manages the adoption of animals
public class AnimalShelter {

    // A method that returns an animal object to the adopter
    public Animal adoptAnimal(String type) {
        // Create an animal object based on the type parameter
        Animal animal = null;
        if (type.equals("dog")) {
            animal = new Dog();
        } else if (type.equals("cat")) {
            animal = new Cat();
        } else if (type.equals("bird")) {
            animal = new Bird();
        }
        // Return the animal object to the caller
        return animal;
    }
}

```

> Imagine that I want to add another type of animals to the AnimalShelter class, such as fish.
> I have to go to the adoptAnimal method and add another else if statement to create a fish object.
> If you
>
remember [Open-Closed Principle](https://www.freecodecamp.org/news/open-closed-principle-solid-architecture-concept-explained/),
> you will find that we are breaking it here.

### After:

```java
// An interface for all animals
public interface Animal {
    void makeSound();
}
```

```java
// A concrete class for dogs
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```

```java
// A concrete class for cats
public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
```

```java
// A concrete class for birds
public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }
}
```

```java
// A concrete class for fish
public class Fish implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Blub!");
    }
}
```

```java
// An abstract class that defines the factory method for creating animals
public abstract class AnimalFactory {

    // The factory method that creates and returns an animal object
    public abstract Animal createAnimal();

    // A method that returns an animal object to the adopter
    public Animal adoptAnimal() {
        // Call the factory method to create an animal object
        Animal animal = createAnimal();
        // Return the animal object to the caller
        return animal;
    }
}
```

```java
// A concrete subclass that implements the factory method for creating dogs
public class DogFactory extends AnimalFactory {

    // Override the factory method to create and return a dog object
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
```

```java
// A concrete subclass that implements the factory method for creating cats
public class CatFactory extends AnimalFactory {

    // Override the factory method to create and return a cat object
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
```

```java
// A concrete subclass that implements the factory method for creating birds
public class BirdFactory extends AnimalFactory {

    // Override the factory method to create and return a bird object
    @Override
    public Animal createAnimal() {
        return new Bird();
    }
}
```

```java
// A concrete subclass that implements the factory method for creating fish
public class FishFactory extends AnimalFactory {

    // Override the factory method to create and return a fish object
    @Override
    public Animal createAnimal() {
        return new Fish();
    }
}
```

### Testing Factory

```java
// A main class to test the factory method pattern
public class Main {

    public static void main(String[] args) {
        // Create a dog factory object
        AnimalFactory dogFactory = new DogFactory();
        // Adopt a dog from the dog factory
        Animal dog = dogFactory.adoptAnimal();
        // Make the dog sound
        dog.makeSound();

        // Create a cat factory object
        AnimalFactory catFactory = new CatFactory();
        // Adopt a cat from the cat factory
        Animal cat = catFactory.adoptAnimal();
        // Make the cat sound
        cat.makeSound();

        // Create a bird factory object
        AnimalFactory birdFactory = new BirdFactory();
        // Adopt a bird from the bird factory
        Animal bird = birdFactory.adoptAnimal();
        // Make the bird sound
        bird.makeSound();

        // Create a fish factory object
        AnimalFactory fishFactory = new FishFactory();
        // Adopt a fish from the fish factory
        Animal fish = fishFactory.adoptAnimal();
        // Make the fish sound
        fish.makeSound();
    }
}

```

</details>

---

## <a name="abstract-factory"></a> Abstract Factory Design Pattern

> ![Abstract-Factory-Pattern](https://refactoring.guru/images/patterns/content/abstract-factory/abstract-factory-en.png)
>
> Extending our door example from Simple Factory. Based on your needs you might get a wooden door from a wooden door
> shop, iron door from an iron shop or a PVC door from the relevant shop. Plus you might need a guy with different kind of
> specialities to fit the door, for example a carpenter for wooden door, welder for iron door etc. As you can see there is
> a dependency between the doors now, wooden door needs carpenter, iron door needs a welder etc.

- **Abstract Factory:** is a creational design pattern that lets you produce families of related objects without
  specifying their concrete classes.

### The Problem:

- How can we create a set of related objects without specifying their concrete classes?
- How can a class be independent of how the objects it creates are composed?

### The Solution:

- Divide the objects into related families so and create an abstract class for each family.
- Imagine it as a factory of factories.

**So we group the related factories together and create an abstract class for each group. We call it `Family`**

> ![Abstract Factory Pattern](https://refactoring.guru/images/patterns/diagrams/abstract-factory/structure.png)
>
> We used <code>GUIFactory</code> interface to create a family of related objects.
> To ensure the image you can see the explanation and implementation of it from
> Bing [here](https://sl.bing.net/bIDIyYQcWmi)

### When to Use?

- When you need to create a set of related objects, and you don't want to depend on their concrete classes.
- When you want to provide a class library of products, and you want to reveal just their interfaces, not their
  implementations.
- When you want to enforce a specific constraint on how the objects are created.

---

## <a name="singleton"></a> Singleton Design Pattern

> ![Singleton Pattern](https://refactoring.guru/images/patterns/content/singleton/singleton.png)
>
> There can only be one president of a country at a time. The same president has to be brought to action, whenever duty
> calls.
> The president here is Singleton.

- **Singleton:** is a creational design pattern that lets you ensure that a class has only one instance, while
  providing a global access point to this instance.

### The Problem:

- Sometimes I need to create only one instance of a class, like a database connection.
- How can I ensure that a class has only one instance and provide a global access point to this instance?

### The Solution:

- Define a static method that returns the same instance of the class every time it's called.
- Make the constructor private to prevent other objects from using the `new` operator with the Singleton class.
  **Take care of your implementation in case multiple threads are trying to create the instance at the same time.**

> ![Singleton Pattern](https://refactoring.guru/images/patterns/content/singleton/singleton-comic-1-en.png)
>
> Clients may not even realize that they’re working with the same object all the time.

### When to Use?

- In some cases that requires you to create only one instance of a class, like a database connection.

---

### Great you reached here!!🥳

**We finished the 3 patterns we studied in the intern.**
**There's 2 remaining Creational Patterns we did not talk about you, feel free to review:**
- [Builder Pattern](https://refactoring.guru/design-patterns/builder)
- [Prototype Pattern](https://refactoring.guru/design-patterns/prototype)

**There's an organized code samples that explain all patterns we talk about, _Check the resources_**
**There's [Part 2](../../Week4/DesignPattern2) we talk about Structural Patterns.**

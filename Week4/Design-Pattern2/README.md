# Design Pattern Part 2

## Tasks
 - [Task 2](Task2)

## Some Notes & Explanations

#### We are going to discuss 4 Design Patterns from `Structural Patterns`.

1. **[Adapter](#adapter)**
2. **[Decorator](#decorator)**
3. **[Facade](#facade)**
4. **[Proxy](#proxy)**

## <a name="adapter"></a> Adapter Design Pattern

> ![Adapter img](https://refactoring.guru/images/patterns/content/adapter/adapter-en.png)
>
> Consider you need to transfer a car through the railway, but the car can't move on the railway.
> So we use the train or any other vehicle that can move on the railway to transfer the car.
> The train in our example will be **Adapter**.

### The Problem:

> ![Adapter Problem](https://refactoring.guru/images/patterns/diagrams/adapter/problem-en.png)
>
> Suppose you work with Application that deal with data in `xml` format, and you need to integrate with external
> library.
> The problem that this library only accept data in `json` format.

### The Solution:

> ![Adapter Solution](https://refactoring.guru/images/patterns/diagrams/adapter/solution-en.png)
>
> We need to create an adapter that will convert the data from `xml` to `json` and vice versa.
> So now we can use the external library without any issues with the data type.

**So what is the definition of the Adapter Design Pattern?**
> [!IMPORTANT]
> the adapter pattern is a software design pattern that allows the interface of an existing class to be used as another
> interface. It is often used to make existing classes work with others without modifying their source code.

### When to use?

- When you want to make two incompatible systems work together.
- When you want to extend an existing class without modifying it.
- When you want to create a reusable class that can adapt to different interfaces.

**Here is the UML diagram for the Observer Design Pattern ⬇**
> ![Adapter UML](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png)

---

## <a name="decorator"></a> Decorator Design Pattern

> ![Decorator img](https://refactoring.guru/images/patterns/content/decorator/decorator.png)
>
> Imagine a company that offer multiple services, and each service has a different cost.
> So if a customer uses multiple services, how the company will calculate the total cost?
> We start calculating the price by picking the cost of any service and keep adding the cost of the other services till
> we get the total cost.
> Here each type of service is a **Decorator**.

### The Problem:

- Sometimes I may need to add or change the object behavior during the run time.
- How can I do this in a dynamic way?

### The Solution:

- Using decorator pattern will facilitate this task.

**So what is the definition of the Decorator Design Pattern?**
> [!IMPORTANT]
> - The decorator pattern is a design pattern that allows behavior to be added to an individual object, either
    statically or dynamically, without affecting the behavior of other objects from the same class.
> - Decorator pattern lets you dynamically change the behavior of an object at run time by wrapping them in an object of
    a decorator class.

- **Why we don't use inheritance instead of decorator pattern?**
    - Inheritance is static, and can't be changed during the run time.
    - On the other hand, decorator can be changed during the run time and I can use it or discard it whenever I want.

> ![Decorator imagination](https://refactoring.guru/images/patterns/content/decorator/decorator-comic-1.png)
>
> - In the first picture from the left, the guy in the picture represent the object.
> - When the weather gets cold, I need to attach a new behavior to it during the run time, so I add a sweater to it.
> - The third one, it's raining, so I need to add a raincoat to it.
> - Everytime I added something this mean I used **Decorator Pattern**.

**Here is the UML diagram for the Observer Design Pattern ⬇**
> ![Decorator UML](https://refactoring.guru/images/patterns/diagrams/decorator/structure.png)

---

## <a name="facade"></a> Facade Design Pattern

> ![Facade img](https://refactoring.guru/images/patterns/content/facade/facade.png)
>
> How do you turn on the computer? “Hit the power button” you say! That is what you believe because you are using a
> simple interface that computer provides on the outside, internally it has to do a lot of stuff to make it happen.
> This simple interface to the complex subsystem is a facade.

### The Problem:

- The bigger the system is, the more complex it will be, the harder it will be to interact with it.
- The user should not need to know the system details to interact with it.
- How to make the system easy to use?

### The Solution:

- Using facade pattern will facilitate this task.
- The facade pattern provides a simplified interface to a complex subsystem.
- A higher level of abstraction over the system without exposing the user to the system details.

**So what is the definition of the Facade Design Pattern?**
> [!IMPORTANT]
> - A facade is an object that provides a simplified interface to a larger body of code, such as a class library.

**Here is the UML diagram for the Observer Design Pattern ⬇**
> ![Facade UML](https://refactoring.guru/images/patterns/diagrams/facade/structure.png)

---

## <a name="proxy"></a> Proxy Design Pattern

> ![Proxy img](https://refactoring.guru/images/patterns/content/proxy/proxy.png)
>
> Have you ever used an access card to go through a door? There are multiple options to open that door i.e. it can be
> opened either using access card or by pressing a button that bypasses the security. The door’s main functionality is
> to
> open but there is a proxy added on top of it to add some functionality.

### The Problem:

- There's multiple clients that want to access some data from the server.
- Some clients may have the permission to access the data, and some may not.
- How to control the access to the data?

### The Solution:

- Using proxy pattern will facilitate this task.
- The proxy pattern provides a surrogate or placeholder for another object to control access to it.

**So what is the definition of the Proxy Design Pattern?**
> [!IMPORTANT]
> - A class functioning as an interface to something else.
> - Proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the
    scenes.

**Here is the UML diagram for the Observer Design Pattern ⬇**
> ![Proxy UML](https://refactoring.guru/images/patterns/diagrams/proxy/structure.png)

---

### Great again you reached here!!🥳

**We finished the 4 patterns we studied in the intern.**
**There's 3 remaining Structural Patterns we did not talk about you, feel free to review:**

- [Bridge Pattern](https://refactoring.guru/design-patterns/bridge)
- [Composite Pattern](https://refactoring.guru/design-patterns/composite)
- [Flyweight Pattern](https://refactoring.guru/design-patterns/flyweight)

**There's [Part 3](../../Week5/Design-Pattern3) we talk about Behavioural Patterns.**

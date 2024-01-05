# Design Pattern Part 3

## Prerequisites

- [Design Pattern Part 1](../../Week3/DesignPattern1)
- [Design Pattern Part 2](../../Week4/DesignPattern2)

## Resources

- **The full resources exist in part 1**
- Eng/ Ahmed Ali [Session Part 3](https://drive.google.com/file/d/1rXxhMd9HpD6ltyruTG7K49VHkWzy5fe4/view?usp=drive_link) (Unfortunately not complete 😔)

## Tasks
[**HSS Task**](Task3)

## Some Notes & Explanations

#### We are going to discuss 4 Design Patterns from `Behavioural Patterns`.

1. **[Observer](#observer)**
2. **[Template](#template)**
3. **[Strategy](#strategy)**
4. **[Command](#command)**

## <a name="observer"></a> Observer Design Pattern

> ![Observer img](https://refactoring.guru/images/patterns/content/observer/observer.png)
>
> A good example would be the job-seekers where they subscribe to some job posting site and they are notified whenever
> there is a matching job opportunity.

### The Problem:

> ![Observer Problem](https://refactoring.guru/images/patterns/content/observer/observer-comic-1-en.png)
>
> If I am a client and want to check some condition in the system, I will need to check it manually every time. `Painful`
> Another option, I can design the system to notify all users when any change happens. `Annoying`
> How can I solve this problem?

### The Solution:

> ![Observer Solution](https://refactoring.guru/images/patterns/diagrams/observer/solution1-en.png)
>
> Imagine **YouTube** system, when you subscribe to a channel, you will be notified when any new video is uploaded.
> `Observer` pattern does the same thing, there is a `Subject` that has a list of `Observers` and when any change,
> `Subject` will notify all `Observers` to update their data.

**So what is the definition of the Observer Design Pattern?**
> [!IMPORTANT]
> The observer pattern: defines a one-to-many dependency between objects so that when one object changes state, all its
> dependents are notified and updated automatically.

**Here is the UML diagram for the Observer Design Pattern ⬇**
> ![Observer UML](https://refactoring.guru/images/patterns/diagrams/observer/structure.png)

### When to use?

- When you want to support dynamic and flexible subscriptions, where observers can register and unregister from the
  subject at any time.
- When you want to send notifications to specific objects.

---

## <a name="template"></a> Template Design Pattern

> ![Template img](https://refactoring.guru/images/patterns/content/template-method/template-method.png)
>
> Suppose we are getting some house built. The steps for building might look like
>
> - Prepare the base of house
> - Build the walls
> - Add roof
> - Add other floors
>
> The order of these steps could never be changed i.e. you can’t build the roof before building the walls etc.
> Each of the steps could be modified for example walls can be made of wood or polyester or stone.

### The Problem:

- Imagine you solve a coding problem using `Binary-Search` algorithm, and you want to solve another problem using the
  same algorithm, but you should change some steps or conditions in the algorithm to solve the problem.

### The Solution:

- Using `Template` pattern will facilitate this task.
- The template method pattern defines a template for the algorithm, and you may change some steps or conditions in the
  algorithm to solve the problem, but the order of these steps could never be changed.

**So what is the definition of the Template Design Pattern?**
> [!IMPORTANT]
> In software engineering, the template method pattern is a behavioral design pattern that defines the program skeleton
> of an algorithm in an operation, deferring some steps to subclasses.
> It lets one redefine certain steps of an algorithm without changing the algorithm’s structure.

**Here is the UML diagram for the Template Design Pattern ⬇**
> ![Template UML](https://refactoring.guru/images/patterns/diagrams/template-method/structure.png)

### When to use?

- When you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its
  structure.

---

## <a name="strategy"></a> Strategy Design Pattern

> ![Strategy img](https://refactoring.guru/images/patterns/content/strategy/strategy.png)
>
> Consider the example of sorting, we implemented bubble sort but the data started to grow and bubble sort started
> getting very slow. In order to tackle this we implemented Quick sort. But now although the quick sort algorithm was
> doing better for large datasets, it was very slow for smaller datasets. In order to handle this we implemented a
> strategy where for small datasets, bubble sort will be used and for larger, quick sort.

### The Problem:

- Imagine you solve a maximization problem.
- After tackling the problem, you found multiple solutions with different algorithms and techniques!!
- You know that you can't use all of them.

### The Solution:

- There's a pattern called `Strategy` it will define some steps for every strategy, and you can choose the best
  strategy for your problem based on the constraints and ease of implementation.
- After check them you can switch between them easily based on the situation.

**So what is the definition of the Strategy Design Pattern?**
> [!IMPORTANT]
> It is a behavioural software design pattern that enables an algorithm’s behavior to be selected at runtime.

**Here is the UML diagram for the Strategy Design Pattern ⬇**
> ![Strategy UML](https://refactoring.guru/images/patterns/diagrams/strategy/solution.png)

---

## <a name="command"></a> Command Design Pattern

> ![Command img](https://refactoring.guru/images/patterns/content/command/command-en.png)
>
> A generic example would be you ordering food at a restaurant. You (i.e. Client) ask the waiter (i.e. Invoker) to bring
> some food (i.e. Command) and waiter simply forwards the request to Chef (i.e. Receiver) who has the knowledge of what
> and how to cook. Another example would be you (i.e. Client) switching on (i.e. Command) the television (i.e. Receiver)
> using a remote control (Invoker).

### The Problem:

> ![Command Problem](https://refactoring.guru/images/patterns/diagrams/command/solution1-en.png)
> - I want to do some task from a high-level perspective without go deep in details.
> - Like when I press a button on the remote control, I don't care about how the TV will turn on, I just want to turn it
    on.

### The Solution:

> ![Command Solution](https://refactoring.guru/images/patterns/diagrams/command/solution2-en.png)

- There's a pattern called `Command` it will encapsulate the request as an object and will pass it to the invoker.
- The invoker will decide which command to execute based on the request.

**So what is the definition of the Command Design Pattern?**
> [!IMPORTANT]
> the command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to
> perform an action or trigger an event at a later time.

**Here is the UML diagram for the Command Design Pattern ⬇**
> ![Command UML](https://refactoring.guru/images/patterns/diagrams/command/solution3-en.png)

---

![Congratulation](https://github.com/Zeyad2003/Fawry-Internship/assets/87117386/66bc4f79-5143-4ef5-b943-50b4f5ed178b)

> [!NOTE]
> ### ◉ Don't be fooled, this _Congratulation_ is for me 😄
> ### ◉ Just kidding, it's for me and you too, for reaching this point 🫡🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉
> ### ◉ We could say that we finished about the half of design patterns based on the patterns that exist in GoF book.
> ### ◉ There are about 6 `Behavioural Patterns` left. Look for them.
> ### ◉ It will be great to review from websites like [Refactoring Guru](https://refactoring.guru/design-patterns), I stole most of the images and explanation from it 😅
> ### ◉ I hope you enjoy and learn from it, and if there's any wrong or edit that can be useful, please let me know.

# Resources

#### From [Java-T-Point](https://www.javatpoint.com/collections-in-java) Website
#### From [GeeksForGeeks](https://www.geeksforgeeks.org/collections-in-java-2/) Website
#### From [Docs.Oracle](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html) Website [Intensive]
#### Eng/ Asmaa [Session](https://drive.google.com/file/d/1eJQr-JnOhET2pmU21lBQOhprVoyeFAEk/view?usp=drive_link) & [Slides](https://drive.google.com/file/d/1isDEwreoOhZyt8dvd4ew8IrAKKNTtlM0/view?usp=drive_link)


# Tasks

### We should read and discuss the following use-cases and see the suitable java collection for every use-case:


1. When working with a large collection where frequent insertion and deletion operations are expected, and random access is not a primary concern, what is the best choice ?


2. Suppose you are building an inventory management system for an online store. You need to keep track of the available stock of products. Each product has a unique identifier (product ID) and a corresponding quantity in stock. Which Collection can we use to solve this?


3. Suppose you are developing a user activity tracking system where you need to maintain the order of user actions. You want to store the actions in a collection while ensuring uniqueness?


4. In a social media application, there are millions of user posts generated every day. How can Java Collections help you handle and display the latest posts efficiently? Which collection would you use to maintain a sorted order of posts based on their timestamps?


5. You are developing a game, and you want to keep track of the top 10 players' high scores. Which Java Collection would be most appropriate for maintaining this leaderboard?


6. You are building a movie recommendation system. How would you store the movie data and user preferences using Java Collections? How would you efficiently retrieve and suggest movie recommendations based on a user's previous choices?


# My Solution

1. **Linked List** and its applications: As we don't care about random access the linked list will offer a high efficiency for insertion and deletion operations.


2. **HashMap**: <key, value> pairs, will be used to store the product ID as a key and the quantity as a value.


3. **LinkedHashSet**: will maintain the order of user actions and ensure uniqueness at the same time.


4. **PriorityQueue - Max Heap**: we can specify the criteria of sorting using comparator and make it sort based on the time then, it will maintain a sorted order of posts based on their timestamps.


5. **TreeSet**: as we maintain a sorted order of the scores, we can use TreeSet to store the scores and retrieve the top 10 scores.


6. we have 2 collections:
   - **Array List**: to store the movie data.
   - **HashMap**: to store the user preferences and after that we can apply some recommendation algorithms to suggest movie recommendations based on a user's previous choices.

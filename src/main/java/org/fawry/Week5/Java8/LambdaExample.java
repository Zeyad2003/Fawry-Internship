package org.fawry.Week5.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaExample {

    public static void main(final String[] args) {

        final UsersRepository repository = new UsersRepository();

        banner("Listing all users");
        repository.select(null, null);

        banner("Listing users with age > 5 sorted by name");
        // TODO once using anonymous objects and once using lambda expressions

        /// Using anonymous objects
        System.out.println("Using anonymous object: ");
        repository.select(new Predicate<User>() {
            @Override
            public boolean test(User u) {
                return u.age > 5;
            }
        }, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.name.compareTo(u2.name);
            }
        });

        /// Using lambda expressions
        System.out.println("Using lambda expression: ");
        repository.select(u -> u.age > 5, (u1, u2) -> u1.name.compareTo(u2.name));


        banner("Listing users with age < 10 sorted by age");
        // TODO once using anonymous objects and once using lambda expressions

        /// Using anonymous objects
        System.out.println("Using anonymous object: ");
        repository.select(new Predicate<User>() {
            @Override
            public boolean test(User u) {
                return u.age < 10;
            }
        }, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.age - u2.age;
            }
        });

        /// Using lambda expressions
        System.out.println("Using lambda expression: ");
        repository.select(u -> u.age < 10, (u1, u2) -> u1.age - u2.age);


        banner("Listing active users sorted by name");
        // TODO once using anonymous objects and once using lambda expressions

        /// Using anonymous objects
        System.out.println("Using anonymous object: ");
        repository.select(new Predicate<User>() {
            @Override
            public boolean test(User u) {
                return u.active;
            }
        }, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.name.compareTo(u2.name);
            }
        });

        /// Using lambda expressions
        System.out.println("Using lambda expression: ");
        repository.select(u -> u.active, (u1, u2) -> u1.name.compareTo(u2.name));

        banner("Listing active users with age > 8 sorted by name");
        // TODO once using anonymous objects and once using lambda expressions

        /// Using anonymous objects
        System.out.println("Using anonymous object: ");
        repository.select(new Predicate<User>() {
            @Override
            public boolean test(User u) {
                return u.active && u.age > 8;
            }
        }, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.name.compareTo(u2.name);
            }
        });

        /// Using lambda expressions
        System.out.println("Using lambda expression: ");
        repository.select(u -> u.active && u.age > 8, (u1, u2) -> u1.name.compareTo(u2.name));
    }

    private static void banner(final String m) {
        System.out.println("#### " + m + " ####");
    }


    
}

class UsersRepository {
    List<User> users;

    UsersRepository() {
        users = Arrays.asList(
            new User("Seven", 7, true),
            new User("Four", 4, false),
            new User("Eleven", 11, true),
            new User("Three", 3, true),
            new User("Nine", 9, false),
            new User("One", 1, true),
            new User("Twelve", 12, true));
    }

    void select(final Predicate<User> filter, final Comparator<User> order) {
        Stream<User> usersStream = users.stream();

        if (filter != null) {
            usersStream = usersStream.filter(filter);
        }
        if (order != null) {
            usersStream = usersStream.sorted(order);
        }
        usersStream.forEach(System.out::println);
    }
}

class User {
    String name;
    int age;
    boolean active;

    User(final String name, final int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    @Override
    public String toString() {
        return name + "\t| " + age;
    }
}
package org.example.java8.flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class UserFlatmapExample {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alice", List.of("alice@example.com", "alice.work@example.com")),
                new User("Bob", List.of("bob@example.com")),
                new User("Charlie", List.of("charlie@example.com", "c.charlie@example.com"))
        );

        List<String> allEmails  = users.stream()
                .flatMap(user -> user.getEmails().stream())
                .collect(Collectors.toUnmodifiableList());

        System.out.println(allEmails);
    }
}

class User {
    private String name;
    private List<String> emails;

    public User(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    public List<String> getEmails() {
        return emails;
    }
}
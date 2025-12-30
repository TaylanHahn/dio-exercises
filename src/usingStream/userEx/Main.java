package usingStream.userEx;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users =  new ArrayList<>(generateUsers());

        // Filtra quem tem 1 ou menos contatos
        var exemplo0 = users.stream()
                .filter(u -> u.contacts().size() <= 1)
                .toList();
        exemplo0.forEach(System.out::println);

        System.out.println("==================================================");

        // Filtra só quem tem apenas EMAIL
        var exemplo1 = users.stream()
                .filter(u -> u.contacts().stream().allMatch(c -> c.type() == ContactType.EMAIL))
                        .toList();
        exemplo1.forEach(System.out::println);

        System.out.println("==================================================");

        // Filtra quem tem apenas PHONE
        var exemplo2 = users.stream()
                .filter(u -> u.contacts().stream().allMatch(c -> c.type() == ContactType.PHONE))
                .toList();
        exemplo2.forEach(System.out::println);


        /* ordena os nomes em ordem crescente
        users.sort(Comparator.comparing(User::name));
        users.forEach(System.out::println);
         */
    }

    private static List<User> generateUsers(){
        var contacts1 = List.of(
                new Contact("(51)98877-6655", ContactType.PHONE),
                new Contact("taylanhahn@gmai.com", ContactType.EMAIL)
        );

        var contacts2 = List.of(
                new Contact("(21)12345-6789", ContactType.PHONE),
                new Contact("jhulia@outlook.com", ContactType.EMAIL)
        );

        var contacts3 = List.of(
                new Contact("maxmayfield@outlook.com", ContactType.EMAIL),
                new Contact("madmax@gmail.com", ContactType.EMAIL)
        );

        var contacts4 = List.of(
                new Contact("(21)92017-1983", ContactType.PHONE),
                new Contact("oportaluppi@hotmail.com", ContactType.EMAIL)
        );

        var contacts5 = List.of(
                new Contact("(51)91122-3344", ContactType.PHONE)
        );

        var contacts6 = List.of(
                new Contact("bruno@yahoo.com", ContactType.EMAIL)
        );

        var user1 = new User("Taylan", 24, Sex.MALE, new ArrayList<>(contacts1));
        var user2 = new User("Jhulia", 28, Sex.FEMALE, new ArrayList<>(contacts2));
        var user3 = new User("Max", 19, Sex.FEMALE, new ArrayList<>(contacts3));
        var user4 = new User("Renato", 57, Sex.MALE, new ArrayList<>(contacts4));
        var user5 = new User("Elisa", 22, Sex.FEMALE, new ArrayList<>(contacts5));
        var user6 = new User("Bruno", 26, Sex.MALE, new ArrayList<>(contacts6));

        return List.of(user1, user2, user3, user4, user5, user6);
    }
}

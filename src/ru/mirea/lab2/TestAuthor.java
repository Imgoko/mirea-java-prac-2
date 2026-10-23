package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        System.out.println(author1);

        author1.setEmail("paulTan@somewhere.com");
        System.out.println("Имя автора: " + author1.getName());
        System.out.println("Новый email: " + author1.getEmail());
        System.out.println("Пол автора: " + author1.getGender());
        System.out.println("Итоговая строка: " + author1);
    }
}
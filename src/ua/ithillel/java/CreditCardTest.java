package ua.ithillel.java;

import java.util.Scanner;

public class CreditCardTest {
    public static void main(String[] args) {
        // ctrl + alt + L
        CreditCard card = new CreditCard();
        Scanner scanner = new Scanner(System.in);

        card.owner = "Владелец карты";
        card.cardNumber = "4024007123874108";
        card.cardNumber1 = "2200770212727079";
        card.type = "Visa/Mastercard";
        card.type1 = "MИP";
        card.type2 = "unknown card";

        System.out.println("Какая у вас карта?: VISA/MASTERCARD, МИР");
        System.out.println("Введите название вашей карты :");
        String credit = scanner.nextLine();
        switch (credit) {
            case "VISA, MASTERCARD":
                System.out.println("Уважаемый" + card.owner + "Ваша карта: " + card.type);
                System.out.println("Номер вашей карты:" + card.cardNumber + "Вы используете нормальную карту!");
                break;
            case "МИР":
                System.out.println("Доброго вечора: " + card.owner + " Ваша карта " + card.type1 + " Пiшли на х#й");
                System.out.println("Номер вашой карти: " + card.cardNumber1 + " Заблоковано! Геть з Украiни!");
                break;
            default: System.out.println("Уважаемый: " + card.owner + "Мы не можем распознать карту :" + card.type2);
        }
    }
}

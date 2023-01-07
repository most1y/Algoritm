package org.demo;

public class Main {
    public static void main(String[] args) {
        int min = 1;
        int max = 3;

        int a = (int)(Math.random()*(max - min + 1)+min);
        if (a == 1) {
            System.out.println("Just one!");
        } else if (a == 2) {
            System.out.println("Only two!");
        } else {
            System.out.println("Nothing but three!");
        }

        String result = switch (a) {
            case 1 -> "You have just one apple!";
            case 2 -> "Take it easy, you have only two cats!";
            default -> "Could be nothing, but three cookies!";
        };
        System.out.println(result);

        String result2 = result.equals("You have just one apple!") ? "Eat that!"
                : result.equals("Take it easy, you have only two cats!") ? "Feed them!"
                : "Do you like cookies? :)";
        System.out.println(result2);


    }
}
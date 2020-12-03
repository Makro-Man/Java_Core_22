package ua.lviv.lgs.pet;

public class Main {
    public static void main(String[] args) {
        Pet cat = (String name, String how) -> name + how;
        Pet dog = (String name, String how) -> name + how;
        Pet cow = (String name, String how) -> name + how;

        System.out.println(operate("Я пес", " Гаууу-Гаууу", dog));
        System.out.println(operate("Я кіт", " Мяууу-Мяууу", cat));
        System.out.println(operate("Я корова", " Мууу-Мууу", cow));

    }

    private static String operate (String name, String how, Pet pet){
        return pet.voice(name,how);
    }
}
interface Pet{
    String voice(String name, String how);
}


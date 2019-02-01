package abstractFactory;

import java.util.Scanner;

public class Demo {
    private static Squadron getSquadron(String type){
        Squadron squadron = null;
        SquadronFactory squadronFactory;

        switch (type){
            case "elf":
                squadronFactory = new ElfsSquadronFactory();
                squadron = new Squadron(squadronFactory);
                break;
            case "orc":
                System.out.println("need to create orcs");
                break;
            case "human":
                System.out.println("need to create humans");
                break;
        }
        return squadron;
    }

    public static void main(String[] args) {
        System.out.println("enter type");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        getSquadron(type);
    }
}

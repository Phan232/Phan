
package DTO;

/**
 *
 * @author ÁT Phan
 */
import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    // Default constructor
    public Statue() {}

    // Parameterized constructor
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    // Getters and Setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // Method to input Statue details
    public void inputStatue() {
        input(); // call input() from superclass
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight: ");
        weight = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter colour: ");
        colour = sc.nextLine();
    }

    // Method to output Statue details
    public void outputStatue() {
        output(); // call output() from superclass
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}



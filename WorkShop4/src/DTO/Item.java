
package DTO;

/**
 *
 * @author ÁT Phan
 */
import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

    // Default constructor
    public Item() {}

    // Parameterized constructor
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    // Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    // Method to input data
    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter value (>0): ");
            value = sc.nextInt();
        } while (value <= 0);

        sc.nextLine(); // consume the newline character
        do {
            System.out.print("Enter creator: ");
            creator = sc.nextLine();
        } while (creator.isEmpty());
    }

    // Method to output data
    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
}

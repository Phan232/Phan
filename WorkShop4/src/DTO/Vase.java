
package DTO;

/**
 *
 * @author ÁT Phan
 */
import java.util.Scanner;

public class Vase extends Item {
    private int height;
    private String material;

    // Default constructor
    public Vase() {}

    // Parameterized constructor
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    // Getters and Setters
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Method to input Vase details
    public void inputVase() {
        input(); // call input() from superclass
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter material: ");
        material = sc.nextLine();
    }

    // Method to output Vase details
    public void outputVase() {
        output(); // call output() from superclass
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}
















import java.util.Scanner;

public class GrapePlasmaExperiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the water content in grams: ");
        double waterContent = scanner.nextDouble();

        System.out.print("Enter the blaze start coefficient: ");
        double blazeStartCoefficient = scanner.nextDouble();

        System.out.print("Enter the duration coefficient: ");
        double durationCoefficient = scanner.nextDouble();
      
      // Constants for the calculations
      
        double heatCapacityOfWater = 4.186; // Joules per gram per degree Celsius
        double heatOfVaporization = 2260; // Joules per gram
      

        // Constants for the calculations
      
        double baseBlazeStartTime = 1.0; // Base value for blaze start time
        double baseBlazeDuration = 1.0; // Base value for blaze duration

        // Calculate the blaze start time
      
        double blazeStartTime = baseBlazeStartTime + blazeStartCoefficient * waterContent;

        // Calculate the blaze duration
      
        double blazeDuration = baseBlazeDuration + durationCoefficient * waterContent;
      
      // Calculate the energy produced
      
        double energyProduced = waterContent * heatCapacityOfWater * heatOfVaporization;


        System.out.println("Blaze Start Time: " + blazeStartTime + " seconds");
        System.out.println("Blaze Duration: " + blazeDuration + " seconds");
       System.out.println("Energy Produced: " + energyProduced + " Joules");


        scanner.close();
    }
}





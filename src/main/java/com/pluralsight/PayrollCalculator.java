import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee File Name to Continue ");
        String inputFileReader = scanner.nextLine();
        System.out.println("Enter Payroll to view ");
        String outputFileReader = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileReader));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileReader));

            reader.readLine();
            writer.write("id|name|gross pay\n");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\|");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double hours = Double.parseDouble(data[2]);
                float rate = Float.parseFloat(data[3]);
                double grossPay = hours * rate;

                writer.write(id + "|" + name + "|" + String.format("%.2f", grossPay) + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Loading... Here you Go!");
            Runtime.getRuntime().exec("notepad.exe " + outputFileReader);
        } catch (Exception e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }
}



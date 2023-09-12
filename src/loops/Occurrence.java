package loops;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import loops.Sum;
public class Occurrence
{

    public static void main(String[] args)
    {
        String filePath = "C:\\Users\\91891\\eclipse-workspace//Basics//loops//Sample.java"; // Replace with the path to your Java file

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            Map<String, Integer> variableCounts = new HashMap<>();

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.startsWith("int") || line.startsWith("double") || line.startsWith("float") ||
                        line.startsWith("char") || line.startsWith("boolean") || line.startsWith("byte") ||
                        line.startsWith("short") || line.startsWith("long") || line.startsWith("String")) {
                    String[] tokens = line.split("[;,= ]+");
                    for (int i = 1; i < tokens.length; i++) {
                        if (tokens[i].length() > 0) {
                            String variableName = tokens[i];
                            variableCounts.put(variableName, variableCounts.getOrDefault(variableName, 0) + 1);
                        }
                    }
                }
            }

            reader.close();

            for (Map.Entry<String, Integer> entry : variableCounts.entrySet()) {
                System.out.println("Variable: " + entry.getKey() + ", Occurrences: " + entry.getValue());
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

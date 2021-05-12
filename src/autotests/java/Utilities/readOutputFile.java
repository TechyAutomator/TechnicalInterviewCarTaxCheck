// Author: Khalid Mahmood
// Date: 11th May 2021

package Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readOutputFile
{
    public List<String> outarray() throws IOException
    {
        BufferedReader car_output = new BufferedReader(new FileReader("./src/test/resources/Output Files/car_output.txt"));

        // Declare variables
        List <String> outputRecArray = new ArrayList<String>();
        String sLine;

        // While there is no values on line i.e. blank line
        while ((sLine = car_output.readLine()) != null)
        {
            outputRecArray.add(sLine);
        }

        // Close car_output.txt file
        car_output.close();

        // Return array with contents of car output file
        return(outputRecArray);
    }
}

// Author: Khalid Mahmood
// Date: 11th May 2021

package Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class readSingleInputFile
{
    static List <String> inputRecArray = new ArrayList<String>();

    public void readFromCarInputFile() throws IOException
    {
        BufferedReader car_in = new BufferedReader(new FileReader("./src/autotests/resources/Input Files/car_input.txt"));

        // Define pattern that we want to search on
        String pattern = "[A-Z][A-Z][0-9][0-9]";
        Pattern sPattern = Pattern.compile(pattern);
        String sLine;

        while ((sLine = car_in.readLine()) != null)
        {
            Matcher sMatch = sPattern.matcher(sLine);

            while (sMatch.find())
            {
                String sReg = sLine.substring(sMatch.start(0), sMatch.end(0)+4);
                inputRecArray.add(sReg);
            }
        }

        car_in.close();
    }

    public List<String> getinputarray()
    {
        return(inputRecArray);
    }
}

// Author: Khalid Mahmood
// Date: 11th May 2021

package Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readMultipleInputFiles
{
    public static void main(String[] args) throws IOException
    {
        // Define pattern that we want to search on
        String pattern = "[A-Z][A-Z][0-9][0-9]";
        Pattern sPattern = Pattern.compile(pattern);
        List <String> inputRecArray = new ArrayList<String>();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        File folder = new File("./src/autotests/resources/Input Files/");

        // Check if directory is empty or not
        if (folder.isDirectory())
        {
            // Go through list of files in folder
            for (File file : folder.listFiles())
            {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = null;
                int lineCount = 0;

                // While there no more lines i.e. blank line
                while ((line = bufferedReader.readLine() ) != null)
                {
                    // Increment line count
                    lineCount++;

                    if (3 != lineCount)
                    {
                        Matcher sMatch = sPattern.matcher(line);

                        while (sMatch.find())
                        {
                            String sReg = line.substring(sMatch.start(0), sMatch.end(0) + 4);
                            inputRecArray.add(sReg);
                        }
                    }
                }
            }

            System.out.println(inputRecArray);
        }
    }
}

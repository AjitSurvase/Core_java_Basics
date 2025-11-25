

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Master1 {
    private static int fileCounter = 0; // Initialize counter to 0

    public static void main(String[] args) {
        String inputFilePath = "D:/EDIS_EPN/EDIS_Report_28May2024_024048.csv";
        String fileExtention= "160";
        String outputFilePath = "D:/EDIS_EPN/18058100." + getFormattedDate("ddMMyyyy") + "."+fileExtention; // Include fileCounter in the output file name

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            boolean isHeader = true; // Flag to indicate the header line
            StringBuilder contentBuilder = new StringBuilder();
            String userid = "";
            String isin = "";
            String clientid = "";
            String edis = "";
            String stdate = "";
            int rowCount = 0;
           

            // Prepare the header content with the file counter
            String header = "peth";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
                // Write the header to the output file
            
                // Iterate through each line of the input file
                while ((line = br.readLine()) != null) {
                
                    if (isHeader) {
                        isHeader = false; // Skip the first line (header)
                        continue;
                    }
                	rowCount++;

                    String[] separator = line.split(",");
                    if (separator.length >= 24) { // Ensure there are enough fields
                        userid = separator[1];
                        clientid = separator[4];
                        isin = separator[5];
                        edis = separator[21];
                        stdate = separator[23];
                        header = "058100DPADM 00000"+rowCount+""+fileExtention+"" + getFormattedDate("ddMMyyyy")+ "\n";


                        // Prepare the content for this line
                        String lineContent = "<Tp>10</Tp><Usn>1064</Usn><Xchg>11</Xchg><Clr>10</Clr><Mmb>3206</Mmb><Sttlm>1110232425640</Sttlm><Bnfcry>1205810000034273</Bnfcry><ISIN>" + isin + "</ISIN><Qty>1</Qty><CtrPty>1100001000013711</CtrPty><Ref>001</Ref><Dt>" + getFormattedDate("ddMMyyyy") + "</Dt><Txnelflg>D</Txnelflg><Dis>" + edis + "26311100</Dis><EntIdntfr>TM</EntIdntfr><Ucc>" + userid + "</Ucc><Seg>CM</Seg><Ucmid>3206</Ucmid><Tm>3206</Tm><Uexid>11</Uexid>\n";

                        // Append the line content to the output file content builder
                        contentBuilder.append(lineContent);
                    }
                }

                // Write the final content to the output file
                bw.write(header);
                bw.write(contentBuilder.toString());
                System.out.println("File written successfully!");
                fileCounter++; // Increment the counter for each file written
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getFormattedDate(String pattern) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);
        return currentDate.format(dateFormatter);
    }
}

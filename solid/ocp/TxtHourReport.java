package solid.ocp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;

public class TxtHourReport extends HourReport {

    public TxtHourReport(List<ReportRegister> reportData) {
        super(reportData);
    }

    public void export() {
        long currentDateTime = new Date().getTime();
        
        Path fileName = Path.of("/c/Users/Empresa/teste-" + currentDateTime + ".txt");

        try {
            Files.writeString(fileName, this.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

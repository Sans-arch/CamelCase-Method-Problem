package solid.ocp;

import java.util.List;

public abstract class HourReport {
    
    private List<ReportRegister> reportData;

    public HourReport(List<ReportRegister> reportData) {
        this.reportData = reportData;
    }

    public String toString() {
        String content = "Name | Worked Hours\n";
        
        for (ReportRegister report : reportData) {
            content = content + report.getEmployeeName() + " | " + report.getWorkedHours();
        }

        return content;
    }
   
}

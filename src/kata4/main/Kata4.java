
package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import static kata4.view.MailHistogramBuilder.build;
import static kata4.view.MailListReader.read;


public class Kata4 {
    
    private final String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
            
    public static void main(String[] args)  {
        Kata4 k = new Kata4("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Kata4\\src\\kata4\\main\\email.txt");
        k.execute();
    }

    public Kata4(String fileName) {
        this.fileName = fileName;
    }
    
    public void execute() {
        input();
        process();
        output();
    }
    
    public void input() {
        try {
           mailList = read(fileName); 
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error con el fichero");
        }
    }
    
    public void process() {
        histogram = build(mailList);
    }
    
    public void output() {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import static kata4.view.MailHistogramBuilder.build;
import static kata4.view.MailListReader.read;

/**
 *
 * @author Usuario
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        
        List<Mail> a = read("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Kata4\\src\\kata4\\main\\email.txt");
        HistogramDisplay histo = new HistogramDisplay(build(a));
        
        histo.execute();
    }
    
}

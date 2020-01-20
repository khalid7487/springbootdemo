
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;


import java.io.FileOutputStream;
import java.io.OutputStream;


public class App {
    public static void main(String[] args) {
        System.out.println("hello");

        Workbook wb=new HSSFWorkbook();
        try{
            OutputStream fileOut= new  FileOutputStream("E://Java_programming//maven//Sample.xls");
            wb.write(fileOut);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

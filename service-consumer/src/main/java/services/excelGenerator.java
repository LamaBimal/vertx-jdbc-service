package services;

/**
 * Created by btamang on 11/30/16.
 */
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class excelGenerator{
    public static void generate(JsonObject ResultObject)
    {
        try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Test1");
            XSSFRow headerRow = sheet.createRow(1);
            JsonArray headerArray = ResultObject.getJsonArray("columnNames");
            System.out.println(headerArray);
            /*for(String header: headerArray){

            }*/

            /*XSSFCell headerCell = headerRow.createCell(5)*/
            /*XSSFCell cell = row.getCell(5);*/


           }catch(Exception ex){

          }
    }
}

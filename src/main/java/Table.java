import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableColumn;

public class Table {

    private  final SimpleIntegerProperty sNumber;
    private  final SimpleStringProperty sAssment;
    private  final SimpleStringProperty sDate;
    private  final SimpleStringProperty sTime;

    public Table(int rNumber, String rAssment, String rDate, String rTime){

        this.sNumber = new SimpleIntegerProperty(rNumber);
        this.sAssment = new SimpleStringProperty(rAssment);
        this.sDate = new SimpleStringProperty(rDate);
        this.sTime = new SimpleStringProperty(rTime);


    }

    public int getSNumber() {
        return sNumber.get();
    }

    public String getSAssment() {
        return sAssment.get();
    }
    public String getSDate() {
        return sDate.get();
    }

    public String getSTime() {
        return sTime.get();
    }


    public void setSNumberNumber(int v) {
        sNumber.set(v);
    }

    public void setSAssignment(String v) {
        sAssment.set(v);
    }

    public void setSDate(String v) {
        sDate.set(v);
    }
    public void setSTime(String v) {
        sTime.set(v);
    }



}
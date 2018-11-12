package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {
    private SimpleStringProperty unos;
    private String operacija = "";
    private boolean brisi = false;

    public Controller() {
        unos = new SimpleStringProperty("0");
    }

    public SimpleStringProperty ulazProperty() {
        return unos;
    }

    public String getUlaz() {
        return unos.get();
    }

    public void jedan(ActionEvent actionEvent) {
        if (unos.get().equals("0") && operacija.equals("")) {
            unos.set("1");
        } else if (!operacija.equals("") && brisi) {
            unos.set("1");
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            unos.set(unos.get() + "1");
        } else {
            unos.set(unos.get() + "1");
        }
    }

    public void dva(ActionEvent actionEvent) {
        if (unos.get().equals("0") && operacija.equals("")) {
            unos.set("2");
        } else if (!operacija.equals("") && brisi) {
            unos.set("2");
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            unos.set(unos.get() + "2");
        } else {
            unos.set(unos.get() + "2");
        }
    }

}
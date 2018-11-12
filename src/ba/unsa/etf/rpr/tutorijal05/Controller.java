package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {
    private SimpleStringProperty unos;
    private String operacija = "";
    private boolean brisi = false;
    private double zbir=0;

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

    public void tri(ActionEvent actionEvent) {
        if (unos.get().equals("0") && operacija.equals("")) {
            unos.set("3");
        } else if (!operacija.equals("") && brisi) {
            unos.set("3");
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            unos.set(unos.get() + "3");
        } else {
            unos.set(unos.get() + "3");
        }
    }

    public void cetiri(ActionEvent actionEvent) {
        if (unos.get().equals("0") && operacija.equals("")) {
            unos.set("4");
        } else if (!operacija.equals("") && brisi) {
            unos.set("4");
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            unos.set(unos.get() + "4");
        } else {
            unos.set(unos.get() + "4");
        }
    }

    public void pet(ActionEvent actionEvent) {
        if (unos.get().equals("0") && operacija.equals("")) {
            unos.set("5");
        } else if (!operacija.equals("") && brisi) {
            unos.set("5");
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            unos.set(unos.get() + "5");
        } else {
            unos.set(unos.get() + "5");
        }
    }

    public void sest(ActionEvent actionEvent) {
        if (unos.get().equals("0") && operacija.equals("")) {
            unos.set("6");
        } else if (!operacija.equals("") && brisi) {
            unos.set("6");
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            unos.set(unos.get() + "6");
        } else {
            unos.set(unos.get() + "6");
        }
    }

    public void sedam(ActionEvent actionEvent) {
        if (unos.get().equals("0") && operacija.equals("")) {
            unos.set("7");
        } else if (!operacija.equals("") && brisi) {
            unos.set("7");
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            unos.set(unos.get() + "7");
        } else {
            unos.set(unos.get() + "7");
        }
    }

    public void osam(ActionEvent actionEvent) {
        if (unos.get().equals("0") && operacija.equals("")) {
            unos.set("8");
        } else if (!operacija.equals("") && brisi) {
            unos.set("8");
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            unos.set(unos.get() + "8");
        } else {
            unos.set(unos.get() + "8");
        }
    }

    public void devet(ActionEvent actionEvent) {
        if (unos.get().equals("0") && operacija.equals("")) {
            unos.set("9");
        } else if (!operacija.equals("") && brisi) {
            unos.set("9");
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            unos.set(unos.get() + "9");
        } else {
            unos.set(unos.get() + "9");
        }
    }

    public void nula(ActionEvent actionEvent) {
        if (unos.get().equals("0") && operacija.equals("")) {
            unos.set("0");
        } else if (!operacija.equals("") && brisi) {
            unos.set("0");
            brisi = !brisi;
        } else if (!operacija.equals("")) {
            unos.set(unos.get() + "0");
        } else {
            unos.set(unos.get() + "0");
        }
    }

    public void dm(ActionEvent actionEvent) {
        unos.set(unos.get() + ".");
    }

    public void jednako(ActionEvent actionEvent) {
        if (operacija.equals("+")) {
            unos.set(String.valueOf((Double.parseDouble(unos.get()) + zbir)));
            operacija = "";
        }
    }

    public void plus(ActionEvent actionEvent) {
        zbir += Double.parseDouble(unos.get());
        operacija = "+";
        brisi = true;
    }


}
package graf;

import java.util.Objects;

public class Salarymodel {


    Integer tabNomer;
    String firstName;
    String midleName;
    String secondName;
    Float oklad;
    Integer day;
    float summa;

    public Salarymodel(String tabNomer, String firstName, String midleName, String secondName, String oklad, String day) {
        this.tabNomer = Integer.parseInt(tabNomer);
        this.firstName = firstName;
        this.midleName = midleName;
        this.secondName = secondName;
        this.oklad = Float.parseFloat(oklad);
        this.day = Integer.parseInt(day);
        setSumma(this.day,this.oklad);
    }

    public static String[] Title() {
        return new String[] {"Табельный","Работник","Получить"};

    }


    public Integer getTabNomer() {
        return tabNomer;
    }

    public void setTabNomer(Integer tabNomer) {
        this.tabNomer = tabNomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Float getOklad() {
        return oklad;
    }

    public void setOklad(Float oklad) {
        this.oklad = oklad;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Float getSumma() {
        return summa;
    }

    public void setSumma(Integer day, float oklad) {

            this.summa = this.getDay()*this.getOklad();
            System.out.println(this.summa);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Salarymodel)) return false;
        Salarymodel that = (Salarymodel) o;
        return Objects.equals(getOklad(), that.getOklad()) &&
                Objects.equals(getDay(), that.getDay());
    }





}

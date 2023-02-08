public class Display {
    private double dume;
    private String manufacturer;
    private String matrixType;

    public Display(double dume, String manufacturer, String matrixType) {
        this.dume = dume;
        this.manufacturer = manufacturer;
        this.matrixType = matrixType;
    }

    public double getDume() {
        return dume;
    }

    public void setDume(double dume) {
        this.dume = dume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }public String getInfo(){
        return "Dume: "+dume+"\n"+
        "Manufacturer: "+manufacturer+"\n"+
         "Matrix type: "+matrixType;
    }
}

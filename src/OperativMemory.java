public class OperativMemory {
    private String operativeMemory;
    private String manufacturer;

    public OperativMemory(String operativeMemory, String manufacturer) {
        this.operativeMemory = operativeMemory;
        this.manufacturer = manufacturer;
    }

    public String getOperativeMemory() {
        return operativeMemory;
    }

    public void setOperativeMemory(String operativeMemory) {
        this.operativeMemory = operativeMemory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;

    }public String getInfo(){
        return "Operativ memory: "+operativeMemory+"\n"+
                "Manufacturer: "+manufacturer;
    }


}


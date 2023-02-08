public class USBport {
   private  double typePort;
   private String IdPort;

    public USBport(double typePort, String idPort) {
        this.typePort = typePort;
        IdPort = idPort;
    }

    public double getTypePort() {
        return typePort;
    }

    public void setTypePort(double typePort) {
        this.typePort = typePort;
    }

    public String getIdPort() {
        return IdPort;
    }

    public void setIdPort(String idPort) {
        IdPort = idPort;
    }public String getInfo(){
        return "Type port: "+typePort+"\n"+
                "Id port: "+IdPort;
    }

}

public class SSD {
    private String volumeMemory;
    private String disc;

    public SSD(String volumeMemory, String disc) {
        this.volumeMemory = volumeMemory;
        this.disc = disc;
    }

    public String getVolumeMemory() {
        return volumeMemory;
    }

    public void setVolumeMemory(String volumeMemory) {
        this.volumeMemory = volumeMemory;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }public String getInfo(){
        return "Volume Mermory: "+"\n"+
                "SSD disc: "+disc;
    }
}
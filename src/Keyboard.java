public class Keyboard {
    private String keyboardIlumination;
    private String additionalSifr;

    public Keyboard(String keyboardIlumination, String additionalSifr) {
        this.keyboardIlumination = keyboardIlumination;
        this.additionalSifr = additionalSifr;
    }
    public String getKeyboardIlumination() {
        return keyboardIlumination;
    }
    public void setKeyboardIlumination(String keyboardIlumination) {
        this.keyboardIlumination = keyboardIlumination;
    }
    public String getAdditionalSifr() {
        return additionalSifr;
    }
    public void setAdditionalSifr(String additionalSifr) {
        this.additionalSifr = additionalSifr;
    }public  String getInfo(){
        return "Keboard illumination: "+keyboardIlumination+"\n"+
                "Addittional siffr: "+additionalSifr;

    }

}

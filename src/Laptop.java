public class Laptop {
     private String laptopName;
     private String color;
     private String videocard;

     public Laptop(String laptopName, String color,String videocard) {
          this.laptopName = laptopName;
          this.color = color;
          this.videocard = videocard;
     }

     public String getLaptopName() {
          return laptopName;
     }

     public void setLaptopName(String laptopName) {
          this.laptopName = laptopName;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public String getVideocard() {
          return videocard;
     }

     public void setVideocard(String videocard) {
          this.videocard = videocard;
     }
     public String getInfo(){
          return "LAptop name: "+laptopName+"\n"
           +"color: "+color+"\n"+
           "videocard: "+videocard;
     }
}

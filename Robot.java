//Wibby Bernaldi_1431140056_MI-1D_30
public class Robot {
    public int Sensor;
    public int Servo;
    public int Power;

    public Robot(){
        Sensor=4;
        System.out.println("Jumlah Sensor Robot : "+Sensor);
    }
}

class Asimo30 extends Robot {
    public int Camera;
    public Asimo30(int a, int b, int c, int d){
        Sensor=a;
        Servo=b;
        Power=c;
        Camera=d;
    }
    public void CetakSpesifikasi(){
        System.out.println("Jumlah Sensor Asimo30 : "+Sensor);
        System.out.println("Jumlah Servo Asimo30 : "+Servo);
        System.out.println("Kapasitas Power : "+Power);
        System.out.println("Jumlah Kamera : "+ Camera+"\n");
    }


    public void Upgrade(int a){
    Sensor=a;
    System.out.println("Asimo30 diupgrade dengan jumlah sensor : "+Sensor);
}

}

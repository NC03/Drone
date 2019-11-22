import java.net.*;

public class DroneControl {
    public static DroneControl dc;
    private DatagramSocket ds;
    public static final byte[] byteAddr = { (byte) 192, (byte) 168, (byte) 10, (byte) 1 };
    private InetAddress addr;

    public static void main(String[] args)
    {
        DroneControl ds = new DroneControl();
        for(String arg : args){
            ds.send(arg);
        }
        ds.close();
    }
    
    public static void init()
    {
        dc = new DroneControl();
    }
    
    public static void takeoff()
    {
        dc.send("takeoff");
    }
    
    public static void connect()
    {
        dc.send("command");
    }
    
    public static void land()
    {
        dc.send("land");
    }

    public DroneControl() {
        try {
            ds = new DatagramSocket();
            addr = InetAddress.getByAddress(byteAddr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(){
        ds.close();
    }

    public String send(String msg) {
        DatagramPacket response;
        try {
            DatagramPacket dp = new DatagramPacket(encode(msg), encode(msg).length, addr, 8889);
            ds.send(dp);
            //response = new DatagramPacket(new byte[256], 256);
            //ds.receive(response);
            //System.out.println(response);
            //return new String(response.getData());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return "DPError: " + e.getMessage();
        }
    }

    public byte[] encode(String msg) {
        try {

            return URLEncoder.encode(msg, "UTF-8").getBytes();
        } catch (Exception e) {
            return null;
        }
    }
}
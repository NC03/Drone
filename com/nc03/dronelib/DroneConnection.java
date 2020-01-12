package com.nc03.dronelib;

import java.net.*;

public class DroneConnection {
    private InetAddress addr;
    private DatagramSocket ds;
    private final int port;

    public DroneConnection(byte[] address, int port) {
        this.port = port;
        ds = new DatagramSocket();
        addr = InetAddress.getByAddress(address);
    }

    public DroneConnection() {
        this(new byte[] { (byte) 192, (byte) 168, (byte) 10, (byte) 1 }, 8889);
    }

    public String send(String msg) {
        DatagramPacket response;
        try {
            DatagramPacket dp = new DatagramPacket(encode(msg), encode(msg).length, addr, port);
            ds.send(dp);
            // response = new DatagramPacket(new byte[256], 256);
            // ds.receive(response);
            // System.out.println(response);
            // return new String(response.getData());
            return "";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "DatagramPacketError: " + ex.getMessage();
        }
    }

    public byte[] encode(String msg) {
        try {
            return URLEncoder.encode(msg, "UTF-8").getBytes();
        } catch (Exception e) {
            return new byte[0];
        }
    }

    public void close() {
        ds.close();
    }
}
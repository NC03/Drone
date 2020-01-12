package com.nc03.dronelib;

import java.net.*;

public class DroneControl {
    public static DroneConnection dc;

    public static boolean init() {
        try {
            dc = new DroneConnection();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static void takeoff() {
        dc.send("takeoff");
    }

    public static void connect() {
        dc.send("command");
    }

    public static void land() {
        dc.send("land");
    }

    public void close() {
        dc.close();
    }

    public static void forward(int n) {
        dc.send("forward " + n);
    }

    public static void back(int n) {
        dc.send("back " + n);
    }

    public static void left(int n) {
        dc.send("left " + n);
    }

    public static void right(int n) {
        dc.send("right " + n);
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.ArrayList;

/**
 *
 * @author ema
 */
public class myServer {
    InetAddress localhost;
    int port;
    ServerSocket server;
    ArrayList<User> online;
}

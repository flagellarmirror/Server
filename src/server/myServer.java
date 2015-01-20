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
    InetAddress localhost;//This variable contain the ip of pc
    int port;//This variable contain the port of server
    ServerSocket server;//This variable contain the server
    ArrayList<User> online;//This array cointan the list of people online
}

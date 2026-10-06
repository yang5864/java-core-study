package ch08.sec11.exam02;

import java.io.*;
import java.util.*;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

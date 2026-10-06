package ch08.sec02;

import java.io.*;
import java.util.*;

public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("텔레비전을 켭니다.");
    }
}

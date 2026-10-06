package ch07.sec10.exam02;

import java.io.*;
import java.util.*;

public abstract class Animal {

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();
}


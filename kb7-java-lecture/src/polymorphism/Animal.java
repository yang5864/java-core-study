package polymorphism;

import java.io.*;
import java.util.*;

public class Animal {
    public void sound() {
        System.out.println("응애에요~");
    }

    public void animalMethod() {
        System.out.println("나는 오직 Animal 클래스에서만 존재할 수 있다");
    }
}

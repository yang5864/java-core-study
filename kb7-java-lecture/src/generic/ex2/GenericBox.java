package generic.ex2;

import java.io.*;
import java.util.*;

public class GenericBox<Type> {
    private Type value;

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }
}

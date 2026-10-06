package generic.ex1;

import java.io.*;
import java.util.*;

public class BoxMain {
    public static void main(String[] args) throws Exception {
        IntegerBox intBox = new IntegerBox();
        intBox.setValue(27);
        System.out.println("IntegerBox Value = " + intBox.getValue());

        StringBox strBox = new StringBox();
        strBox.setValue("마니또 뭐함!?");
        System.out.println("StringBox Value = " + strBox.getValue());
    }
}

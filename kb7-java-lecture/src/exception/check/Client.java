package exception.check;

import java.io.*;
import java.util.*;

public class Client {
    public void callCheckException() throws MyCheckException{
        boolean con = false;
        // DB 관련 통신 작업
        if (!con) throw new MyCheckException("Repository DB 작업에서 예외 발생");

        // 원하던 작업을 수행
    }
}

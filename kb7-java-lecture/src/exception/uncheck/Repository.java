package exception.uncheck;

import java.io.*;
import java.util.*;

public class Repository {
    public void callException() throws MyUncheckException {
        boolean con = false;
        // DB 관련 통신 작업
        if (!con) throw new MyUncheckException("DB 관련 작업에서 MyCheckException 에서 발생");
        // 원하는 작업 수행
    }
}

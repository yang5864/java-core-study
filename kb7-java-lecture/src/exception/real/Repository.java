package exception.real;

import exception.real.exception.MyCheckException;
import exception.real.exception.MyUncheckException;

public class Repository {
    public void callUnCheckException() {
        boolean con = false;
        // DB 관련 통신 작업
        if (!con) throw new MyUncheckException("DB 관련 작업에서 MyCheckException 에서 발생");
        // 원하는 작업 수행
    }

    public void callCheckException(){
        throw new MyCheckException("Repository DB 작업에서 예외 발생");
    }
}

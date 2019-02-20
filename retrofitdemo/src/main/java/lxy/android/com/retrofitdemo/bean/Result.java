package lxy.android.com.retrofitdemo.bean;

/**
 * Created by LIXIAOYE on 2019/2/20.
 */

public class Result<T> {
    private int code;
    private T data;
    private String result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

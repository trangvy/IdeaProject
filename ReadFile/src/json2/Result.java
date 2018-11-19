package json2;

import com.sun.xml.internal.ws.developer.Serialization;

import java.util.ArrayList;
import java.util.List;

public class Result {
    @Serialization(encoding = "todos")
    public List<SinhVien> todos = new ArrayList<SinhVien>();

    public List<SinhVien> getTodos(){
        return todos;
    }
}


package xml.practice1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Ndidetails {
    private List<Param> param=new ArrayList<>();

    public Ndidetails() {
    }

    public List<Param> getParam() {
        return param;
    }
}

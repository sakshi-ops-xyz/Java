package xml.practice1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context=JAXBContext.newInstance(Root.class);
        Unmarshaller unmarshaller=context.createUnmarshaller();
        Root root=(Root) unmarshaller.unmarshal(new File("test3.xml"));

        List<Digitalmedia> l=new ArrayList<>();
        l=root.getDigitalmedia();

        for(var i: l) {
            System.out.println(i.getId());
        }
    }
}

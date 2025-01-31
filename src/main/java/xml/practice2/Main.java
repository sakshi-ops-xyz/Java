package xml.practice2;

import xml.practice1.Digitalmedia;
import xml.practice1.Root;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context=JAXBContext.newInstance(PlayerConfigurations.class);
        Unmarshaller unmarshaller=context.createUnmarshaller();
        PlayerConfigurations root=(PlayerConfigurations) unmarshaller.unmarshal(new File("test4.xml"));
        System.out.println(root);
    }
}

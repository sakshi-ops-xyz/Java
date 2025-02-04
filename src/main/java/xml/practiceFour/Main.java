package xml.practiceFour;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context=JAXBContext.newInstance(PlayerConfigurations.class);
        Unmarshaller unmarshaller= context.createUnmarshaller();
        PlayerConfigurations p=(PlayerConfigurations)unmarshaller.unmarshal(new File("abc.xml"));
        System.out.println(p.getPlayerConfig().getPlayer().getDriverId());
    }
}

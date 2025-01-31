package xml.practice3;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext context=JAXBContext.newInstance(PlayerConfigurations.class);
        Unmarshaller unmarshaller=context.createUnmarshaller();
        PlayerConfigurations root=(PlayerConfigurations) unmarshaller.unmarshal(new File("test5.xml"));
//        System.out.println(root);

        PlayerConfig playerConfig=root.getPlayerConfig();
        List<Player> p=playerConfig.getPlayer();

        for(var i: p) {
            System.out.println("Type: "+i.getType());
            System.out.println("Drive Id: "+i.getDriverId());
            System.out.println("Connection: "+i.getConnection());
//            System.out.println("VodSecurityServerIp: "+i.getVodSecurityServerIp());
//            System.out.println("");
//            System.out.println(i);
        }
    }
}

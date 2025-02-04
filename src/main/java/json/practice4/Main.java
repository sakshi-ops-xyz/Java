package json.practice4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Root r=objectMapper.readValue(new File("test4.json"), Root.class);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Data d=r.getData();
        FnbResponse fnbResponse=d.getFnbResponse();
        Fnb fnb=fnbResponse.getFnb();
        Fnb services=fnbResponse.getServices();
        List<RealTimeOrders> realTimeOrders=fnb.getRealTimeOrders();
        List<RealTimeOrders> realTimeOrders2=services.getRealTimeOrders();

//        for(var i: realTimeOrders) {
//            boolean flag=false;
//            List<MenuItems> items=i.getItems();
//            for(var j: items) {
//                if(j.getMenuItemId()==82) flag=true;
//            }
//            if(flag==true) System.out.println(i.getState());
//        }


        for(var i: realTimeOrders2) {
            boolean flag=false;
            List<MenuItems> items=i.getItems();
            for(var j: items) {
                if(j.getMenuItemId()==82) flag=true;
            }
            if(flag==true) System.out.println(i.getState());
        }

//        Fnb fnb=fnbResponse.getFnb();
//        List<RealTimeOrders> realTimeOrders=fnb.getRealTimeOrders();
//        System.out.println(realTimeOrders);
//        System.out.println(fnbResponse);
//        Fnb services=fnbResponse.getServices();
//        System.out.println(services);

//        for(var i: realTimeOrders) {
//            if(i.)
//        }


//        String jsonString=objectMapper.writeValueAsString(r);
//        System.out.println(jsonString);


    }
}

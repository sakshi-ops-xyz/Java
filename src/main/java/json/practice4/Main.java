package json.practice4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jsonTask.Fnb;
import jsonTask.FnbResponse;
import jsonTask.RealTimeOrders;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Root r=objectMapper.readValue(new File("test4.json"), Root.class);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(r);

        Data d=r.getData();
        System.out.println(d);
        FnbResponse fnbResponse=new FnbResponse();
        System.out.println(fnbResponse);
        Fnb fnb=fnbResponse.getFnb();
//        List<RealTimeOrders> realTimeOrders=fnb.getRealTimeOrders();
//        System.out.println(realTimeOrders);
        System.out.println(fnbResponse);
        Fnb services=fnbResponse.getServices();
//        System.out.println(services);

//        for(var i: realTimeOrders) {
//            if(i.)
//        }


//        String jsonString=objectMapper.writeValueAsString(r);
//        System.out.println(jsonString);


    }
}

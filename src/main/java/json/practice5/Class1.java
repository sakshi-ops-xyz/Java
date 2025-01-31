package json.practice5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Class1 {
    public static void main(String[] args) throws JsonProcessingException {
//        ObjectMapper objectMapper=new ObjectMapper();
//        JsonNode jsonNode = objectMapper.readTree(jsonString);
//
//        ArrayNode c = (ArrayNode)jsonNode.get("items");
//
//        for(var i: c) {
//            System.out.println(i.get("ocf").get("firmwareVersion"));
//        }

        String jsonString="{\"items\":[{\"deviceId\":\"2b1490a4-09ff-8a91-7a10-e5fea0b2130a\",\"name\":\"Samsung 4 Series (32)\",\"label\":\"Samsung 4 Series (32)\",\"manufacturerName\":\"Samsung Electronics\",\"presentationId\":\"VD-STV_2018_K\",\"deviceManufacturerCode\":\"Samsung Electronics\",\"locationId\":\"b46c9e61-9af3-4ac2-925d-7f4209e4e728\",\"ownerId\":\"41f5de5f-3786-082b-5899-8819a7e073d2\",\"deviceTypeName\":\"Samsung OCF TV\",\"components\":[{\"id\":\"main\",\"label\":\"main\",\"capabilities\":[{\"id\":\"ocf\",\"version\":1},{\"id\":\"switch\",\"version\":1},{\"id\":\"audioVolume\",\"version\":1},{\"id\":\"audioMute\",\"version\":1},{\"id\":\"tvChannel\",\"version\":1},{\"id\":\"mediaInputSource\",\"version\":1},{\"id\":\"mediaPlayback\",\"version\":1},{\"id\":\"mediaTrackControl\",\"version\":1},{\"id\":\"custom.error\",\"version\":1},{\"id\":\"custom.picturemode\",\"version\":1},{\"id\":\"custom.soundmode\",\"version\":1},{\"id\":\"custom.accessibility\",\"version\":1},{\"id\":\"custom.launchapp\",\"version\":1},{\"id\":\"custom.recording\",\"version\":1},{\"id\":\"custom.tvsearch\",\"version\":1},{\"id\":\"custom.disabledCapabilities\",\"version\":1},{\"id\":\"samsungvd.remoteControl\",\"version\":1},{\"id\":\"samsungvd.ambient\",\"version\":1},{\"id\":\"samsungvd.ambientContent\",\"version\":1},{\"id\":\"samsungvd.ambient18\",\"version\":1},{\"id\":\"samsungvd.mediaInputSource\",\"version\":1},{\"id\":\"refresh\",\"version\":1},{\"id\":\"execute\",\"version\":1},{\"id\":\"samsungvd.firmwareVersion\",\"version\":1},{\"id\":\"samsungvd.supportsPowerOnByOcf\",\"version\":1},{\"id\":\"sec.diagnosticsInformation\",\"version\":1}],\"categories\":[{\"name\":\"Television\",\"categoryType\":\"manufacturer\"}]}],\"createTime\":\"2024-12-25T12:49:39.531Z\",\"profile\":{\"id\":\"adbf79a5-7969-3781-9f19-191da78fcd9b\"},\"ocf\":{\"ocfDeviceType\":\"oic.d.tv\",\"name\":\"Samsung 4 Series (32)\",\"specVersion\":\"core.1.1.0\",\"verticalDomainSpecVersion\":\"res.1.1.0,sh.1.1.0\",\"manufacturerName\":\"Samsung Electronics\",\"modelNumber\":\"UA32T4410AKLXL\",\"platformVersion\":\"5.5\",\"platformOS\":\"Tizen\",\"hwVersion\":\"\",\"firmwareVersion\":\"T-KTS2UABC-2503.0\",\"vendorId\":\"VD-STV_2018_K\",\"vendorResourceClientServerVersion\":\"4.0.26\",\"lastSignupTime\":\"2024-12-25T12:49:35.065456283Z\",\"transferCandidate\":false,\"additionalAuthCodeRequired\":false},\"type\":\"OCF\",\"restrictionTier\":0,\"allowed\":[],\"executionContext\":\"CLOUD\"}],\"_links\":{}}";
        JSONObject jsonObject = new JSONObject(jsonString);

        JSONArray itemsArray = jsonObject.getJSONArray("items");

        for (int i = 0; i < itemsArray.length(); i++) {
            JSONObject item = itemsArray.getJSONObject(i);
            JSONObject ocfObject = item.getJSONObject("ocf");
            String firmwareVersion = ocfObject.getString("firmwareVersion");
            System.out.println("Fir V: " + firmwareVersion);
        }
    }
}

package Airlines;

import Utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class Base {

    public static Map<String, Object> dataFromJsonFile;

    static {
        String env = System.getProperty("env") == null ? "Prod" : System.getProperty("env");
        try {
            dataFromJsonFile = JsonUtils.getJsonDataAsMap("Airlines/"+env+"/airlinesApiData.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

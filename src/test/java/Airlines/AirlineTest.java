package Airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class AirlineTest extends AirlinesAPI {

    @Test
    public void createAirline() throws IOException {
        Map<String, Object> payLoad = Payloads.getCreateAirlinePayloadFromMap("252d3bca-d9bb-476c-9a97-562d685e235c", "Sri Lankan Airways",
                "Sri Lanka", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
                "From Sri Lanka", "Katunayake, Sri Lanka", "www.srilankaaairways.com", "1990");
        Response response = createAirline(payLoad);
        Assert.assertEquals(response.statusCode(), 200);

    }

}

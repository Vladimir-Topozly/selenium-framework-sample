package api;

import api.tools.APIClient;
import org.json.simple.JSONObject;

public class TestRailAPI {

    public static void main(String[] args) throws Exception {
        APIClient client = new APIClient("https://vovavovavova.testrail.io");
//        client.setUser("Vova");
//        client.setPassword("Vova1");

        JSONObject c = (JSONObject) client.sendGet("cases/results/1");
        System.out.println(c.get("title"));
    }
}

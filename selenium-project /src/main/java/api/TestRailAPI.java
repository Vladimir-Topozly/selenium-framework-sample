package api;

import org.json.simple.JSONObject;

public class TestRailAPI {

    public static void main(String[] args) throws Exception {
        APIClient client = new APIClient("http://vovavovavova/testrail/");
        client.setUser("Vova");
        client.setPassword("Vova1");
//
//        JSONObject c = (JSONObject) client.sendGet("get_case/1");
//        System.out.println(c.get("title"));
    }
}

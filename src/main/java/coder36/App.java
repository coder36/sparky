package coder36;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import java.net.*;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) throws Exception {

        staticFileLocation("/public");


        get("/bill", (req, resp) -> {
            Map<String, Object> map = new HashMap<>();
            map.put("data", new ObjectMapper().readValue(new URL("http://localhost:4567/bill.json"), HashMap.class));
            map.put("helper", new Helper());
            return new ModelAndView(map, "bill.ftl");
        }, new FreeMarkerEngine());

    }

}

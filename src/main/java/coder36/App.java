package coder36;

import org.apache.commons.io.IOUtils;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;
import java.net.*;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) throws Exception {

        staticFileLocation("/public");


        get("/bill", (req, resp) -> {
            Map<String, Object> map = new HashMap<>();
            map.put("data", IOUtils.toString(new URL("http://localhost:4567/bill.json")));
            map.put("h", new Helper());

            return new ModelAndView(map, "bill.ftl");
        }, new FreeMarkerEngine());

    }

}

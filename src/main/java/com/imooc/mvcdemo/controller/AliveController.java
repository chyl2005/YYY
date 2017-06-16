package com.imooc.mvcdemo.controller;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/monitor")
public class AliveController {


    private static final Logger LOGGER = LoggerFactory.getLogger(AliveController.class);


    /**
     * alive接口，检查服务是否正常
     *
     * @return
     */
    @RequestMapping("/alive")
    @ResponseBody
    public Map<String, Object> monitorAlive() {
        LOGGER.info("alive");
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", "ok");
        return result;
    }

}

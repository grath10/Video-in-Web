package com.june.video.controller;

import com.june.video.domain.Device;
import com.june.video.mapper.DeviceMapper;
import com.june.video.utils.CommandUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Autowired
    private DeviceMapper deviceDao;
    private CommandUtils commandUtils = new CommandUtils();

    @RequestMapping("/index")
    public String main() {
        return "index";
    }

    @RequestMapping({"/", "login"})
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/stream/start")
    @ResponseBody
    public void getWebStream(@RequestParam String cid) {
        Device device = new Device();
        device.setClientid(cid);
        device = deviceDao.selectOne(device);
        if(device != null) {
            String srcUrl = device.getStreamurl();
            commandUtils.runFFmpegCmd(cid, srcUrl, "http://127.0.0.1:8081/supersecret", null);
        }
    }

    @RequestMapping("/stream/stop")
    @ResponseBody
    public void stopWebStream(@RequestParam String cid) {
        commandUtils.stopRunningCommand(cid);
    }
}

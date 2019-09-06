package com.june.video.controller;

import com.june.video.utils.CommandUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
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
        String srcUrl = "rtsp://admin:zqtech123@192.168.1.196/h264/ch1/main/av_stream";
        commandUtils.runFFmpegCmd(cid, srcUrl, "http://127.0.0.1:8081/supersecret", null);
    }

    @RequestMapping("/stream/stop")
    @ResponseBody
    public void stopWebStream(@RequestParam String cid) {
        commandUtils.stopRunningCommand(cid);
    }
}

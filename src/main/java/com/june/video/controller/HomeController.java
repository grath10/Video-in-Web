package com.june.video.controller;

import com.june.video.utils.CommandUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String main() {
        return "index";
    }

    @RequestMapping({"/", "login"})
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/stream")
    @ResponseBody
    public void getWebStream() {
        CommandUtils.runFFmpegCmd("rtsp://admin:zqtech123@192.168.1.196/h264/ch1/main/av_stream", "http://127.0.0.1:8081/supersecret");
    }
}

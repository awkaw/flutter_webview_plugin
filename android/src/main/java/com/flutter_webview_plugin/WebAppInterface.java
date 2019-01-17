package com.flutter_webview_plugin;

import java.util.HashMap;
import java.util.Map;

public class WebAppInterface {

    //@JavascriptInterface
    public void exec(String command, String param) {

        Map<String, Object> data = new HashMap<>();
        data.put("command", command);
        data.put("param", param);

        FlutterWebviewPlugin.channel.invokeMethod("onExec", data);
    }
}

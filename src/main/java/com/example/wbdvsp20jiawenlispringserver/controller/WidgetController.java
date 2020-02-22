package com.example.wbdvsp20jiawenlispringserver.controller;

import com.example.wbdvsp20jiawenlispringserver.models.Widget;
import org.springframework.web.bind.annotation.*;
import com.example.wbdvsp20jiawenlispringserver.services.WidgetService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")

class WidgetController {
    WidgetService widgetService = new WidgetService();

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidget(){
        return widgetService.findAllWidgets();
    }

    @GetMapping("/api/topics/{tid}/widgets")
    public List<Widget> findWidgetsForTopic(@PathVariable("tid") String tid){
        return widgetService.findWidgetsForTopic(tid);
    }

    @PostMapping("/api/topics/{tid}/widgets")
    Widget createWidget(@PathVariable("tid") String tid, @RequestBody Widget widget){
        widget.setTid(tid);
        return widgetService.createWidget(widget);
    }


    @PutMapping("/api/widgets/{wid}")
    int updateWidget(@PathVariable("wid") String wid, @RequestBody Widget widget){
        return widgetService.updateWidget(wid,widget);
    }

    @DeleteMapping("/api/widgets/{wid}")
    int deleteWidget(@PathVariable("wid") String wid){
        return widgetService.deleteWidget(wid);
    }

}
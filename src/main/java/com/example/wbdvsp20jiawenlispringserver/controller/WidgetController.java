package com.example.wbdvsp20jiawenlispringserver.controller;

import com.example.wbdvsp20jiawenlispringserver.models.Topic;
import com.example.wbdvsp20jiawenlispringserver.models.Widget;
import com.example.wbdvsp20jiawenlispringserver.services.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {

    @Autowired
    WidgetService widgetService;

    @PostMapping("/api/topics/{tid}/widgets")
    public Widget createWidget(
            @PathVariable("tid") int tid,
            @RequestBody Widget widget){
        return widgetService.createWidget(tid, widget);
    }

    @GetMapping("/api/topics/{tid}/widgets")
    public List<Widget> findWidgetsForTopic(@PathVariable("tid") int tid){
        return widgetService.findWidgetsForTopic(tid);
    }

    @PutMapping("/api/widgets/{wid}")
    public int updateWidget(
            @PathVariable("wid") int wid,
            @RequestBody Widget widget){
        return widgetService.updateWidget(wid, widget);
    }

    @DeleteMapping("/api/widgets/{wid}")
    public int deleteWidget(@PathVariable("wid") int wid){
        return widgetService.deleteWidget(wid);
    }

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets(){
        return widgetService.findAllWidgets();
    }

    @GetMapping("/api/widgets/{wid}")
    public Widget findWidgetById(@PathVariable("wid") int wid){
        return widgetService.findWidgetById(wid);
    }
}

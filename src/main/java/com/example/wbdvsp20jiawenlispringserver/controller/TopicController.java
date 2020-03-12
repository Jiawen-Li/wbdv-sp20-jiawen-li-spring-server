package com.example.wbdvsp20jiawenlispringserver.controller;

import com.example.wbdvsp20jiawenlispringserver.models.Topic;
import com.example.wbdvsp20jiawenlispringserver.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TopicController {

    @Autowired
    TopicService topicService;

    @PostMapping("/api/lessons/{lid}/topics")
    public Topic createTopic(
            @PathVariable("lid") String lessonId,
            @RequestBody Topic topic) {
        return topicService.createTopic(lessonId, topic);
    }

    @GetMapping("/api/lessons/{lid}/topics")
    public List<Topic> findTopicsForLesson(@PathVariable("lid") String lid){
        return topicService.findTopicsForLesson(lid);
    }

    @PutMapping("/api/topics/{tid}")
    public int updateTopic(
            @PathVariable("tid") int tid,
            @RequestBody Topic topic){
        return topicService.updateTopic(tid, topic);
    }

    @DeleteMapping("/api/topics/{tid}")
    public int deleteTopic(@PathVariable("tid") int tid){
        return topicService.deleteTopic(tid);
    }

    @GetMapping("/api/topics")
    public List<Topic> findAllTopics(){
        return topicService.findAllTopic();
    }

    @GetMapping("/api/topics/{tid}")
    public Topic findTopicById(@PathVariable("tid") int tid){
        return topicService.findTopicById(tid);
    }
}

package com.example.wbdvsp20jiawenlispringserver.services;

import com.example.wbdvsp20jiawenlispringserver.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.wbdvsp20jiawenlispringserver.repositories.TopicRepository;

import java.util.List;

@Service
public class TopicService {
    final
    TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public Topic createTopic(String lid, Topic topic){
        topic.setLessonId(lid);
        return topicRepository.save(topic);
    }

    public List<Topic> findTopicsForLesson(String lid){
        return topicRepository.findTopicForLesson(lid);
    }

    public int updateTopic(int tid, Topic topic){
        try {
            topic.setId(tid);
            topicRepository.save(topic);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int deleteTopic(int tid){
        try{
            topicRepository.deleteById(tid);
            return 1;
        } catch (Exception e){
            return 0;
        }
    }

    public List<Topic> findAllTopic(){
        return (List<Topic>) topicRepository.findAll();
    }

    public Topic findTopicById(int tid){
        return topicRepository.findTopicById(tid);
    }
}

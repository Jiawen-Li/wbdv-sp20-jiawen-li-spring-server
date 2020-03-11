package com.example.wbdvsp20jiawenlispringserver.repositories;

import com.example.wbdvsp20jiawenlispringserver.models.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface TopicRepository
    extends CrudRepository<Topic, Integer> {

    @Query(value = "SELECT * from topics", nativeQuery = true)
    public List<Topic> findAllTopics();

    @Query(value = "SELECT * from topics where topics.lessonId = :lid", nativeQuery = true)
    public List<Topic> findTopicForLesson(@Param("lid") String lessonId);

    @Query(value = "SELECT * from topics where topics.id = :tid", nativeQuery = true)
    public Topic findTopicById(@Param("tid") Integer topicId);


}

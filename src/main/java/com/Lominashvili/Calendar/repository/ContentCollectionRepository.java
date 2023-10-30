package com.Lominashvili.Calendar.repository;

import com.Lominashvili.Calendar.model.Content;
import com.Lominashvili.Calendar.model.Status;
import com.Lominashvili.Calendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();
    public  ContentCollectionRepository(){

    }

    public  List<Content> findAll(){
        return contentList;
    }

    public Optional<Content> findById(Integer id){
        return  contentList.stream().filter(e -> e.id().equals(id)).findFirst();
    }

    public void save( Content content){
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }
    public boolean existById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }
    public void delete(Integer id){
    contentList.removeIf(c -> c.id().equals(id));
}
    @PostConstruct
    private  void init(){
        Content c = new Content(
                1,
                 "my first blog",
                 "my frist blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");

        contentList.add(c);

    }
}

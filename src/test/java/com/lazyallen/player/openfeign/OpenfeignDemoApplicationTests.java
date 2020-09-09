package com.lazyallen.player.openfeign;

import com.lazyallen.player.openfeign.client.ToDoClient;
import com.lazyallen.player.openfeign.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class OpenfeignDemoApplicationTests {

    @Autowired
    ToDoClient toDoClient;

    @Test
    void contextLoads() {
        Todo todo = Todo.builder()
                .id(1)
                .userId(1)
                .title("delectus aut autem")
                .completed(false).build();
        Assert.isTrue(todo.equals(toDoClient.getOne(1)),"failed");
    }

}

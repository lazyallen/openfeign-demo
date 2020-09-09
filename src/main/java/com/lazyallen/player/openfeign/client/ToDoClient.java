package com.lazyallen.player.openfeign.client;

import com.lazyallen.player.openfeign.entity.Todo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "todo",url = "http://jsonplaceholder.typicode.com")
public interface ToDoClient {

    @GetMapping("/todos/{number}")
    Todo getOne(@PathVariable("number") int number);
}

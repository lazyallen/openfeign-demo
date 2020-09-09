package com.lazyallen.player.openfeign.client;

import com.lazyallen.player.openfeign.entity.Comment;
import feign.Param;
import feign.RequestLine;

public interface CommentClient {

    @RequestLine("GET /comments/{number}")
    Comment getOne(@Param("number") int number);
}

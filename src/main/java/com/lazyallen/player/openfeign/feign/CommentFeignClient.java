package com.lazyallen.player.openfeign.feign;

import com.lazyallen.player.openfeign.client.CommentClient;
import com.lazyallen.player.openfeign.entity.Comment;
import feign.Feign;
import feign.gson.GsonDecoder;

public class CommentFeignClient {

    public static void main(String[] args) {
        CommentClient commentClient = Feign.builder()
                .decoder(new GsonDecoder())
                .target(CommentClient.class,"http://jsonplaceholder.typicode.com");
        Comment one = commentClient.getOne(1);
    }
}

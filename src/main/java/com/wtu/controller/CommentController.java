package com.wtu.controller;

import com.wtu.entity.Comment;
import com.wtu.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentMapper commentService;

    //查看评论
    @RequestMapping("/allComment")
    public String allComment(Model model) {
        List<Comment> commentList = commentService.allComment();
        model.addAttribute("commentList", commentList);
        return "commentList";
    }
}

package com.wtu.service;

import com.wtu.entity.Comment;
import com.wtu.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> allComment() {
        return commentMapper.allComment();
    }
}

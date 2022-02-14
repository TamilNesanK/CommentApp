package com.comment.app.service;

import java.util.List;

import com.comment.app.model.Comment;

public interface CommentService {
	List<Comment> ShowAllComments();
	Comment filterComment(String emailId);
}

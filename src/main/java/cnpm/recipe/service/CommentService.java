package cnpm.recipe.service;

import java.util.List;

import cnpm.recipe.model.Comment;
import cnpm.recipe.repository.CommentRepository;

public class CommentService {
	private CommentRepository repository;
	public CommentService() {
		repository= new CommentRepository();
	}
	public List<Comment> getListCommentByIdRecipe(int id){
		return repository.getListCommentByIdRecipe(id);
	}
	public boolean insertComment(Comment comment) {
		return repository.insertComment(comment) ==1?true:false;
	}
}

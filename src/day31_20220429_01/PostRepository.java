package day31_20220429_01;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {

	static List<PostDTO> postList = new ArrayList<>();

	public boolean save(PostDTO newPost) {
		return postList.add(newPost);
	}

	public List<PostDTO> findAll() {
		return postList;
	}

	public PostDTO findById(Long findId) {
		PostDTO post = null;
		for (int i = 0; i < postList.size(); i++) {
			if (findId.equals(postList.get(i).getId())) {
				
				post = postList.get(i);
			}
		}
		return post;
	}

	public boolean login(Long id, String postPass) {
		boolean result = false;
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId()) && postPass.equals(postList.get(i).getPostPass())) {
				result = true;
			}

		}
		return result;
	}

	public Long loginCheck(Long id, String postPass) {
		Long loginId = null;
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId()) && postPass.equals(postList.get(i).getPostPass())) {
				loginId = postList.get(i).getId();
			}
		}
		return loginId;
	}

	public PostDTO update(Long loginId, String updateTitle, String updateContents) {
		PostDTO post = null;
		for (int i = 0; i < postList.size(); i++) {
			if (loginId.equals(postList.get(i).getId())) {
				postList.get(i).setPostTitle(updateTitle);
				postList.get(i).setPostContents(updateContents);
				post = postList.get(i);
			}
		}
		return post;

	}
}

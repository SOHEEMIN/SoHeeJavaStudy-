package day31_20220429_01;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {

	static List<PostDTO> postList = new ArrayList<>();
	List<PostDTO> sList = new ArrayList<>();

	public boolean save(PostDTO newPost) {
		return postList.add(newPost);
	} //add()메서드는 boolean을 메서드 성공 여부를 return
	/*
	 * 매개변수의 타입: PostDTO 
	 * 매개변수의 이름: newPost
	 * 리턴: boolean
	 * 메서드 이름: save
	 */

	public List<PostDTO> findAll() {
		return postList;
	}


	public PostDTO findById(Long findId, int plus) {
		PostDTO post = null;
		for (int i = 0; i < postList.size(); i++) {
			if (findId.equals(postList.get(i).getId())) {
				plus = postList.get(i).getPostHits();
				postList.get(i).setPostHits(++plus);
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

	public PostDTO search(String searchWriter) {
		PostDTO post = null;
		for (int i = 0; i < postList.size(); i++) {
			if (searchWriter.equals(postList.get(i).getPostWriter())) {
				postList.get(i).setPostWriter(searchWriter);
				post = postList.get(i);
				sList.add(post);
				System.out.println(sList.get(i));
			}
		}
		return post;

	}public void delete(Long deletedId) {
		for (int i = 0; i<postList.size();i++) {
			if(deletedId.equals(postList.get(i).getId())) {
				postList.remove(i);
			}
		}
	}
}
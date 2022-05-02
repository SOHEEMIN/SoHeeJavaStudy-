package day31_20220429_02;

import java.util.*;

public class PostRepository {
	static List<PostDTO> postList = new ArrayList<>();

	/*
	 * 매개변수타입: 매개변수이름: 리턴: 메서드이름:
	 */
	public boolean save(PostDTO newPost) {
		return postList.add(newPost);
	}
	/*
	 * 매개변수의 타입: PostDTO 
	 * 매개변수의 이름: newPost
	 * 리턴: boolean
	 * 메서드 이름: save
	 */
	
	public List<PostDTO> findAll() {
		return postList;
	}
	/*
	 * 매개변수의 타입: X 
	 * 매개변수의 이름: x
	 * 리턴: List
	 * 메서드 이름: findAll
	 */
	
	public void updateHits(Long postId) {
		for (int i = 0; i < postList.size(); i++) {
			if (postId.equals(postList.get(i).getId())) {
				int hits = postList.get(i).getPostHits(); // 현재 조회수 값
				hits = hits + 1; // 현재 조회수에서 하나 증가
				postList.get(i).setPostHits(hits);
//				postList.get(i).setPostHits(postList.get(i).getPostHits() + 1);
			}
		}
	}
	/*
	 * 매개변수의 타입: Long
	 * 매개변수의 이름: postId
	 * 리턴: X
	 * 메서드 이름: updateHits
	 */

	public PostDTO findById(Long postId) {
		PostDTO post = null;
		for (int i = 0; i < postList.size(); i++) {
			if (postId.equals(postList.get(i).getId())) {
				post = postList.get(i);
			}
		}
		return post;
	}
	
	/*
	 * 매개변수의 타입: Long
	 * 매개변수의 이름: postId
	 * 리턴: PostDTO
	 * 메서드 이름: findById
	 */
	
	
	public Long postCheck(Long postId, String postPass) {
		Long checkId = null;
		for (int i = 0; i < postList.size(); i++) {
			if (postId.equals(postList.get(i).getId()) && postPass.equals(postList.get(i).getPostPass())) {
				checkId = postList.get(i).getId();
			}
		}
		return checkId;
	}
	/*
	 * 매개변수의 타입: Long, String
	 * 매개변수의 이름: postId, postPass
	 * 리턴: Long
	 * 메서드 이름: postCheck
	 */
	

	public PostDTO update(Long checkId, String postTitle, String postContents) {
		PostDTO updatePost = null;
		for (int i = 0; i < postList.size(); i++) {
			if (checkId.equals(postList.get(i).getId())) {
				postList.get(i).setPostTitle(postTitle);
				postList.get(i).setPostContents(postContents);
				updatePost = postList.get(i);
			}
		}
		return updatePost;
	}
	/*
	 * 매개변수의 타입: Long, String, String
	 * 매개변수의 이름: checkId, postTitle, postContents
	 * 리턴: postDTO
	 * 메서드 이름: update
	 */
	

	public List<PostDTO> search(String keyword) {
		// keyword: 사용자가 찾고 싶은 작성자
		// postList에 저장된 작성자와 일치하는 것만 찾아서 searchList에 저장
		List<PostDTO> searchList = new ArrayList<>();
		for (int i = 0; i < postList.size(); i++) {
			if (keyword.equals(postList.get(i).getPostWriter())) {
				PostDTO searchPost = postList.get(i);
				searchList.add(searchPost);

//				searchList.add(postList.get(i));
			}
		}
		return searchList;
	}
	/*
	 * 매개변수의 타입: String
	 * 매개변수의 이름: keyword
	 * 리턴: List
	 * 메서드 이름: search
	 */

	public void delete(Long checkId) {
		for (int i = 0; i < postList.size(); i++) {
			if (checkId.equals(postList.get(i).getId())) {
				postList.remove(i);
			}
		}
	}
	/*
	 * 매개변수의 타입: Long
	 * 매개변수의 이름: checkId
	 * 리턴: X
	 * 메서드 이름: delete
	 */

}

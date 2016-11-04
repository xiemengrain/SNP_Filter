/**
 * 
 */
package com.snp.preprocess;

import java.util.ArrayList;
import java.util.List;

import com.snp.models.Post;

/**
 * @author Shirish
 *
 */
public class PreprocessUtil {
	
	private SplitSentences splitSentencesUtil;
	
	public PreprocessUtil(){
		this.splitSentencesUtil = new SplitSentences();
	}
	
	/**
	 * Populate the Post objects with sentences and tokens
	 * @param posts
	 * @return
	 */
	public List<Post> populatePostSentences(List<Post> posts){
		
		List<Post> populatedPosts = new ArrayList<Post>();
		for(Post post : posts){
			populatedPosts.add(splitSentencesUtil.splitPostToSentences(post));
		}
		return populatedPosts;
	}
	
	/**
	 * Remove stop words from the posts
	 * @param posts
	 * @return
	 */
	public List<Post> removeStopWordsFromPosts(List<Post> posts){
		
		List<Post> removedStopWordPosts = new ArrayList<Post>();
		RemoveStopWords removeStopWords = new RemoveStopWords();
		
		for(Post post : posts){
			removedStopWordPosts.add(removeStopWords.removeStopWordsFromPosts(post));
		}
		return removedStopWordPosts;
	}
}

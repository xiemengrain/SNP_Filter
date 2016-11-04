/**
 * 
 */
package com.snp.preprocess;

import com.snp.models.Post;

/**
 * @author Shirish
 *
 */
public class SplitSentences {
	
	/**
	 * Populates the posts with sentences
	 * @param post
	 * @return
	 */
	public Post splitPostToSentences(Post post){
		String[] sentences = splitSentences(post.getRawData());
		post.populateSentences(sentences);
		return post;
	}
	
	/**
	 * Splits and trims the raw data of the posts
	 * @param postRawData
	 * @return
	 */
	public String[] splitSentences(String postRawData){
		String[] sentences = postRawData.split("[.]");
		for(int i = 0; i < sentences.length; i++){
			sentences[i] = sentences[i].trim();
		}
		return sentences;
	}

}

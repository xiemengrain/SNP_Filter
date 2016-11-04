package com.snp.models;

import java.util.List;

public class Sentence {
	
	private String rawSentence;
	private List<String> words;
	private List<String> tags;
	private List<String> userMentions;
	
	public Sentence(String sentence){
		this.rawSentence = sentence;
	}
	
	public String getRawSentence() {
		return rawSentence;
	}
	public void setRawSentence(String rawSentence) {
		this.rawSentence = rawSentence;
	}
	public List<String> getWords() {
		return words;
	}
	public void setWords(List<String> words) {
		this.words = words;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> hashTags) {
		this.tags = hashTags;
	}
	public List<String> getUserMentions() {
		return userMentions;
	}
	public void setUserMentions(List<String> userMentions) {
		this.userMentions = userMentions;
	}
}

/**
 * 
 */
package com.snp.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Shirish
 *
 */
public class ReadInput {
	
	private String filePath;
	
	public ReadInput(String path){
		this.filePath = path;
	}
	
	/**
	 * Reads the input file to get the post data into a list
	 * @return list of posts
	 */
	@SuppressWarnings("resource")
	public List<String> getPostContent(){
		
		List<String> posts = new ArrayList<String>();
		File file = new File(System.getProperty("user.dir") + this.filePath);
	    try {
    		BufferedReader br = new BufferedReader(new FileReader(file));
    		String line;
		    while ((line = br.readLine()) != null) {
		       posts.add(line);
		    }
		    return posts;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<String>();
	}
}

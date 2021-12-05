/**
 * 
 */
package com.sdp;

import java.io.IOException;

import com.testData.FileReaderClass;


public class FileReaderManager {

	private FileReaderManager()
	{
		
	}
	
	public static FileReaderManager getInstanceFRM() 
	{
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public FileReaderClass getInstanceFR() throws IOException {
		FileReaderClass fr = new FileReaderClass();
		return fr;
	}
	
}

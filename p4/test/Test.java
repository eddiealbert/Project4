package test;

import java.util.ArrayList;
import java.util.Random;

import fsImpl.FlexibleExtents;
import fsImpl.MultiLevelIndex;
import memory.Memory;
 
public class Test {
    
    public static String generateFileName(Boolean random) {
        Random _alphanumeric = new Random();
        Random _length = new Random();
        
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int length = random ? _length.nextInt(12) : 4;
        
        char[] fileName = new char[length];
        for(int i = 0; i < length; i++) {
            fileName[i] = characters.charAt(_alphanumeric.nextInt(characters.length()));
        }
        
        return new String(fileName);
    }
    
    public static ArrayList<String> generateFiles(int numFiles, boolean random) {
        ArrayList<String> files = new ArrayList<String>();
        
        for (int i = 0; i < numFiles; i++) {
            files.add(generateFileName(random));
        }
        
        return files;
    }
    
    public static void testCases(boolean totallyRandom, int numFiles) {
    	Memory memory = new Memory();
    	System.out.println("There are " + memory.freeSpace() + " blocks of free"
    			+ " space on disk.");
    	
        ArrayList<String> filesTest = generateFiles(numFiles, totallyRandom);
        System.out.println(filesTest.toString());
    	
    	MultiLevelIndex m = new MultiLevelIndex(filesTest.get(0));
    	FlexibleExtents f = new FlexibleExtents(filesTest.get(0));
    	
    }
    
    public static void main(String[] args) {
        testCases(true, 25);
    }
}

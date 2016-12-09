package memory;

import java.util.ArrayList;

public class Inode extends Block {
    public static ArrayList<Integer> inodeBitmap = new ArrayList<Integer>();
    private final fileTypeEnum FILE_TYPE;
    private final int INODE_NUMBER;
    private int fileSize;
    private int blocksAllocated;
    private ArrayList<Integer> blockRefs;
    
    public static enum fileTypeEnum {
        file, directory
    }
    
    public Inode(fileTypeEnum fileType, int inodeNumber, int size, int numBlocks,
                 ArrayList<Integer> blockReferences) {
        this.FILE_TYPE = fileType;
        this.INODE_NUMBER = inodeNumber;
        this.fileSize = size;
        this.blocksAllocated = numBlocks;
        this.blockRefs = new ArrayList<Integer>(blockReferences);
    }
    
    public fileTypeEnum getFileType() {
        return FILE_TYPE;
    }
    
    public int getInodeNumber() {
        return INODE_NUMBER;
    }
    
    public int getFileSize() {
        return fileSize;
    }
    
    public int getNumberOfBlocks() {
        return blocksAllocated;
    }
    
    public void showBlockReferences() {
        System.out.println(blockRefs.toString());
    }
    
    public static void main(String[] args) {
        
    }
}
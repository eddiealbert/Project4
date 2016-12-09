package memory;

public class Memory {
    Block[] blocks = new Block[64];
    
    public Memory() {
        super();
    }
    
    public Block getSuperBlock() {
        return blocks[0];
    }
    
    public int freeSpace() {
        int space = 0;
        
        for(Block b : blocks) {
            if (b == null) {
                space++;
            }
        }
        
        return space;
    }
}

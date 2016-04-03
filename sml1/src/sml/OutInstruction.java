package sml;
/**
 * This class is a sub-class of the Instruction abstract class
 * author selva kuppusamy
 */

public class OutInstruction extends Instruction {

    private int register;

    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public OutInstruction(String label, int register) {
        super(label, "out");
       	this.register = register;
     }

    
    public int getRegister() {
    	return register;
    }
    //Print the contents of register s1 on the Java console (using println)
    @Override
    public void execute(Machine m) {      
        System.out.println(m.getRegisters().getRegister(register));
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register;
    }
	
}
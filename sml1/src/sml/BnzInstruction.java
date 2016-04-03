package sml;

/**
 * This class is a sub-class of the Instruction abstract class
 *If the contents of register s1 is not zero, 
 *then make the statement labeled L2 the next one to execute
 * @author selva kuppusamy
 */

public class BnzInstruction extends Instruction {

    private int register;
    private String donext;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String donext) {
        super(label, "bnz");

        	this.register = register;
        	this.donext = donext;
        }
   @Override
    public void execute(Machine m) {      
        if (m.getRegisters().getRegister(register) != 0) {
        	m.setPc(m.getLabels().indexOf(donext));
        }
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " go to " + donext;
    }
	
}
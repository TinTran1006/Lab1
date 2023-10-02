
public class AgentProgram {

	public Action execute(Percept p) {// location, status
		//TODO
		if(p.getLocationState()==p.getLocationState().DIRTY) return Environment.SUCK_DIRT;
		if(p.getAgentLocation().equals(Environment.LOCATION_A)) return Environment.MOVE_RIGHT;
		if(p.getAgentLocation().equals(Environment.LOCATION_A)) return Environment.MOVE_DOWN;
		if(p.getAgentLocation().equals(Environment.LOCATION_B)) return Environment.MOVE_LEFT;
		if(p.getAgentLocation().equals(Environment.LOCATION_B)) return Environment.MOVE_DOWN;
		if(p.getAgentLocation().equals(Environment.LOCATION_C)) return Environment.MOVE_LEFT;
		if(p.getAgentLocation().equals(Environment.LOCATION_C)) return Environment.MOVE_UP;
		if(p.getAgentLocation().equals(Environment.LOCATION_D)) return Environment.MOVE_RIGHT;
		if(p.getAgentLocation().equals(Environment.LOCATION_D)) return Environment.MOVE_UP;
			
		return NoOpAction.NO_OP;
		
	}
}
package potato;
import battlecode.common.*;

public strictfp class HQ extends Building {
    boolean firstRun = false;

    HQ(RobotController rc) throws GameActionException {
        super(rc);
    }

    @Override
    public void run() throws GameActionException {
        for (Direction dir : directions){
            tryBuild(RobotType.MINER, dir);
        }
    }
}
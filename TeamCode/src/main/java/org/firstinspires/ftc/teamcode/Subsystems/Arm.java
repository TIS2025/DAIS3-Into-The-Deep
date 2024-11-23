package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Globals.ServoConst;
import org.firstinspires.ftc.teamcode.Hardware.RobotHardware;

public class Arm {
    private RobotHardware robot;
    public Arm(RobotHardware robot){this.robot = robot;}

    public enum GripperState{
        OPEN,CLOSE,INIT
    }
    public enum WristState{
        WRIST0,WRIST90,INIT
    }
    public enum ElbowState{
        INIT,UP,DOWN
    }
    public enum ShoulderState{
        INIT,UP,DOWN
    }
    public enum YawState{
        INIT,NEUTRAL,LEFT,RIGHT
    }

    public GripperState gripperState = GripperState.INIT;
    public WristState wristState = WristState.INIT;
    public ElbowState elbowState = ElbowState.INIT;
    public ShoulderState shoulderState = ShoulderState.INIT;
    public YawState yawState = YawState.INIT;

    public void updateGripperState(GripperState state){
        switch(state) {
            case INIT:
                setGripper(ServoConst.gripperInit);
                gripperState = GripperState.INIT;
                break;
            case CLOSE:
                setGripper(ServoConst.gripperClose);
                gripperState = GripperState.CLOSE;
                break;
            case OPEN:
                setGripper(ServoConst.gripperOpen);
                gripperState = GripperState.OPEN;
                break;
        }
    }

    public void updateWristState(WristState state){
        switch (state){
            case INIT:
                setWrist(ServoConst.wristInit);
                wristState = WristState.INIT;
                break;
            case WRIST0:
                setWrist(ServoConst.wrist0);
                wristState = WristState.WRIST0;
                break;
            case WRIST90:
                setWrist(ServoConst.wrist90);
                wristState = WristState.WRIST90;
                break;
        }
    }

    public void updateElbowState(ElbowState state){
        switch (state){
            case INIT:
                setElbow(ServoConst.elbowInit);
                elbowState = ElbowState.INIT;
                break;
            case UP:
                setElbow(ServoConst.elbowUp);
                elbowState = ElbowState.UP;
                break;
            case DOWN:
                setElbow(ServoConst.elbowDown);
                elbowState = ElbowState.DOWN;
                break;
        }
    }

    public void updateShoulderState(ShoulderState state){
        switch (state){
            case INIT:
                setShoulder(ServoConst.shoulderInit);
                shoulderState = ShoulderState.INIT;
                break;
            case DOWN:
                setShoulder(ServoConst.shoulderDown);
                shoulderState = ShoulderState.DOWN;
                break;
            case UP:
                setShoulder(ServoConst.shoulderUp);
                shoulderState = ShoulderState.UP;
                break;
        }
    }

    public void updateYawState(YawState state){
        switch (state){
            case INIT:
                setYaw(ServoConst.yawInit);
                yawState = YawState.INIT;
                break;
            case NEUTRAL:
                setYaw(ServoConst.yawNeutral);
                yawState = YawState.NEUTRAL;
                break;
            case LEFT:
                setYaw(ServoConst.yawLeft);
                yawState = YawState.LEFT;
                break;
            case RIGHT:
                setYaw(ServoConst.yawRight);
                yawState = YawState.RIGHT;
                break;
        }
    }

    public void setGripper(double pos){robot.gripper.setPosition(pos);}
    public void setWrist(double pos){robot.wrist.setPosition(pos);}
    public void setElbow(double pos){robot.elbow.setPosition(pos);}
    public void setShoulder(double pos){robot.elbow.setPosition(pos);}
    public void setYaw(double pos){robot.elbow.setPosition(pos);}
}

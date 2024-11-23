package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Globals.MotorConst;
import org.firstinspires.ftc.teamcode.Hardware.RobotHardware;

public class Hanger {
    private RobotHardware robot;
    public Hanger(RobotHardware robot){this.robot = robot;}

    public enum HangerState{
        INIT,UP,DOWN
    }

    public HangerState hangerState = HangerState.INIT;

    public void updateHangerState(HangerState state){
        switch (state){
            case INIT:
                setHanger(MotorConst.hangerInit);
                hangerState = HangerState.INIT;
                break;
            case UP:
                setHanger(MotorConst.hangerUp);
                hangerState = HangerState.UP;
                break;
            case DOWN:
                setHanger(MotorConst.hangerDown);
                hangerState = HangerState.DOWN;
                break;
        }
    }

    public void setHanger(int target){
        robot.hanger.setTargetPosition(target);
        robot.hanger.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.hanger.setPower(1);
    }

    public boolean isHangerBusy(){
        return robot.hanger.isBusy();
    }
}

package org.firstinspires.ftc.teamcode.Hardware;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.MecanumDrive;

public class RobotHardware {

    //DRIVE
    public MecanumDrive drive;
    DcMotorEx leftFront,leftBack,rightFront,rightBack;

    //SLIDER
    public DcMotorEx extRight,extLeft,turret;

    //ARM
    public Servo shoulder,yaw,elbow,wrist,gripper;

    //TODO HANGER
    public DcMotorEx hanger;

    //Todo Color Sensor, Camera
    public RevColorSensorV3 colorSenor;

    public RobotHardware(HardwareMap hardwareMap){

        //DRIVE init
        this.drive = new MecanumDrive(hardwareMap,new Pose2d(new Vector2d(0,0),0));

        //SLIDER init
        //TODO Directions
        this.extRight = hardwareMap.get(DcMotorEx.class,"extensionRight");
        this.extLeft = hardwareMap.get(DcMotorEx.class,"extensionLeft");
        this.turret = hardwareMap.get(DcMotorEx.class,"turret");

        //ARM init
        this.shoulder = hardwareMap.get(Servo.class,"shoulder");
        this.yaw = hardwareMap.get(Servo.class,"yaw");
        this.elbow = hardwareMap.get(Servo.class,"elbow");
        this.wrist = hardwareMap.get(Servo.class,"wrist");
        this.gripper = hardwareMap.get(Servo.class,"gripper");

        //HANGER init
        this.hanger = hardwareMap.get(DcMotorEx.class,"hanger");
    }
}

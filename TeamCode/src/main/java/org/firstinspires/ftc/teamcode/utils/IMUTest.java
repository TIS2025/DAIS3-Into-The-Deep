package org.firstinspires.ftc.teamcode.utils;

import com.acmerobotics.roadrunner.Line;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.IMU;

@TeleOp(name = "IMU Test")
public class IMUTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        IMU imu = hardwareMap.get(IMU.class, "imu");
        IMU.Parameters parameters = new IMU.Parameters(new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.RIGHT,
                RevHubOrientationOnRobot.UsbFacingDirection.BACKWARD));
        imu.initialize(parameters);

        waitForStart();
        while (opModeIsActive()){
            telemetry.addData("IMU heading",imu.getRobotYawPitchRollAngles().getPitch());
            telemetry.addData("IMU heading",imu.getRobotYawPitchRollAngles().getRoll());
            telemetry.addData("IMU heading",imu.getRobotYawPitchRollAngles().getYaw());
            telemetry.update();
        }
    }
}

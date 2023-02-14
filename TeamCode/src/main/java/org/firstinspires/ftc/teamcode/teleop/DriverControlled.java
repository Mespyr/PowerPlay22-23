package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.hardware.TwoMotorOmniDrive;

@TeleOp
public class DriverControlled extends OpMode {
    TwoMotorOmniDrive drive;

    @Override
    public void init() {
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        // move forward using left joystick
        drive.setFrontPower(gamepad1.left_stick_y);

        // strafe using the left and right trigger
        if (gamepad1.right_trigger > 0)
            drive.setCenterPower(gamepad1.right_trigger);
        else if (gamepad1.left_trigger > 0)
            drive.setCenterPower(gamepad1.left_trigger);
        else drive.setCenterPower(0);
    }
}
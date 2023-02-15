package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.hardware.TurnTable;
import org.firstinspires.ftc.teamcode.hardware.TwoMotorOmniDrive;

@TeleOp
public class DriverControlled extends OpMode {
    private TwoMotorOmniDrive drive;
    private TurnTable turnTable;

    @Override
    public void init() {
        drive.init(hardwareMap);
        turnTable.init(hardwareMap);
    }

    @Override
    public void loop() {
        // control robot direction using left joystick
        drive.setFrontPower(gamepad1.left_stick_y);
        drive.setCenterPower(gamepad1.left_stick_x);

        // control turn table using right joystick
        turnTable.setPower(gamepad1.right_stick_x);
    }
}
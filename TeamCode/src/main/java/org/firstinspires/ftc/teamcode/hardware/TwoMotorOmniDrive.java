package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TwoMotorOmniDrive {
    private DcMotorEx front;
    private DcMotorEx center;

    public void init(HardwareMap hwMap) {
        front = hwMap.get(DcMotorEx.class, "frontMotor");
        center = hwMap.get(DcMotorEx.class, "centerMotor");
    }

    public void setFrontPower(double p) { front.setPower(p); }
    public void setCenterPower(double p) { center.setPower(p); }
}

package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TurnTable {
    private DcMotorEx table;

    public void init(HardwareMap hwMap) {
        table = hwMap.get(DcMotorEx.class, "tableMotor");
    }

    public void setPower(double p) { table.setPower(p); }
}

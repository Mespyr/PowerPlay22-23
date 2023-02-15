package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TurnTable {
    private CRServo table;

    public void init(HardwareMap hwMap) {
        table = hwMap.get(CRServo.class, "tableServo");
    }

    public void setPower(double p) {
        table.setPower(p);
    }
}
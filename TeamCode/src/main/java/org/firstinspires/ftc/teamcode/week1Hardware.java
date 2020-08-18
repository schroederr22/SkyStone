package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.Rev2mDistanceSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class week1Hardware {
    public DcMotor motorLeft;
    public DcMotor motorRight;

    ColorSensor sensorColor = null;

    Rev2mDistanceSensor distSensor = null;




    // Define hardware map
    HardwareMap hwMap;

    // Initialize standard hardware interfaces
    public void init(HardwareMap ahwMap) {

        hwMap = ahwMap;

        // Here we name the motors.
        motorLeft  = hwMap.get(DcMotor.class, "motot_l");
        motorRight = hwMap.get(DcMotor.class, "motor_r");

        motorRight.setDirection(DcMotor.Direction.FORWARD);
        motorLeft.setDirection(DcMotor.Direction.REVERSE);

        //0 power; because our other programs do that
        motorLeft.setPower(0);
        motorRight.setPower(0);

        // Setting the motors to use encoders
        motorLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


        sensorColor = hwMap.get(ColorSensor.class, "sensorColor");

        distSensor = hwMap.get(Rev2mDistanceSensor.class, "distanceSensor");

    }
}

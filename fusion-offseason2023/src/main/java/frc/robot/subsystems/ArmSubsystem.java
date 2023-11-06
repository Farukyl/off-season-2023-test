// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;
import frc.robot.auto_arm.AutoArmConstants.armPidConstants;

public class ArmSubsystem extends SubsystemBase {
  /** Creates a new ArmSubsystem. */
  
  armPidConstants armPidConstants = new armPidConstants();
  ArmConstants armConstants = new ArmConstants();
  CANSparkMax armSpark = new CANSparkMax(armConstants.WRIST_SPARK_ID, MotorType.kBrushless);
  RelativeEncoder armEncoder = armSpark.getEncoder();
  
  
  
  public ArmSubsystem() {}

  public void givePower2Arm(double speed) {
    armSpark.set(speed);  
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

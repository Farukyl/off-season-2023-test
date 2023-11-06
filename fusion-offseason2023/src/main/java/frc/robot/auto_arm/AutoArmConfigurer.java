package frc.robot.auto_arm;


import edu.wpi.first.math.controller.PIDController;
import frc.robot.Constants.ArmConstants;
import frc.robot.auto_arm.AutoArmConstants.armPidConstants;

public class AutoArmConfigurer {
    armPidConstants armPidConstants = new armPidConstants();
    ArmConstants armConstants = new ArmConstants();
    PIDController  armpPidController = new PIDController(armPidConstants.K_ARM_P, armPidConstants.K_ARM_I, armPidConstants.K_ARM_D);
    double degreeSetPoint = armPidConstants.ARM_SETPOINT;
    

    
    
}

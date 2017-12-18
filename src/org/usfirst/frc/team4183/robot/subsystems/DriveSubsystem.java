package org.usfirst.frc.team4183.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.*;
import edu.wpi.first.wpilibj.RobotDrive;
import org.usfirst.frc.team4183.robot.RobotMap;

public class DriveSubsystem extends Subsystem 
{
	CANTalon leftMotorA;
	CANTalon leftMotorB;
	
	CANTalon rightMotorA;
	CANTalon rightMotorB;
	
	RobotDrive driveRobot;
	
	public static void main(String[] args)
	{
		
	}
	
	public void initDefaultCommand()
	{
		//set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
	public DriveSubsystem()
	{
		rightMotorA = new CANTalon(RobotMap.RIGHT_FRONT_MOTOR_ID);
		rightMotorB = new CANTalon(RobotMap.RIGHT_REAR_MOTOR_ID);
		
		leftMotorA = new CANTalon(RobotMap.LEFT_FRONT_MOTOR_ID);
		leftMotorB = new CANTalon(RobotMap.LEFT_REAR_MOTOR_ID);
		
		driveRobot = new RobotDrive(leftMotorA, leftMotorB, rightMotorA, rightMotorB);
	}
	
	public void arcadeDrive(double forwardValue, double turnValue)
	{
		driveRobot.arcadeDrive(forwardValue, turnValue);
	}

}

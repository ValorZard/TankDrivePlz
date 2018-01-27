/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1458.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends IterativeRobot {
	private DifferentialDrive m_myRobot;
	private Joystick m_leftStick;
	private Joystick m_rightStick;

	//@Override
	public void robotInit() {
		WPI_TalonSRX m_frontLeft = new WPI_TalonSRX(1);
		WPI_TalonSRX m_midLeft = new WPI_TalonSRX(2);
		WPI_TalonSRX m_rearLeft = new WPI_TalonSRX(3);
		SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_midLeft, m_rearLeft);

		WPI_TalonSRX m_frontRight = new WPI_TalonSRX(1);
		WPI_TalonSRX m_midRight = new WPI_TalonSRX(2);
		WPI_TalonSRX m_rearRight = new WPI_TalonSRX(3);
		SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_midRight, m_rearRight);

		DifferentialDrive m_drive = new DifferentialDrive(m_frontLeft, m_frontRight);
	}
	
    public void autonomousInit() {

	}

	public void autonomousPeriodic() {

	}
	//@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		
	}

	
	//@Override
	public void teleopPeriodic() {
		m_myRobot.tankDrive(m_leftStick.getY(), m_rightStick.getY());
	}
	
	
    
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;



import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  //This is a comment

  String helloString = new String("Hello CC");
  String myName = new String("Graham Long");
  Timer myTimer = new Timer();
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    System.out.println(helloString);
    System.out.println(helloString.toUpperCase());
    System.out.println(helloString.toLowerCase());
    System.out.println(myName);
    myTimer.reset();
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {

  }

  /**
   * This autonomous (along with the chooser code above) shows how to select between different
   * autonomous modes using the dashboard. The sendable chooser code works with the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the chooser code and
   * uncomment the getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to the switch structure
   * below with additional strings. If using the SendableChooser make sure to add them to the
   * chooser code above as well.
   */
  @Override
  public void autonomousInit() {
    myTimer.stop();
    myTimer.reset();
    myTimer.start();
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    if(myTimer.get() >= 10.0){
      System.out.println("Autonomous Running");
      myTimer.restart();
    }
    
  }

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {
    myTimer.stop();
    myTimer.reset();
    myTimer.start();
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    if(myTimer.get() >= 5.0){
      System.out.println("Teleop Running");
      myTimer.restart();
    }
  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {
    myTimer.stop();
    myTimer.reset();
    myTimer.start();
  }

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {
    if(myTimer.get() >= 10.0){
      System.out.println("Disabled Running");
      myTimer.restart();
    }
  }

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {
    myTimer.stop();
    myTimer.reset();
    myTimer.start();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {
    if(myTimer.get() >= 15.0){
      System.out.println("Test Running");
      myTimer.restart();
    }
  }
}

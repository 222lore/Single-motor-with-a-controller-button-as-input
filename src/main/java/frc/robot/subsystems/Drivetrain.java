/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import static frc.robot.Constants.*;


public class Drivetrain extends SubsystemBase {
  /**
   * Creates a new Drivetrain.
   */

  private WPI_TalonSRX main;

  public Drivetrain() {
    main = new WPI_TalonSRX(MAIN_MOTOR);

  }

  public void setOn() {
    main.set(1);

  }

  public void setOff() {
    main.set(0);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

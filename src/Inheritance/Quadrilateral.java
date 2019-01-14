package Inheritance;

public class Quadrilateral {
 private double s1;
 private double s2;
 private double s3;
 private double s4;
 
 public Quadrilateral()
 {
	s1 = 0;
	s2 = 0;
	s3 = 0;
	s4 = 0;
 }

 public Quadrilateral(double xS1, double xS2, double xS3, double xS4)
 {
	 xS1 = s1;
	 xS2 = s2;
	 xS3 = s3;
	 xS4 = s4;
 }
 
 public void setSide1(double xS1)
 {
	 xS1 = s1;
 }
 
 public void setSide2(double xS2)
 {
	 xS2 = s2;
 }
 
 public void setSide3(double xS3)
 {
	 xS3 = s3;
 }
 
 public void setSide4(double xS4)
 {
	xS4 = s4; 
 }
 
 public double getSide1()
 {
	 return s1;
 }
 
 public double getSide2()
 {
	 return s2;
 }
 
 public double getSide3()
 {
	 return s3;
 }
 
 public double getSide4()
 {
	 return s4;
 }
 
 public double getPerimeter()
 {
	 return s1 + s2 + s3 + s4;
 }
 
 public String toString()
 {
	 return "This ia a quadrilateral with dimensions of Side 1: " + s1 + " Side 2: " + s2 + " Side 3: " + s3 + " Side 4: " + s4;
 }
 
}

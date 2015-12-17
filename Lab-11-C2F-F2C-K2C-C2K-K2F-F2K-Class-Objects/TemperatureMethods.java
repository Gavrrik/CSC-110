
public class TemperatureMethods {

// VARIABLES
   private double Fahrenheit;
   private double Celsius;
   private double Kelvin;
   
   
   public void DegreesToFahrenheit(double degreess)
   {
	   Fahrenheit = (degreess - 32) * (5.0/9) + 273;
   }
   public void DegreesToCelsius(double degreess)
   {
	  Celsius = 9 *(degreess / 5)+32;
   }
   public void DegreesToKelvin(double degreess) 
   {
	   Kelvin = (degreess - 32) * (5.0/9) + 273;
   }
   
   public void FahrenheitDegreesToCelsius(double degreess)
   {
	   Celsius = 5 *(degreess - 32)/9;
   }
   public void CelsiusDegreesToKelvin(double degreess)
   {
	   Kelvin = degreess + 273.15F;
   }
   public void KelvinDegreesToCelsius(double degreess)
   {
	   Celsius = degreess - 273.0;
   }
         
   public void KelvinDegreesToFahrenheit(double degreess) 
   {
	   Fahrenheit = ((degreess - 273) * (9.0/5)) + 32;
   }
   
   //GET RETURN VARIABLES
   
   public double getFahrenheit()
   {
	   return Fahrenheit;
   }
   public double getCelsius()
   {
	   return Celsius;
   }

   public double getKelvin()
   {
	   return Kelvin;
   }

}

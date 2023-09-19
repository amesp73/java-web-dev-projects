package org.launchcode;

/* shared behaviors:
both spin
both store data
both read data
both can write data
on load, both report information like name, capacity, disc type, etc
both inserted into a drive
 */

/* Interface Behaviors
- both spin; spinDisc()
- both read by laser; readDisc();
- both written by laser; writeDisc()
- both store data; storeData()
- both report data; reportData();
 */

/* Abstract Class Behaviors
- fields; storage space, spin speed, name, disc type
- physical fields; thickness, space between spirals
 */
public interface OptimalDisc {
    // declare and initialize constant fields
    int maxRPM = 5000;
    //add method signature for each behavior
    void spinDisc();
    String readDisc();
    void writeDisc();
    void reportData();

}

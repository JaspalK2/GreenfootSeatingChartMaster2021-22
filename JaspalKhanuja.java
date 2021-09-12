import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The KilgoreTrout class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class JaspalKhanuja extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the KilgoreTrout class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public JaspalKhanuja(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    
    public JaspalKhanuja() {
        firstName="Jaspal";
        lastName="Khanuja";
        mySeatX=2;
        mySeatY=2;
       //imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-360.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                
                standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-90.jpg";
                setImage(standingFile);
                Greenfoot.delay(10);
                standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-180.jpg";
                setImage(standingFile);
                Greenfoot.delay(10);
                standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-270.jpg";
                setImage(standingFile);
                Greenfoot.delay(10);
                 standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-360.jpg";
                setImage(standingFile);
                Greenfoot.delay(10);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
            
                myHobby("I love to spend time with my dog!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
            standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-90.jpg";
                setImage(standingFile);
                Greenfoot.delay(10);
                standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-180.jpg";
                setImage(standingFile);
                Greenfoot.delay(10);
                standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-270.jpg";
                setImage(standingFile);
                Greenfoot.delay(10);
                 standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-360.jpg";
                setImage(standingFile);
                Greenfoot.delay(10);
                sitDown();
            }
        
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */

   
    /**
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){
        setLocation(7,6);
         Greenfoot.delay(10);
        // move right
     
        for (int i= 7;i<=11;i++){
              for(int p = 0; i <=3; i++){
        if(p == 0){
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-90.jpg";
        setImage(standingFile);
        Greenfoot.delay(10);
    }
    if(p == 1){
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-90.jpg";
         setImage(standingFile);
        Greenfoot.delay(10);
    }
    if(p == 2){
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-270.jpg";
         setImage(standingFile);
        Greenfoot.delay(10);
    }
    if(p == 3){
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-360.jpg";
         setImage(standingFile);
        Greenfoot.delay(10);
    }
    
       
    }
            setLocation(7,i);
            Greenfoot.delay(10);
        }
        boolean x = true;
        int z= 0;
         while (x== true){
            if (z ==0){
            setLocation(7,z);
            z++;
            Greenfoot.delay(10);
        }
        else{
            setLocation(7,11);
            z++;
            x = false;
            Greenfoot.delay(10);
        }
        }
        // move back
        //standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-180.jpg";
        for (int i=7;i>=1;i--){
            
            setLocation(i,11);
            Greenfoot.delay(10);
        }      
         // move left
        //standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-270.jpg";
         for (int i=11;i>=2;i--){
            
            if(i == 5){
                
                boolean p = true;
        int k= 0;
         while (p== true){
            if (k ==0){
            setLocation(0,5);
            k++;
            Greenfoot.delay(10);
        }
        else{
            setLocation(11,5);
            k++;
            p = false;
            Greenfoot.delay(10);
        }
        }
            }
            setLocation(1,i);
            Greenfoot.delay(10);
        }      
              // move Forward
       //standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-360.jpg";
        for (int i=2;i<=7;i++){
            
            setLocation(i, 2);
            Greenfoot.delay(10);
        }   
       // standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-90.jpg";
        for (int i=2;i<=6;i++){
            
            setLocation(7, i);
            Greenfoot.delay(10);
        }   
        
           Greenfoot.delay(20);
           returnToSeat();
    }
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby(String s) {
         System.out.println(s);
}

}
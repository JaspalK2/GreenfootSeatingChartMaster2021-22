import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AnyaSengupta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnyaSengupta extends Student
{
    /**
     * Act - do whatever the AnyaSengupta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public AnyaSengupta(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public AnyaSengupta() {
        firstName="Anya";
        lastName="Sengupta";
        mySeatX=1;
        mySeatY=1;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
    }
    
     /**
     * Act - do whatever the AnyaSengupta actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                setImage("anyasengupta-standing.jpg");// Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
                //setRotation(0); // un-rotate actor
                myHobby("I like to play basketball!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            //circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
           imagechange();
            setRotation(0);
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
     * This is a local method specific to the AnyaSengupta class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){
        setLocation(0,0);
         Greenfoot.delay(10);
        // move right
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
        }
        // move back
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            Greenfoot.delay(10);
        }      
         // move left
        for (int i=9;i>=0;i--){
            setLocation(7,7);
            Greenfoot.delay(10);
        }      
              // move Forward
        /*for (int i=5;i>=0;i--){
            setLocation(4,i);
            Greenfoot.delay(10);
        }   */
           Greenfoot.delay(20);
           returnToSeat();
    }
    public void imagechange() {
        setLocation(1,2);
        Greenfoot.delay(20);
        setLocation(10,2);
        Greenfoot.delay(20);
        setLocation(1,10);
        Greenfoot.delay(20);
        setLocation(10,10);
        Greenfoot.delay(20);
        setLocation(6,6);
        Greenfoot.delay(20);
        for (int i=1;i<=360;i=i+4){
            Greenfoot.delay(2);
            setImage("anyasengupta-standing2.jpg");
            setRotation(i);
            getImage().scale(100+i, 125+i);
            Greenfoot.delay(2);
            turn(5);
            setImage("anyasengupta-standing.jpg");
            setRotation(i);
            getImage().scale(100+i, 125+i);
            turn(5);
    }
        /*Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing2.jpg");
        Greenfoot.delay(2);
        setImage("anyasengupta-standing.jpg");
        Greenfoot.delay(2);*/
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

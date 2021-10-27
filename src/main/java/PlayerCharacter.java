import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PlayerCharacter {
    private String hairColor;
    private String hairType;
    private String shirtType;
    private String pantType;
    private String shoes;
    private String eyeColor;
    private String skinColor;
    private int hitBox;
    private int movementSpeed;
    private int playerStrength;
    private double money;
    private int happiness;

    public PlayerCharacter(String hairColor,String hairType,String shirtType, String pantType, String shoes, String eyeColor, String skinColor){
        this.money=0;
        this.movementSpeed=2;
        this.hitBox=2;
        this.playerStrength=1;
        this.happiness = 5;
        this.hairType=hairType;
        this.hairColor=hairColor;
        this.shirtType=shirtType;
        this.pantType=pantType;
        this.shoes=shoes;
        this.eyeColor=eyeColor;
        this.skinColor=skinColor;
    }
    public void getVisual(){
        System.out.println("You character has "+hairColor+" "+hairType+" hair, a "+shirtType+" shirt, "+pantType+" pants, "+shoes+" shoes, "+eyeColor+" eyes, and "+skinColor+" skin.");
    }
    public double returnBalance(){
        if (this.money<50){
            this.happiness--;
        }
        return this.money;
    }
    private void calculateMovementSpeed(){
        this.movementSpeed=this.playerStrength/2;
    }
    private void calculatePlayerStrength(){
        this.playerStrength=10-(this.hitBox*3);
    }
    private void calculateHitbox(){
        this.hitBox=4-(this.playerStrength/3);
    }
    public void exercise(){
        this.playerStrength++;
        calculateHitbox();
        calculateMovementSpeed();
        System.out.println("Wow, that was hard.");
        System.out.println("Stats: hit-box size = "+this.hitBox+", movement speed = "+this.movementSpeed+",strength = "+this.playerStrength+".");
    }
    public void getPlayerStats(){
        calculateHitbox();
        calculateMovementSpeed();
        System.out.println("Stats: hit-box size = "+this.hitBox+", movement speed = "+this.movementSpeed+",strength = "+this.playerStrength+",happiness = "+this.happiness+".");
        this.happiness++;
    }
    public void runMaxSpeed(){
        int mph;
        mph = this.movementSpeed*5;
        System.out.println("You can run at "+mph+" miles per hour!");
        this.happiness++;
    }
    public void vacation(){
        this.playerStrength--;
        happiness++;
        calculateHitbox();
        calculateMovementSpeed();
    }
}

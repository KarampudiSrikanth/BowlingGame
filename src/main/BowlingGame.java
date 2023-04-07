package test;

import java.util.Scanner;


public class BowlingGame {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int[] scr = new int[21];

int frame = 0;
int score = 0;
int roll1 = 0, roll2 = 0;

boolean strike = false, spare = false;

while(frame < 10)
{
System.out.println("Frame "+(frame+1));

roll1 = sc.nextInt();
score += roll1;

if(spare)
{
score += roll1;
spare = false;
}

if(roll1 == 10)
{
if(strike)
{
score += roll1;
}
strike = true;
frame++;
continue;
}

roll2 = sc.nextInt();
score += roll2;

if(strike)
{
score += roll1 + roll2;
strike = false;
}

if(roll1+roll2 == 10)
{
spare = true;
}

frame++;

}

if(strike)
{
System.out.println("Extra Roll 1");
roll1 = sc.nextInt();
System.out.println("Extra Roll 2");
roll2 = sc.nextInt();
score += roll1 +roll2;
}
else if(spare)
{
System.out.println("Extra Roll");
roll1 = sc.nextInt();
score += roll1;
}


System.out.println(score);
}

public int score() {
	return 0;
}

public void roll(int i) {
	
}
}

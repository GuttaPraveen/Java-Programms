package multithread;

public class ThreadDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread1 t=new Thread1();
		t.start();

	}

}
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Child Class Thread");
	}
}
/*
Program : Set of instructions is called
Process : The Execution of programm is called 
Thread :Thread is a light-weight process / seperate path of execution
Multitasking : Executing several tasks simultaneously is the concept of multitasking
		1. Process based multitasking.
		2. Thread based multitasking.

*/
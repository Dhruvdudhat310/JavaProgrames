import java.lang.Thread;
class HelloThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Hello");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WorldThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("World");
                sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class p_35 {
    public static void main(String[] args) {
        HelloThread hello = new HelloThread();
        WorldThread world = new WorldThread();
        hello.start();
        world.start();
    }
}


OUTPUT:
Hello
World
Hello
Hello
Hello
World
Hello
Hello
World
Hello
Hello
Hello
Hello
World
Hello
Hello
World
.
.
.
.
.
continue.

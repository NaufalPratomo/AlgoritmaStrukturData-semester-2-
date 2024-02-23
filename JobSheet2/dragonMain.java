package JobSheet2;

public class dragonMain {
    public static void main(String[] args) {
        
        Dragon player=new Dragon();
        player.x=0;
        player.y=0;
        player.width=5;
        player.height=5;

        player.moveUp();
        player.printPosition();
        player.moveDown();
        player.printPosition();
        player.moveLeft();
        player.printPosition();
        player.moveUp();
        player.printPosition();
        player.moveRight();
        player.printPosition();
    }
}

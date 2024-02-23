package JobSheet2;

public class dragonMain {
    public static void main(String[] args) {
        
        Dragon player=new Dragon();
        player.x=2;
        player.y=2;
        player.width=5;
        player.height=7;

        player.moveUp();
        player.printPosition();
        player.moveDown();
        player.printPosition();
        player.moveLeft();
        player.printPosition();
        player.moveRight();
        player.printPosition();
    }
}

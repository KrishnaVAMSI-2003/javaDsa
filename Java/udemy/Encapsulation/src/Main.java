public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "KV";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+player.healthRemaining());
//        EnhancedPlayer player = new EnhancedPlayer("KV",100,"sword");
//        System.out.println(player.getHealth());

        Printer printer = new Printer(50,false);
        System.out.println("initial page count = "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "+ pagesPrinted+" new total print count for printer = "+printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was "+ pagesPrinted+" new total print count for printer = "+printer.getPagesPrinted());
    }
}
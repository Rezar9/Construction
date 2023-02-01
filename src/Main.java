public class Main {
    public static void main(String[] args){
    Work mainbuild=new Work(100.3,50.2,25.67,true,20,"Ліньтяї");
    Work work = new Work(100.3,50.2,25.67,true,20,"Ліньтяї", 100);
    System.out.println(mainbuild.getVolume());
    System.out.println("кількість вікон"+mainbuild.getWindows());
    mainbuild.getNezmin(3,"Teplo","Yarmo","Sklovse");

    System.out.println();

    Board bo=new Board(12,15, 10);
    Board board = new Board(12,15, 10, false);

    System.out.println(bo.getSquareBoard());
    bo.getNezmin(2,"ясень","береза");

    System.out.println();

    Team team=new Team(27,6,3);
    Team team1 = new Team(27,6,3, "Sunday");
    System.out.println("кількість лідерів:" + team.getLeader());
    team.getNezmin(2, "Дикий Цвітан Федорович", "Дичковський Леонід Янович");

    bo.getPosl(1);
    System.out.println(bo.getWidth() + " " + bo.getLength());

    System.out.println();

    bo.getSquareBoard(10, 10);
    bo.getPerimeterBoard();

    System.out.println("Перевірка наявності світла !");
    board.timeOut();

    System.out.println();
    mainbuild.getVolume(10,10,10);
    mainbuild.getSquare(10,10);


    System.out.println("Зарплата !");
    work.money();

    System.out.println("Перевірка матеріалу !");
    work.timeOut();

    System.out.println("Перевірка на вихідний !");
    team1.timeOut();
    team1.getExp(team);






}
}

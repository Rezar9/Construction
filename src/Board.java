public class Board extends WorkBreak{
    private int bo_number;
    private int length;
    private int width;
    private boolean light;

    public Board(int bo_number, int length, int width) {
        this.bo_number = bo_number;
        this.length = length;
        this.width = width;
    }

    public Board(int bo_number, int length, int width, boolean light) {
        this.bo_number = bo_number;
        this.length = length;
        this.width = width;
        this.light = light;
    }

    private int squareBoard(){
        return length*width;
    }

    private void perimeterBoard(){
        int p;
        p=2*(length+width);
    }

    private double squareBoard(double length,double width){
        return length*width;//перевизначений метод
    }
    private void nezmin(int bo_number, String...viewboard ) { //  метод із статичним імям і динамічною логікою
        System.out.println("Для будівництва буде стільки видів досок на вибір " + bo_number);
        for (int i = 0; i < viewboard.length; i++) {
            System.out.println(viewboard[i]);
        }

    }
    private Board posl(int a) {
        length += a;
        width += a;
        return new Board(bo_number, length, width);
    }

    @Override
    void timeOut() {
        if (light) {
            System.out.println("Робочі Мають світло !");
        } else {
            System.out.println("Робочі не мають світла. Потрібний генератор !!!");
        }
    }

    public void setBo_number(int bo_number) {
        int bon=bo_number*2;
        this.bo_number = bo_number;
    }

    public Board getPosl(int a) {
        return posl(a);
    }

    public void getNezmin(int bo_number, String...viewboard ) {
        nezmin(bo_number, viewboard);
    }

    public double getSquareBoard(double length,double width) {
        return squareBoard(length, width);
    }

    public void getPerimeterBoard() {
        perimeterBoard();
    }


    public int getSquareBoard() {
        return squareBoard();
    }

    public int getBo_number() {
        return bo_number;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



}


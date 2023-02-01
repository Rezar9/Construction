public class Work extends WorkBreak implements Salary{
    private double width;
    private double length;
    private double height;
    private boolean squareplace;
    private double windows;
    private String company;
    private double materials;
    final int PRICE = 50;


    public Work(double width, double length, double height, boolean squareplace, double windows, String company) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.squareplace = squareplace;
        this.windows = windows;
        this.company = company;
    }

    public Work(double width, double length, double height, boolean squareplace, double windows, String company, double materials) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.squareplace = squareplace;
        this.windows = windows;
        this.company = company;
        this.materials = materials;
    }

    private double volume(){
        double v;
        return v=width*length*height;
    }
    private void square(int width,int length){
        int s;
        s=length*width;
    }

    private int volume(int width, int length, int height){
        int v;
        v=width*length*height;
        return v;   //перевизначений метод
    }

    private void nezmin(int windows, String...comwindows ) {         //  метод із статичним імям і динамічною логікою
        System.out.println("можлива заміна вікон 3 іншими компаніями"+windows);
        for (String comwindow : comwindows) {
            System.out.println(comwindow);
        }
    }

    @Override
    void timeOut() {
        if (materials > 0) {
            System.out.println("Робочі не мають з чого робити. Тому вони йдуть на перерву !!!!");
        } else {
            System.out.println("Робочі мають достатньо матеріалу !!");
        }
    }

    @Override
    public void money() {
        System.out.println("Ви заробите за цей об'єкт: " + materials * PRICE);
    }

    public void getNezmin(int windows, String...comwindows ) {
        nezmin(windows, comwindows);
    }

    public int getVolume(int width, int length, int height) {
        return volume(width, length, height);
    }

    public void getSquare(int width,int length) {
        square(width, length);
    }

    public double getVolume() {
        return volume();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isSquareplace() {
        return squareplace;
    }

    public void setSquareplace(boolean squareplace) {
        this.squareplace = squareplace;
    }

    public double getWindows() {
        return windows;
    }

    public void setWindows(double windows) {
        this.windows = windows;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getMaterials() {
        return materials;
    }

    public void setMaterials(double materials) {
        this.materials = materials;
    }


}


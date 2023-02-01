public class Team extends WorkBreak{
    private int employes;
    private int siders;
    private int leader;
    private String date;

    public Team(int employes, int siders, int leader) {
        this.employes = employes;
        this.siders = siders;
        this.leader = leader;
    }

    public Team(int employes, int siders, int leader, String date) {
        this.employes = employes;
        this.siders = siders;
        this.leader = leader;
        this.date = date;
    }

    private void simpleEmployers(int siders, int employes) {
        int num;
        num = siders + employes;
    }

    private int leadern() {
        return leader;
    }

    private double leadern(double leader) {
        return leader;//перевизначений метод.
    }

    private void nezmin(int leader, String... study) { //  метод із статичним імям і динамічною логікою
        System.out.println("Кількість керівників закінчивших навчальні заклади по спеціальності " + leader);
        for (int i = 0; i < study.length; i++) {
            System.out.println(study[i]);
        }
    }

    @Override
    void timeOut() {
        if (date.toLowerCase().equals("sunday")) {
            System.out.println("Сьогодні у робочих вихідний !");
        } else {
            System.out.println("Сьогодні робочий день !");
        }
    }

    private int exp(Team team){
        simpleEmployers(4,22);
        return team.siders;
    }

    public int getExp(Team team) {
        return exp(team);
    }

    public void getNezmin(int leader, String... study) {
        nezmin(leader, study);
    }

    public double getLeadern(double leader) {
        return leadern(leader);
    }

    public int getLeadern() {
        return leadern();
    }

    public void getSimpleEmployers(int siders, int employes) {
        simpleEmployers(siders, employes);
    }

    public int getEmployes() {
        return employes;
    }

    public void setEmployes(int employes) {
        this.employes = employes;
    }

    public int getSiders() {
        return siders;
    }

    public void setSiders(int siders) {
        this.siders = siders;
    }

    public int getLeader() {
        return leader;
    }

    public void setLeader(int leader) {
        this.leader = leader;
    }


}
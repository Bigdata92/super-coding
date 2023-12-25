package exercise.chapter_31;

public class Fish {
    // 속성
    private String sex;     // "Male", "Female"
    protected boolean havingPoison;       // true : 독 o / false : 독 x
    private String startSpawningDate;   // 산란 시작시각
    private String endSpawningDate;   // 산란 종료시각
    private String leavingSea;  // 사는 속성

    // 행위
    void eat(String food) {
        System.out.printf(myInfo() + " 는 %s를 먹고 있습니다.\n", food);
    }

    void swim(int meter) {
        System.out.println("나는 헤엄칩니다 미터 : " + meter);
    }

    void makeCrowd(Fish otherFish) {
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }
    void sleep(){};

    public String myInfo() {
        return "Fish{" +
                "sex='" + sex + '\'' +
                ", havingPoison=" + havingPoison +
                ", startSpawningDate='" + startSpawningDate + '\'' +
                ", endSpawningDate='" + endSpawningDate + '\'' +
                ", leavingSea='" + leavingSea + '\'' +
                '}';
    }

    public void printMyInfo() {
        System.out.println(myInfo());
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isHavingPoison() {
        return havingPoison;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public String getStartSpawningDate() {
        return startSpawningDate;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        this.startSpawningDate = startSpawningDate;
    }

    public String getEndSpawningDate() {
        return endSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public String getLeavingSea() {
        return leavingSea;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }
}

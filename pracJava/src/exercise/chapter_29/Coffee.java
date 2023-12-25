package exercise.chapter_29;

public class Coffee {
    // 속성
    private String coffeeName;
    private long waterQuantity;     // ml 단위
    private long coffeeBeanQuantity;     // 원두의 양 g 단위
    private boolean isWrappedUp;    // 포장 여부

    // 행위
    boolean isWrappedUp() {
        this.isWrappedUp = true;
        return isWrappedUp;
    }

    // 생성자
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false;
    };

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public long getWaterQuantity() {
        return waterQuantity;
    }

    public void setWaterQuantity(long waterQuantity) {
        this.waterQuantity = waterQuantity;
    }

    public long getCoffeeBeanQuantity() {
        return coffeeBeanQuantity;
    }

    public void setCoffeeBeanQuantity(long coffeeBeanQuantity) {
        this.coffeeBeanQuantity = coffeeBeanQuantity;
    }

    public void setWrappedUp(boolean wrappedUp) {
        isWrappedUp = wrappedUp;
    }
}

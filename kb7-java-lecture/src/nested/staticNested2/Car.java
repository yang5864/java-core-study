package nested.staticNested2;

public class Car {
    private String model;
    private boolean isStated = false;
    private static int soldCount = 0;

    public Car(String model) {
        soldCount++;
        this.model = model;
    }

    public static class CarStatus {
        private Car car;

        public CarStatus(Car car) {
            this.car = car;
        }

        public void showStatus() {
            System.out.println("지금까지 팔린 차는 : " + soldCount);
            System.out.println("지금 차는 : " + car.model);
        }
    }
    private class Engine {
        void start(){
            isStated = true;
            System.out.println("엔진을 켭니다");
        }
    }

    public void drive() {
        Engine engine = new Engine();
        engine.start();

        if (isStated == true) {
            System.out.println("차를 운전합니다.");
        } else {
            System.out.println("엔진을 켜주세요");
        }
    }
}

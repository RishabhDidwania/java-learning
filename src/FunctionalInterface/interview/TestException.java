
/*
* Point out all the errors in this
* */


//class VehicleException extends Exception {
//    public VehicleException(String str) {
//        System.out.println("Thrown Vehicle Exception For : " + str);
//    }
//}
//class CarException extends VehicleException {
//    public CarException(String str) {
//        super(str);
//        System.out.println("Thrown Car Exception For : " + str);
//    }
//}
//class HatchbackException extends CarException {
//    public HatchbackException() {
//        super("Hatchback");
//    }
//}
//class SUVException extends CarException {
//    public SUVException() {
//        super("SUV");
//    }
//}
//public class TestException {
//
//    public void testCar() throws CarException { // testHatchback -> VehicleException but we CarException
//        testHatchback();
//        testSUV();
//    }
//    public void testHatchback() throws VehicleException {
//        throw new VehicleException("Hatchback");
//    }
//    public void testSUV() throws SUVException {
//        throw new SUVException();
//    }
//    public static void main(String[] args) {
//        TestException testException = new TestException();
//        testException.testCar();
//    }
//
//}
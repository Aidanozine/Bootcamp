package Book3.chapter3;

class CountTest {
    private static int instanceCount = 0;

    public CountTest() {

        instanceCount++;
    }

    public static int getInstanceCount() {

        return instanceCount;
    }

    public static int instanceCount() { //only necessary if line 12 is active

        return instanceCount;
    }
}

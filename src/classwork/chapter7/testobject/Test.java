package classwork.chapter7.testobject;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    Test(int i) {
        a = i;
    }
    Test incrByTen(){
        Test temp = new Test (a+10);
        return temp;
    }
}

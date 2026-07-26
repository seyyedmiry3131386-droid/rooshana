package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class li2 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile m28 b = new m28(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.e((int) 115.0f, new mi2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.e((int) 130.0f, new mi2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.e((int) 150.0f, new mi2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.e((int) 180.0f, new mi2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.e((int) 200.0f, new mi2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        tn3.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static ki2 a(float f) {
        float fD;
        ki2 mi2Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        ki2 ki2Var = (ki2) b.c(i);
        if (ki2Var != null) {
            return ki2Var;
        }
        m28 m28Var = b;
        if (m28Var.a) {
            m91.f(m28Var);
        }
        int i2 = bt2.i(m28Var.d, i, m28Var.b);
        if (i2 >= 0) {
            return (ki2) b.g(i2);
        }
        int i3 = -(i2 + 1);
        int i4 = i3 - 1;
        if (i3 >= b.f()) {
            mi2 mi2Var2 = new mi2(new float[]{1.0f}, new float[]{f});
            b(f, mi2Var2);
            return mi2Var2;
        }
        if (i4 < 0) {
            mi2Var = new mi2(fArr, fArr);
            fD = 1.0f;
        } else {
            fD = b.d(i4) / 100.0f;
            mi2Var = (ki2) b.g(i4);
        }
        float fD2 = b.d(i3) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fD == fD2 ? 0.0f : (f - fD) / (fD2 - fD))) * 1.0f) + 0.0f;
        ki2 ki2Var2 = (ki2) b.g(i3);
        float[] fArr2 = new float[9];
        for (int i5 = 0; i5 < 9; i5++) {
            float f2 = fArr[i5];
            float fB = mi2Var.b(f2);
            fArr2[i5] = ((ki2Var2.b(f2) - fB) * fMax) + fB;
        }
        mi2 mi2Var3 = new mi2(fArr, fArr2);
        b(f, mi2Var3);
        return mi2Var3;
    }

    public static void b(float f, mi2 mi2Var) {
        synchronized (c) {
            m28 m28VarClone = b.clone();
            m28VarClone.e((int) (f * 100.0f), mi2Var);
            b = m28VarClone;
        }
    }
}

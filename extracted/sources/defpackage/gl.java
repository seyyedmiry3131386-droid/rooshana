package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public final class gl implements TypeEvaluator {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ gl(int i) {
        this.a = i;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                t36[] t36VarArr = (t36[]) obj;
                t36[] t36VarArr2 = (t36[]) obj2;
                if (!wq2.k(t36VarArr, t36VarArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!wq2.k((t36[]) this.b, t36VarArr)) {
                    this.b = wq2.q(t36VarArr);
                }
                for (int i = 0; i < t36VarArr.length; i++) {
                    t36 t36Var = ((t36[]) this.b)[i];
                    t36 t36Var2 = t36VarArr[i];
                    t36 t36Var3 = t36VarArr2[i];
                    t36Var.getClass();
                    t36Var.a = t36Var2.a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = t36Var2.b;
                        if (i2 < fArr.length) {
                            t36Var.b[i2] = (t36Var3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                            i2++;
                        }
                    }
                }
                return (t36[]) this.b;
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                float[] fArr4 = (float[]) this.b;
                if (fArr4 == null) {
                    fArr4 = new float[fArr2.length];
                }
                for (int i3 = 0; i3 < fArr4.length; i3++) {
                    float f2 = fArr2[i3];
                    fArr4[i3] = dw1.f(fArr3[i3], f2, f, f2);
                }
                return fArr4;
            default:
                float fFloatValue = ((FloatEvaluator) this.b).evaluate(f, (Number) obj, (Number) obj2).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
        }
    }

    public gl() {
        this.a = 2;
        this.b = new FloatEvaluator();
    }
}

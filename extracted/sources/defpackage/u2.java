package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u2 {
    public int a;
    public int b = -1;
    public Serializable c;
    public Object d;

    public u2(String str, int i, Map map) {
        this.c = str;
        this.a = i;
        this.d = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Serializable, v2[]] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Serializable, v2[]] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [v2] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public v2 d() {
        ?? r0;
        ?? r2;
        ia8 ia8Var;
        synchronized (this) {
            try {
                v2[] v2VarArr = (v2[]) this.c;
                if (v2VarArr == null) {
                    ?? H = h();
                    this.c = H;
                    r0 = H;
                } else {
                    int i = this.a;
                    int length = v2VarArr.length;
                    r0 = v2VarArr;
                    if (i >= length) {
                        Object[] objArrCopyOf = Arrays.copyOf(v2VarArr, v2VarArr.length * 2);
                        js3.o(objArrCopyOf, "copyOf(...)");
                        this.c = (v2[]) objArrCopyOf;
                        r0 = (v2[]) objArrCopyOf;
                    }
                }
                int i2 = this.b;
                do {
                    ?? r22 = r0[i2];
                    r2 = r22;
                    if (r22 == 0) {
                        v2 v2VarG = g();
                        r0[i2] = v2VarG;
                        r2 = v2VarG;
                    }
                    i2++;
                    if (i2 >= r0.length) {
                        i2 = 0;
                    }
                } while (!r2.a(this));
                this.b = i2;
                this.a++;
                ia8Var = (ia8) this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ia8Var != null) {
            ia8Var.A(1);
        }
        return r2;
    }

    public Map f() {
        return (Map) this.d;
    }

    public abstract v2 g();

    public abstract v2[] h();

    public void i(v2 v2Var) {
        ia8 ia8Var;
        int i;
        g51[] g51VarArrB;
        synchronized (this) {
            try {
                int i2 = this.a - 1;
                this.a = i2;
                ia8Var = (ia8) this.d;
                if (i2 == 0) {
                    this.b = 0;
                }
                js3.n(v2Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                g51VarArrB = v2Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (g51 g51Var : g51VarArrB) {
            if (g51Var != null) {
                g51Var.resumeWith(tx8.a);
            }
        }
        if (ia8Var != null) {
            ia8Var.A(-1);
        }
    }

    public abstract kd3 j();

    public ia8 k() {
        ia8 ia8Var;
        synchronized (this) {
            ia8Var = (ia8) this.d;
            if (ia8Var == null) {
                int i = this.a;
                ia8Var = new ia8(1, Integer.MAX_VALUE, BufferOverflow.b);
                ia8Var.e(Integer.valueOf(i));
                this.d = ia8Var;
            }
        }
        return ia8Var;
    }

    public abstract boolean l();

    public boolean m() {
        return this.b > -1;
    }
}

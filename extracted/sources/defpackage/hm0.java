package defpackage;

import java.io.File;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class hm0 implements rs1 {
    public final /* synthetic */ int a;
    public final xl5 b;

    public hm0(xl5 xl5Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                js3.p(xl5Var, "nene");
                this.b = xl5Var;
                break;
            default:
                this.b = xl5Var;
                break;
        }
    }

    @Override // defpackage.rs1
    public final boolean m(bs1 bs1Var) {
        Object objA;
        Object objA2;
        switch (this.a) {
            case 0:
                js3.p(bs1Var, "downloadInfo");
                try {
                    boolean zA = this.b.a.a((es1) bs1Var);
                    if (zA && eq.n(bs1Var)) {
                        String strY = y97.y(bs1Var);
                        if (strY == null) {
                            strY = "";
                        }
                        zb2.f(new File(strY));
                    }
                    objA = Boolean.valueOf(zA);
                    break;
                } catch (Throwable th) {
                    objA = b.a(th);
                }
                if (Result.a(objA) != null) {
                    objA = Boolean.FALSE;
                }
                return ((Boolean) objA).booleanValue();
            default:
                js3.p(bs1Var, "downloadInfo");
                try {
                    this.b.a.f((es1) bs1Var);
                    objA2 = Boolean.TRUE;
                    break;
                } catch (Throwable th2) {
                    objA2 = b.a(th2);
                }
                if (Result.a(objA2) != null) {
                    objA2 = Boolean.FALSE;
                }
                return ((Boolean) objA2).booleanValue();
        }
    }
}

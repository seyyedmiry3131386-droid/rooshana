package defpackage;

import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class v36 implements rs1 {
    public final xl5 a;

    public v36(xl5 xl5Var) {
        js3.p(xl5Var, "nene");
        this.a = xl5Var;
    }

    @Override // defpackage.rs1
    public final boolean m(bs1 bs1Var) {
        Object objA;
        js3.p(bs1Var, "downloadInfo");
        try {
            objA = Boolean.valueOf(this.a.a.e((es1) bs1Var));
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = Boolean.FALSE;
        }
        return ((Boolean) objA).booleanValue();
    }
}

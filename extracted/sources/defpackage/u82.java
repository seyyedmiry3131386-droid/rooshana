package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u82 extends af8 {
    public final /* synthetic */ va7 e;
    public final /* synthetic */ v82 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u82(String str, va7 va7Var, v82 v82Var) {
        super(str);
        this.e = va7Var;
        this.f = v82Var;
    }

    @Override // defpackage.af8
    public final long a() throws InterruptedException {
        ua7 ua7Var;
        va7 va7Var = this.e;
        try {
            ua7Var = va7Var.d();
        } catch (Throwable th) {
            ua7Var = new ua7(va7Var, null, th, 2);
        }
        v82 v82Var = this.f;
        if (!v82Var.e.contains(va7Var)) {
            return -1L;
        }
        v82Var.f.put(ua7Var);
        return -1L;
    }
}

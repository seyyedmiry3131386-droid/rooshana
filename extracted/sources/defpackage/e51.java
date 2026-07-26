package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e51 implements e71 {
    public final w61 a;

    public e51(w61 w61Var) {
        this.a = w61Var;
    }

    @Override // defpackage.e71
    public final w61 getCoroutineContext() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}

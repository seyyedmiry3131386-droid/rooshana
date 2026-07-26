package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b42 extends d42 {
    public final om0 c;
    public final /* synthetic */ f42 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b42(f42 f42Var, long j, om0 om0Var) {
        super(j);
        this.d = f42Var;
        this.c = om0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.E(this.d);
    }

    @Override // defpackage.d42
    public final String toString() {
        return super.toString() + this.c;
    }
}

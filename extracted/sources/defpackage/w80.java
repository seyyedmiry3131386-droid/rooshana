package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w80 implements h57 {
    public final wt3 a;

    public /* synthetic */ w80(wt3 wt3Var) {
        this.a = wt3Var;
    }

    @Override // defpackage.h57
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.h57
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.h57
    public final /* synthetic */ Object c(g51 g51Var) {
        return tx8.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w80) {
            return js3.i(this.a, ((w80) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.h57
    public final /* synthetic */ void start() {
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + ')';
    }
}

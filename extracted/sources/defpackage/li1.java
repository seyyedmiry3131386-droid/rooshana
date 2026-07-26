package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class li1 extends r {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li1(w61 w61Var, boolean z, int i) {
        super(w61Var, z);
        this.d = i;
    }

    @Override // kotlinx.coroutines.c
    public boolean N(Throwable th) {
        switch (this.d) {
            case 1:
                is3.w(this.c, th);
                return true;
            default:
                return super.N(th);
        }
    }
}

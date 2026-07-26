package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hk8 extends y {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fa2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk8(boolean z, fa2 fa2Var) {
        super(4, false);
        this.c = z;
        this.d = fa2Var;
    }

    @Override // defpackage.y
    public final int n(int i) {
        if (this.c) {
            return 1;
        }
        return this.d.G(i);
    }
}

package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends w {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(a aVar, int i, int i2) {
        super(aVar, i);
        this.s = i2;
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        switch (this.s) {
            case 0:
                return j5Var;
            case 1:
                return new n(this, j5Var, 4);
            case 2:
                return new t0(1, j5Var);
            case 3:
                return new r0(this, j5Var, 4);
            case 4:
                return new a1(j5Var);
            default:
                return new z0(this, j5Var, 3);
        }
    }
}

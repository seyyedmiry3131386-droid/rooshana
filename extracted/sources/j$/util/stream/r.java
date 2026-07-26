package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends f1 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(a aVar, int i, int i2) {
        super(aVar, i);
        this.s = i2;
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new n(this, j5Var, 3);
            case 1:
                return new t0(0, j5Var);
            case 2:
                return new r0(this, j5Var, 3);
            case 3:
                return new z0(this, j5Var, 1);
            case 4:
                return j5Var;
            default:
                return new z0(this, j5Var, 4);
        }
    }
}

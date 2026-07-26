package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends x0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a aVar, int i, int i2) {
        super(aVar, i);
        this.s = i2;
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new n(this, j5Var, 2);
            case 1:
                return new r0(this, j5Var, 2);
            case 2:
                return j5Var;
            case 3:
                return new r0(this, j5Var, 5);
            default:
                return new z0(this, j5Var, 2);
        }
    }
}

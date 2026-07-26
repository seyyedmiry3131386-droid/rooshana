package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ft4 extends gt4 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft4(xh5 xh5Var, long j) {
        super(j);
        this.e = xh5Var;
    }

    private final synchronized void Q() {
        this.a = 0L;
    }

    @Override // defpackage.gt4
    public void O(long j, long j2) {
        switch (this.d) {
            case 0:
                gt4 gt4Var = (gt4) this.e;
                gt4Var.O((this.a - gt4Var.a) + j, j2);
                break;
            default:
                super.O(j, j2);
                break;
        }
    }

    @Override // defpackage.gt4
    public synchronized void P() {
        switch (this.d) {
            case 0:
                Q();
                break;
            default:
                super.P();
                break;
        }
    }

    @Override // defpackage.gt4, com.sun.jna.Pointer
    public final String toString() {
        switch (this.d) {
            case 0:
                return super.toString() + " (shared from " + ((gt4) this.e).toString() + ")";
            default:
                return ((xh5) this.e).toString();
        }
    }

    public ft4(gt4 gt4Var, long j, long j2) {
        this.e = gt4Var;
        this.b = j2;
        this.a = gt4Var.a + j;
    }
}

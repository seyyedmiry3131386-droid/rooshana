package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g42 extends y61 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public ov e;

    @Override // defpackage.y61
    public final y61 F0(int i) {
        bt2.r(i);
        return this;
    }

    public final void H0(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void L0(rp1 rp1Var) {
        ov ovVar = this.e;
        if (ovVar == null) {
            ovVar = new ov();
            this.e = ovVar;
        }
        ovVar.addLast(rp1Var);
    }

    public abstract Thread N0();

    public final void R0(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long U0();

    public final boolean Y0() {
        ov ovVar = this.e;
        if (ovVar == null) {
            return false;
        }
        rp1 rp1Var = (rp1) (ovVar.isEmpty() ? null : ovVar.removeFirst());
        if (rp1Var == null) {
            return false;
        }
        rp1Var.run();
        return true;
    }

    public void a1(long j, d42 d42Var) {
        me1.j.l1(j, d42Var);
    }

    public abstract void shutdown();
}

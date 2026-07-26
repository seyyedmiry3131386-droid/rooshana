package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class q68 {
    public cp8 b;
    public x72 c;
    public as5 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final yr5 a = new yr5();
    public rn6 j = new rn6(7, false);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(h26 h26Var);

    public abstract boolean c(h26 h26Var, long j, rn6 rn6Var);

    public void d(boolean z) {
        if (z) {
            this.j = new rn6(7, false);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}

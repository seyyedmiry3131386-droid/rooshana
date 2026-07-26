package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class x94 {
    public final ir5 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ bb5 d;

    public x94(bb5 bb5Var, ir5 ir5Var) {
        this.d = bb5Var;
        this.a = ir5Var;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        bb5 bb5Var = this.d;
        int i2 = bb5Var.c;
        bb5Var.c = i + i2;
        if (!bb5Var.d) {
            bb5Var.d = true;
            while (true) {
                try {
                    int i3 = bb5Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        bb5Var.e();
                    } else if (z3) {
                        bb5Var.f();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    bb5Var.d = false;
                    throw th;
                }
            }
            bb5Var.d = false;
        }
        if (this.b) {
            bb5Var.c(this);
        }
    }

    public boolean c(g64 g64Var) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}

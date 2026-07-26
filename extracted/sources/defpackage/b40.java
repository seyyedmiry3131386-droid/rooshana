package defpackage;

import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b40 implements v72 {
    public final /* synthetic */ int a;
    public final h26 b;
    public final fx7 c;

    public b40(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new h26(4);
                this.c = new fx7("image/heif", -1, -1);
                break;
            case 2:
                this.b = new h26(4);
                this.c = new fx7("image/webp", -1, -1);
                break;
            default:
                this.b = new h26(4);
                this.c = new fx7("image/avif", -1, -1);
                break;
        }
    }

    @Override // defpackage.v72
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.v72
    public final v72 b() {
        int i = this.a;
        return this;
    }

    @Override // defpackage.v72
    public final int d(w72 w72Var, sd2 sd2Var) {
        switch (this.a) {
        }
        return this.c.d(w72Var, sd2Var);
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) throws EOFException, InterruptedIOException {
        switch (this.a) {
            case 0:
                oe1 oe1Var = (oe1) w72Var;
                oe1Var.l(4, false);
                h26 h26Var = this.b;
                h26Var.G(4);
                oe1Var.e(h26Var.a, 0, 4, false);
                if (h26Var.z() == 1718909296) {
                    h26Var.G(4);
                    oe1Var.e(h26Var.a, 0, 4, false);
                    if (h26Var.z() == 1635150182) {
                    }
                }
                break;
            case 1:
                oe1 oe1Var2 = (oe1) w72Var;
                oe1Var2.l(4, false);
                h26 h26Var2 = this.b;
                h26Var2.G(4);
                oe1Var2.e(h26Var2.a, 0, 4, false);
                if (h26Var2.z() == 1718909296) {
                    h26Var2.G(4);
                    oe1Var2.e(h26Var2.a, 0, 4, false);
                    if (h26Var2.z() == 1751476579) {
                    }
                }
                break;
            default:
                h26 h26Var3 = this.b;
                h26Var3.G(4);
                oe1 oe1Var3 = (oe1) w72Var;
                oe1Var3.e(h26Var3.a, 0, 4, false);
                if (h26Var3.z() == 1380533830) {
                    oe1Var3.l(4, false);
                    h26Var3.G(4);
                    oe1Var3.e(h26Var3.a, 0, 4, false);
                    if (h26Var3.z() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.h(j, j2);
                break;
            case 1:
                this.c.h(j, j2);
                break;
            default:
                this.c.h(j, j2);
                break;
        }
    }

    @Override // defpackage.v72
    public final List i() {
        switch (this.a) {
        }
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        switch (this.a) {
            case 0:
                this.c.m(x72Var);
                break;
            case 1:
                this.c.m(x72Var);
                break;
            default:
                this.c.m(x72Var);
                break;
        }
    }

    private final void c() {
    }

    private final void e() {
    }

    private final void f() {
    }
}

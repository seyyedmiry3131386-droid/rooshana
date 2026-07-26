package defpackage;

import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hg1 implements v72 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public hg1(int i) {
        if ((i & 1) != 0) {
            this.b = new fx7("image/jpeg", 65496, 2);
        } else {
            this.b = new nu3();
        }
    }

    @Override // defpackage.v72
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((v72) this.b).a();
                break;
        }
    }

    @Override // defpackage.v72
    public final v72 b() {
        int i = this.a;
        return this;
    }

    @Override // defpackage.v72
    public final int d(w72 w72Var, sd2 sd2Var) {
        switch (this.a) {
            case 0:
                return w72Var.h(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((v72) this.b).d(w72Var, sd2Var);
        }
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((v72) this.b).g(w72Var);
        }
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((v72) this.b).h(j, j2);
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
                cp8 cp8VarO = x72Var.o(0, 3);
                x72Var.t(new x30(-9223372036854775807L));
                x72Var.l();
                b bVar = (b) this.b;
                rj2 rj2VarA = bVar.a();
                rj2VarA.m = tv4.m("text/x-unknown");
                rj2VarA.j = bVar.n;
                rm7.w(rj2VarA, cp8VarO);
                break;
            default:
                ((v72) this.b).m(x72Var);
                break;
        }
    }

    public hg1(b bVar) {
        this.b = bVar;
    }

    private final void c() {
    }

    private final void e(long j, long j2) {
    }
}

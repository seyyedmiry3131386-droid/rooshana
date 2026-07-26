package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kd0 implements v72 {
    public final /* synthetic */ int a;
    public final fx7 b;

    public kd0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new fx7("image/png", 35152, 2);
                break;
            default:
                this.b = new fx7("image/bmp", 16973, 2);
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
        return this.b.d(w72Var, sd2Var);
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        switch (this.a) {
        }
        return this.b.g(w72Var);
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        switch (this.a) {
            case 0:
                this.b.h(j, j2);
                break;
            default:
                this.b.h(j, j2);
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
                this.b.m(x72Var);
                break;
            default:
                this.b.m(x72Var);
                break;
        }
    }

    private final void c() {
    }

    private final void e() {
    }
}

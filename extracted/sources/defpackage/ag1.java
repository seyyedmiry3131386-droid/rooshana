package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class ag1 implements nm4 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public ag1(n62 n62Var, td8 td8Var) {
        this.d = n62Var;
        this.c = new i48(td8Var);
        this.a = true;
    }

    public void a(v80 v80Var) {
        nm4 nm4Var;
        nm4 nm4VarF = v80Var.f();
        if (nm4VarF == null || nm4VarF == (nm4Var = (nm4) this.f)) {
            return;
        }
        if (nm4Var != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f = nm4VarF;
        this.e = v80Var;
        ((qm4) nm4VarF).d((ua6) ((i48) this.c).e);
    }

    @Override // defpackage.nm4
    public void d(ua6 ua6Var) {
        nm4 nm4Var = (nm4) this.f;
        if (nm4Var != null) {
            nm4Var.d(ua6Var);
            ua6Var = ((nm4) this.f).g();
        }
        ((i48) this.c).d(ua6Var);
    }

    @Override // defpackage.nm4
    public ua6 g() {
        nm4 nm4Var = (nm4) this.f;
        return nm4Var != null ? nm4Var.g() : (ua6) ((i48) this.c).e;
    }

    @Override // defpackage.nm4
    public long h() {
        if (this.a) {
            return ((i48) this.c).h();
        }
        nm4 nm4Var = (nm4) this.f;
        nm4Var.getClass();
        return nm4Var.h();
    }

    @Override // defpackage.nm4
    public boolean i() {
        if (this.a) {
            ((i48) this.c).getClass();
            return false;
        }
        nm4 nm4Var = (nm4) this.f;
        nm4Var.getClass();
        return nm4Var.i();
    }

    public ag1(Context context, i59 i59Var) {
        this.c = context.getApplicationContext();
        this.d = i59Var;
        this.f = td8.a;
    }
}

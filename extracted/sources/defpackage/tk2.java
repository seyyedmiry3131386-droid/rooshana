package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import androidx.fragment.app.g;

/* JADX INFO: loaded from: classes.dex */
public final class tk2 extends y40 implements bt5, x79, xs5, qd7, hm2 {
    public final FragmentActivity s;
    public final FragmentActivity t;
    public final Handler u;
    public final wl2 v;
    public final /* synthetic */ FragmentActivity w;

    public tk2(FragmentActivity fragmentActivity) {
        this.w = fragmentActivity;
        Handler handler = new Handler();
        this.s = fragmentActivity;
        this.t = fragmentActivity;
        this.u = handler;
        this.v = new wl2();
    }

    @Override // defpackage.y40
    public final View A(int i) {
        return this.w.findViewById(i);
    }

    @Override // defpackage.y40
    public final boolean B() {
        Window window = this.w.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.g64
    public final i64 D() {
        return this.w.w;
    }

    @Override // defpackage.hm2
    public final void a(g gVar, d dVar) {
        this.w.getClass();
    }

    @Override // defpackage.xs5
    public final ws5 c() {
        return this.w.c();
    }

    @Override // defpackage.x79
    public final u79 m() {
        return this.w.m();
    }

    @Override // defpackage.qd7
    public final bn6 o() {
        return (bn6) this.w.d.c;
    }

    @Override // defpackage.bt5
    public final void v(o31 o31Var) {
        this.w.v(o31Var);
    }

    @Override // defpackage.bt5
    public final void w(o31 o31Var) {
        this.w.w(o31Var);
    }
}

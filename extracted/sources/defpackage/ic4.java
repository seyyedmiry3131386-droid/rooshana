package defpackage;

import com.google.common.cache.d;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class ic4 extends WeakReference implements c27 {
    public final int a;
    public final c27 b;
    public volatile ec4 c;

    public ic4(ReferenceQueue referenceQueue, Object obj, int i, c27 c27Var) {
        super(obj, referenceQueue);
        this.c = d.u;
        this.a = i;
        this.b = c27Var;
    }

    @Override // defpackage.c27
    public final c27 a() {
        return this.b;
    }

    @Override // defpackage.c27
    public final ec4 b() {
        return this.c;
    }

    @Override // defpackage.c27
    public final int c() {
        return this.a;
    }

    public c27 e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.c27
    public final void f(ec4 ec4Var) {
        this.c = ec4Var;
    }

    public long g() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.c27
    public final Object getKey() {
        return get();
    }

    public void h(c27 c27Var) {
        throw new UnsupportedOperationException();
    }

    public void i(c27 c27Var) {
        throw new UnsupportedOperationException();
    }

    public void j(long j) {
        throw new UnsupportedOperationException();
    }

    public void k(c27 c27Var) {
        throw new UnsupportedOperationException();
    }

    public c27 l() {
        throw new UnsupportedOperationException();
    }

    public long m() {
        throw new UnsupportedOperationException();
    }

    public void n(long j) {
        throw new UnsupportedOperationException();
    }

    public c27 o() {
        throw new UnsupportedOperationException();
    }

    public void p(c27 c27Var) {
        throw new UnsupportedOperationException();
    }

    public c27 q() {
        throw new UnsupportedOperationException();
    }
}

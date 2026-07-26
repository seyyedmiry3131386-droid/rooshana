package defpackage;

import com.google.common.util.concurrent.b;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends bt2 {
    @Override // defpackage.bt2
    public final void M(o0 o0Var, o0 o0Var2) {
        o0Var.b = o0Var2;
    }

    @Override // defpackage.bt2
    public final void N(o0 o0Var, Thread thread) {
        o0Var.a = thread;
    }

    @Override // defpackage.bt2
    public final boolean m(b bVar, d0 d0Var, d0 d0Var2) {
        synchronized (bVar) {
            try {
                if (bVar.b != d0Var) {
                    return false;
                }
                bVar.b = d0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bt2
    public final boolean n(b bVar, Object obj, Object obj2) {
        synchronized (bVar) {
            try {
                if (bVar.a != obj) {
                    return false;
                }
                bVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bt2
    public final boolean o(b bVar, o0 o0Var, o0 o0Var2) {
        synchronized (bVar) {
            try {
                if (bVar.c != o0Var) {
                    return false;
                }
                bVar.c = o0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bt2
    public final d0 v(b bVar) {
        d0 d0Var;
        d0 d0Var2 = d0.d;
        synchronized (bVar) {
            try {
                d0Var = bVar.b;
                if (d0Var != d0Var2) {
                    bVar.b = d0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d0Var;
    }

    @Override // defpackage.bt2
    public final o0 w(b bVar) {
        o0 o0Var;
        o0 o0Var2 = o0.c;
        synchronized (bVar) {
            try {
                o0Var = bVar.c;
                if (o0Var != o0Var2) {
                    bVar.c = o0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0Var;
    }
}

package defpackage;

import com.bumptech.glide.request.RequestCoordinator$RequestState;

/* JADX INFO: loaded from: classes.dex */
public final class o32 implements g57, v47 {
    public final Object a;
    public final g57 b;
    public volatile v47 c;
    public volatile v47 d;
    public RequestCoordinator$RequestState e;
    public RequestCoordinator$RequestState f;

    public o32(Object obj, g57 g57Var) {
        RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
        this.e = requestCoordinator$RequestState;
        this.f = requestCoordinator$RequestState;
        this.a = obj;
        this.b = g57Var;
    }

    @Override // defpackage.g57, defpackage.v47
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.v47
    public final void b() {
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState == requestCoordinator$RequestState2) {
                    this.e = RequestCoordinator$RequestState.PAUSED;
                    this.c.b();
                }
                if (this.f == requestCoordinator$RequestState2) {
                    this.f = RequestCoordinator$RequestState.PAUSED;
                    this.d.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v47
    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.SUCCESS;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 || this.f == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.v47
    public final void clear() {
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
                this.e = requestCoordinator$RequestState;
                this.c.clear();
                if (this.f != requestCoordinator$RequestState) {
                    this.f = requestCoordinator$RequestState;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.g57
    public final boolean d(v47 v47Var) {
        boolean z;
        RequestCoordinator$RequestState requestCoordinator$RequestState;
        synchronized (this.a) {
            g57 g57Var = this.b;
            z = false;
            if (g57Var == null || g57Var.d(this)) {
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState3 = RequestCoordinator$RequestState.FAILED;
                if (requestCoordinator$RequestState2 != requestCoordinator$RequestState3 ? v47Var.equals(this.c) : v47Var.equals(this.d) && ((requestCoordinator$RequestState = this.f) == RequestCoordinator$RequestState.SUCCESS || requestCoordinator$RequestState == requestCoordinator$RequestState3)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.g57
    public final boolean e(v47 v47Var) {
        boolean z;
        synchronized (this.a) {
            g57 g57Var = this.b;
            z = g57Var == null || g57Var.e(this);
        }
        return z;
    }

    @Override // defpackage.g57
    public final boolean f(v47 v47Var) {
        boolean z;
        synchronized (this.a) {
            g57 g57Var = this.b;
            z = (g57Var == null || g57Var.f(this)) && v47Var.equals(this.c);
        }
        return z;
    }

    @Override // defpackage.v47
    public final boolean g(v47 v47Var) {
        if (v47Var instanceof o32) {
            o32 o32Var = (o32) v47Var;
            if (this.c.g(o32Var.c) && this.d.g(o32Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g57
    public final g57 getRoot() {
        g57 root;
        synchronized (this.a) {
            try {
                g57 g57Var = this.b;
                root = g57Var != null ? g57Var.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // defpackage.g57
    public final void h(v47 v47Var) {
        synchronized (this.a) {
            try {
                if (v47Var.equals(this.c)) {
                    this.e = RequestCoordinator$RequestState.SUCCESS;
                } else if (v47Var.equals(this.d)) {
                    this.f = RequestCoordinator$RequestState.SUCCESS;
                }
                g57 g57Var = this.b;
                if (g57Var != null) {
                    g57Var.h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v47
    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.CLEARED;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 && this.f == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.v47
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 || this.f == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.g57
    public final void j(v47 v47Var) {
        synchronized (this.a) {
            try {
                if (v47Var.equals(this.d)) {
                    this.f = RequestCoordinator$RequestState.FAILED;
                    g57 g57Var = this.b;
                    if (g57Var != null) {
                        g57Var.j(this);
                    }
                    return;
                }
                this.e = RequestCoordinator$RequestState.FAILED;
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                    this.f = requestCoordinator$RequestState2;
                    this.d.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v47
    public final void k() {
        synchronized (this.a) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.e;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                    this.e = requestCoordinator$RequestState2;
                    this.c.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

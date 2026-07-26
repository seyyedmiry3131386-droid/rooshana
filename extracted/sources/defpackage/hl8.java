package defpackage;

import com.bumptech.glide.request.RequestCoordinator$RequestState;
import com.bumptech.glide.request.a;

/* JADX INFO: loaded from: classes.dex */
public final class hl8 implements g57, v47 {
    public final g57 a;
    public final Object b;
    public volatile a c;
    public volatile v47 d;
    public RequestCoordinator$RequestState e;
    public RequestCoordinator$RequestState f;
    public boolean g;

    public hl8(Object obj, g57 g57Var) {
        RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
        this.e = requestCoordinator$RequestState;
        this.f = requestCoordinator$RequestState;
        this.b = obj;
        this.a = g57Var;
    }

    @Override // defpackage.g57, defpackage.v47
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.v47
    public final void b() {
        synchronized (this.b) {
            try {
                if (!this.f.a) {
                    this.f = RequestCoordinator$RequestState.PAUSED;
                    this.d.b();
                }
                if (!this.e.a) {
                    this.e = RequestCoordinator$RequestState.PAUSED;
                    this.c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v47
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator$RequestState.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.v47
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
            this.e = requestCoordinator$RequestState;
            this.f = requestCoordinator$RequestState;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.g57
    public final boolean d(v47 v47Var) {
        boolean z;
        synchronized (this.b) {
            try {
                g57 g57Var = this.a;
                z = (g57Var == null || g57Var.d(this)) && v47Var.equals(this.c) && !a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.g57
    public final boolean e(v47 v47Var) {
        boolean z;
        synchronized (this.b) {
            try {
                g57 g57Var = this.a;
                z = (g57Var == null || g57Var.e(this)) && (v47Var.equals(this.c) || this.e != RequestCoordinator$RequestState.SUCCESS);
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.g57
    public final boolean f(v47 v47Var) {
        boolean z;
        synchronized (this.b) {
            try {
                g57 g57Var = this.a;
                z = (g57Var == null || g57Var.f(this)) && v47Var.equals(this.c) && this.e != RequestCoordinator$RequestState.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.v47
    public final boolean g(v47 v47Var) {
        if (!(v47Var instanceof hl8)) {
            return false;
        }
        hl8 hl8Var = (hl8) v47Var;
        if (this.c == null) {
            if (hl8Var.c != null) {
                return false;
            }
        } else if (!this.c.g(hl8Var.c)) {
            return false;
        }
        return this.d == null ? hl8Var.d == null : this.d.g(hl8Var.d);
    }

    @Override // defpackage.g57
    public final g57 getRoot() {
        g57 root;
        synchronized (this.b) {
            try {
                g57 g57Var = this.a;
                root = g57Var != null ? g57Var.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // defpackage.g57
    public final void h(v47 v47Var) {
        synchronized (this.b) {
            try {
                if (v47Var.equals(this.d)) {
                    this.f = RequestCoordinator$RequestState.SUCCESS;
                    return;
                }
                this.e = RequestCoordinator$RequestState.SUCCESS;
                g57 g57Var = this.a;
                if (g57Var != null) {
                    g57Var.h(this);
                }
                if (!this.f.a) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v47
    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator$RequestState.CLEARED;
        }
        return z;
    }

    @Override // defpackage.v47
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator$RequestState.RUNNING;
        }
        return z;
    }

    @Override // defpackage.g57
    public final void j(v47 v47Var) {
        synchronized (this.b) {
            try {
                if (!v47Var.equals(this.c)) {
                    this.f = RequestCoordinator$RequestState.FAILED;
                    return;
                }
                this.e = RequestCoordinator$RequestState.FAILED;
                g57 g57Var = this.a;
                if (g57Var != null) {
                    g57Var.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v47
    public final void k() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != RequestCoordinator$RequestState.SUCCESS) {
                        RequestCoordinator$RequestState requestCoordinator$RequestState = this.f;
                        RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                        if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                            this.f = requestCoordinator$RequestState2;
                            this.d.k();
                        }
                    }
                    if (this.g) {
                        RequestCoordinator$RequestState requestCoordinator$RequestState3 = this.e;
                        RequestCoordinator$RequestState requestCoordinator$RequestState4 = RequestCoordinator$RequestState.RUNNING;
                        if (requestCoordinator$RequestState3 != requestCoordinator$RequestState4) {
                            this.e = requestCoordinator$RequestState4;
                            this.c.k();
                        }
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

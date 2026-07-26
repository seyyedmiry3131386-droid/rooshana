package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class oi9 extends ci9 {
    public final cf8 b;
    public final /* synthetic */ int c;
    public final Object d;

    public oi9(int i, cf8 cf8Var) {
        super(i);
        this.b = cf8Var;
    }

    @Override // defpackage.ri9
    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    @Override // defpackage.ri9
    public final void b(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.ri9
    public final /* bridge */ /* synthetic */ void c(rn6 rn6Var, boolean z) {
        int i = this.c;
    }

    @Override // defpackage.ri9
    public final void d(wh9 wh9Var) throws DeadObjectException {
        try {
            k(wh9Var);
        } catch (DeadObjectException e) {
            a(ri9.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(ri9.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    @Override // defpackage.ci9
    public final Feature[] f(wh9 wh9Var) {
        switch (this.c) {
            case 0:
                break;
            default:
                break;
        }
        return null;
    }

    @Override // defpackage.ci9
    public final boolean g(wh9 wh9Var) {
        switch (this.c) {
            case 0:
                return ((gi9) this.d).a.c;
            default:
                gi9 gi9Var = (gi9) wh9Var.s.get((o94) this.d);
                return gi9Var != null && gi9Var.a.c;
        }
    }

    @Override // defpackage.ci9
    public final int h(wh9 wh9Var) {
        switch (this.c) {
            case 0:
                return ((gi9) this.d).a.b;
            default:
                gi9 gi9Var = (gi9) wh9Var.s.get((o94) this.d);
                if (gi9Var != null) {
                    return gi9Var.a.b;
                }
                return -1;
        }
    }

    public final void k(wh9 wh9Var) {
        switch (this.c) {
            case 0:
                gi9 gi9Var = (gi9) this.d;
                cf0 cf0Var = gi9Var.a;
                ((q37) ((jx9) cf0Var.e).b).accept(wh9Var.o, this.b);
                o94 o94Var = (o94) ((x41) cf0Var.d).b;
                if (o94Var != null) {
                    wh9Var.s.put(o94Var, gi9Var);
                }
                break;
            default:
                gi9 gi9Var2 = (gi9) wh9Var.s.remove((o94) this.d);
                if (gi9Var2 == null) {
                    this.b.d(Boolean.FALSE);
                } else {
                    ((q37) ((jx9) gi9Var2.b.c).c).accept(wh9Var.o, this.b);
                    ((x41) gi9Var2.a.d).b = null;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oi9(o94 o94Var, cf8 cf8Var) {
        this(4, cf8Var);
        this.c = 1;
        this.d = o94Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oi9(gi9 gi9Var, cf8 cf8Var) {
        this(3, cf8Var);
        this.c = 0;
        this.d = gi9Var;
    }

    private final /* bridge */ /* synthetic */ void i(rn6 rn6Var, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(rn6 rn6Var, boolean z) {
    }
}

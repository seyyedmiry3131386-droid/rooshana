package defpackage;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import androidx.compose.ui.node.m;
import androidx.compose.ui.node.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class gx4 implements ri1 {
    public e51 b;
    public int c;
    public gx4 e;
    public gx4 f;
    public o g;
    public m h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public bp2 m;
    public boolean n;
    public gx4 a = this;
    public int d = -1;

    public void A0(gx4 gx4Var) {
        this.a = gx4Var;
    }

    public void B0(m mVar) {
        this.h = mVar;
    }

    public final e71 o0() {
        e51 e51Var = this.b;
        if (e51Var != null) {
            return e51Var;
        }
        e51 e51VarA = js3.a(y40.I(this).getCoroutineContext().l0(new xt3((wt3) y40.I(this).getCoroutineContext().r0(th0.n))));
        this.b = e51VarA;
        return e51VarA;
    }

    public boolean p0() {
        return !(this instanceof z40);
    }

    public void q0() {
        if (this.n) {
            rn3.b("node attached multiple times");
        }
        if (this.h == null) {
            rn3.b("attach invoked on a node without a coordinator");
        }
        this.n = true;
        this.k = true;
    }

    public void r0() {
        if (!this.n) {
            rn3.b("Cannot detach a node that is not attached");
        }
        if (this.k) {
            rn3.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.l) {
            rn3.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.n = false;
        e51 e51Var = this.b;
        if (e51Var != null) {
            js3.j(e51Var, new ModifierNodeDetachedCancellationException());
            this.b = null;
        }
    }

    public /* synthetic */ void t0() {
    }

    public /* synthetic */ void v0() {
    }

    public void x0() {
        if (!this.n) {
            rn3.b("reset() called on an unattached node");
        }
        w0();
    }

    public void y0() {
        if (!this.n) {
            rn3.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.k) {
            rn3.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.k = false;
        s0();
        this.l = true;
    }

    public void z0() {
        if (!this.n) {
            rn3.b("node detached multiple times");
        }
        if (this.h == null) {
            rn3.b("detach invoked on a node without a coordinator");
        }
        if (!this.l) {
            rn3.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.l = false;
        bp2 bp2Var = this.m;
        if (bp2Var != null) {
            bp2Var.invoke();
        }
        u0();
    }

    public void s0() {
    }

    public void u0() {
    }

    public void w0() {
    }
}

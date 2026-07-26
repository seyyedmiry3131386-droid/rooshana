package defpackage;

import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class km9 {
    public final o77 a;
    public o77 b;
    public final sk6 c;
    public final bn6 d;

    public km9() {
        o77 o77Var = new o77(15);
        this.a = o77Var;
        this.b = ((o77) o77Var.b).K();
        this.c = new sk6(22, (byte) 0);
        this.d = new bn6(27);
        final int i = 1;
        Callable callable = new Callable(this) { // from class: uj9
            public final /* synthetic */ km9 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i) {
                    case 0:
                        return new lr9(this.b.c);
                    default:
                        return new lr9(this.b.d);
                }
            }
        };
        hl5 hl5Var = (hl5) o77Var.d;
        ((HashMap) hl5Var.b).put("internal.registerCallback", callable);
        final int i2 = 0;
        ((HashMap) hl5Var.b).put("internal.eventLogger", new Callable(this) { // from class: uj9
            public final /* synthetic */ km9 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i2) {
                    case 0:
                        return new lr9(this.b.c);
                    default:
                        return new lr9(this.b.d);
                }
            }
        });
    }

    public final boolean a(xj9 xj9Var) throws zzd {
        sk6 sk6Var = this.c;
        try {
            sk6Var.b = xj9Var;
            sk6Var.c = xj9Var.clone();
            ((ArrayList) sk6Var.d).clear();
            ((o77) this.a.c).M("runtime.counter", new nk9(Double.valueOf(0.0d)));
            this.d.y(this.b.K(), sk6Var);
            if (((xj9) sk6Var.c).equals((xj9) sk6Var.b)) {
                return !((ArrayList) sk6Var.d).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final void b(m0 m0Var) throws zzd {
        pk9 pk9Var;
        try {
            o77 o77Var = this.a;
            this.b = ((o77) o77Var.b).K();
            if (o77Var.H(this.b, (n0[]) m0Var.p().toArray(new n0[0])) instanceof mk9) {
                throw new IllegalStateException("Program loading failed");
            }
            for (l0 l0Var : m0Var.q().p()) {
                List listQ = l0Var.q();
                String strP = l0Var.p();
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    xk9 xk9VarH = o77Var.H(this.b, (n0) it.next());
                    if (!(xk9VarH instanceof tk9)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    o77 o77Var2 = this.b;
                    if (o77Var2.L(strP)) {
                        xk9 xk9VarO = o77Var2.O(strP);
                        if (!(xk9VarO instanceof pk9)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strP)));
                        }
                        pk9Var = (pk9) xk9VarO;
                    } else {
                        pk9Var = null;
                    }
                    if (pk9Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strP)));
                    }
                    pk9Var.b(this.b, Collections.singletonList(xk9VarH));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}

package defpackage;

import java.util.HashMap;
import org.koin.core.error.MissingScopeValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class pf7 extends zp3 {
    public final boolean b;
    public final HashMap c;

    public pf7(va0 va0Var) {
        super(va0Var);
        this.b = true;
        this.c = new HashMap();
    }

    @Override // defpackage.zp3
    public final Object b(ry0 ry0Var) throws MissingScopeValueException {
        if (!js3.i(((lf7) ry0Var.b).a, this.a.a) && !js3.i((yu8) ry0Var.g, this.a.a)) {
            throw new IllegalStateException(("Wrong Scope qualifier: trying to open instance for " + ((lf7) ry0Var.b).b + " in " + this.a).toString());
        }
        synchronized (this) {
            HashMap map = this.c;
            lf7 lf7Var = (lf7) ry0Var.b;
            if (map.get(lf7Var != null ? lf7Var.b : null) == null && this.b) {
                this.c.put(((lf7) ry0Var.b).b, a(ry0Var));
            }
        }
        Object obj = this.c.get(((lf7) ry0Var.b).b);
        if (obj != null) {
            return obj;
        }
        String str = "Factory.get -Scoped instance not found for " + ((lf7) ry0Var.b).b + " in " + this.a;
        js3.p(str, "msg");
        throw new MissingScopeValueException(str);
    }
}

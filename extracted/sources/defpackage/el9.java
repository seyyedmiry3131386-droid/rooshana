package defpackage;

import com.google.android.gms.internal.measurement.zzbk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class el9 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public el9(int i) {
        this.b = i;
    }

    public static vk9 c(o77 o77Var, List list) {
        zzbk zzbkVar = zzbk.ADD;
        c67.p(2, "FN", list);
        xk9 xk9VarD = ((rn6) o77Var.b).D(o77Var, (xk9) list.get(0));
        xk9 xk9VarD2 = ((rn6) o77Var.b).D(o77Var, (xk9) list.get(1));
        if (!(xk9VarD2 instanceof gk9)) {
            throw new IllegalArgumentException(dw1.n("FN requires an ArrayValue of parameter names found ", xk9VarD2.getClass().getCanonicalName()));
        }
        List listH = ((gk9) xk9VarD2).h();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new vk9(xk9VarD.l(), (ArrayList) listH, arrayList, o77Var);
    }

    public static boolean d(xk9 xk9Var, xk9 xk9Var2) {
        if (xk9Var instanceof rk9) {
            xk9Var = new cl9(xk9Var.l());
        }
        if (xk9Var2 instanceof rk9) {
            xk9Var2 = new cl9(xk9Var2.l());
        }
        if ((xk9Var instanceof cl9) && (xk9Var2 instanceof cl9)) {
            return ((cl9) xk9Var).a.compareTo(((cl9) xk9Var2).a) < 0;
        }
        double dDoubleValue = xk9Var.i().doubleValue();
        double dDoubleValue2 = xk9Var2.i().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static xk9 e(tl9 tl9Var, xk9 xk9Var, xk9 xk9Var2) {
        if (xk9Var instanceof Iterable) {
            return g(tl9Var, ((Iterable) xk9Var).iterator(), xk9Var2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(xk9 xk9Var, xk9 xk9Var2) {
        if (xk9Var.getClass().equals(xk9Var2.getClass())) {
            if ((xk9Var instanceof dl9) || (xk9Var instanceof uk9)) {
                return true;
            }
            return xk9Var instanceof nk9 ? (Double.isNaN(xk9Var.i().doubleValue()) || Double.isNaN(xk9Var2.i().doubleValue()) || xk9Var.i().doubleValue() != xk9Var2.i().doubleValue()) ? false : true : xk9Var instanceof cl9 ? xk9Var.l().equals(xk9Var2.l()) : xk9Var instanceof kk9 ? xk9Var.c().equals(xk9Var2.c()) : xk9Var == xk9Var2;
        }
        if (((xk9Var instanceof dl9) || (xk9Var instanceof uk9)) && ((xk9Var2 instanceof dl9) || (xk9Var2 instanceof uk9))) {
            return true;
        }
        boolean z = xk9Var instanceof nk9;
        if (z && (xk9Var2 instanceof cl9)) {
            return f(xk9Var, new nk9(xk9Var2.i()));
        }
        boolean z2 = xk9Var instanceof cl9;
        if (z2 && (xk9Var2 instanceof nk9)) {
            return f(new nk9(xk9Var.i()), xk9Var2);
        }
        if (xk9Var instanceof kk9) {
            return f(new nk9(xk9Var.i()), xk9Var2);
        }
        if (xk9Var2 instanceof kk9) {
            return f(xk9Var, new nk9(xk9Var2.i()));
        }
        if ((z2 || z) && (xk9Var2 instanceof rk9)) {
            return f(xk9Var, new cl9(xk9Var2.l()));
        }
        if ((xk9Var instanceof rk9) && ((xk9Var2 instanceof cl9) || (xk9Var2 instanceof nk9))) {
            return f(new cl9(xk9Var.l()), xk9Var2);
        }
        return false;
    }

    public static xk9 g(tl9 tl9Var, Iterator it, xk9 xk9Var) {
        if (it != null) {
            while (it.hasNext()) {
                xk9 xk9VarJ = tl9Var.b((xk9) it.next()).J((gk9) xk9Var);
                if (xk9VarJ instanceof mk9) {
                    mk9 mk9Var = (mk9) xk9VarJ;
                    String str = mk9Var.b;
                    if ("break".equals(str)) {
                        return xk9.p0;
                    }
                    if ("return".equals(str)) {
                        return mk9Var;
                    }
                }
            }
        }
        return xk9.p0;
    }

    public static boolean h(xk9 xk9Var, xk9 xk9Var2) {
        if (xk9Var instanceof rk9) {
            xk9Var = new cl9(xk9Var.l());
        }
        if (xk9Var2 instanceof rk9) {
            xk9Var2 = new cl9(xk9Var2.l());
        }
        return (((xk9Var instanceof cl9) && (xk9Var2 instanceof cl9)) || !(Double.isNaN(xk9Var.i().doubleValue()) || Double.isNaN(xk9Var2.i().doubleValue()))) && !d(xk9Var2, xk9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:505:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xk9 a(java.lang.String r12, defpackage.o77 r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instruction units count: 3856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el9.a(java.lang.String, o77, java.util.ArrayList):xk9");
    }

    public final void b(String str) {
        if (!this.a.contains(c67.s(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}

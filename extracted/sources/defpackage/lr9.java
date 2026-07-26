package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class lr9 extends pk9 {
    public final /* synthetic */ int c = 4;
    public final Object d;

    public lr9(sk6 sk6Var) {
        super("internal.eventLogger");
        this.d = sk6Var;
    }

    @Override // defpackage.pk9
    public final xk9 b(o77 o77Var, List list) {
        TreeMap treeMap;
        switch (this.c) {
            case 0:
                c67.o(3, this.a, list);
                String strL = ((rn6) o77Var.b).D(o77Var, (xk9) list.get(0)).l();
                xk9 xk9Var = (xk9) list.get(1);
                rn6 rn6Var = (rn6) o77Var.b;
                long jV = (long) c67.v(rn6Var.D(o77Var, xk9Var).i().doubleValue());
                xk9 xk9VarD = rn6Var.D(o77Var, (xk9) list.get(2));
                HashMap mapX = xk9VarD instanceof tk9 ? c67.x((tk9) xk9VarD) : new HashMap();
                sk6 sk6Var = (sk6) this.d;
                sk6Var.getClass();
                HashMap map = new HashMap();
                for (String str : mapX.keySet()) {
                    HashMap map2 = ((xj9) sk6Var.b).c;
                    map.put(str, xj9.b(str, map2.containsKey(str) ? map2.get(str) : null, mapX.get(str)));
                }
                ((ArrayList) sk6Var.d).add(new xj9(strL, jV, map));
                return xk9.p0;
            case 1:
                c67.o(2, "getValue", list);
                xk9 xk9VarI = o77Var.I((xk9) list.get(0));
                xk9 xk9VarI2 = o77Var.I((xk9) list.get(1));
                String strZza = ((kt9) this.d).zza(xk9VarI.l());
                return strZza != null ? new cl9(strZza) : xk9VarI2;
            case 2:
                return xk9.p0;
            case 3:
                try {
                    return a77.t(((Callable) this.d).call());
                } catch (Exception unused) {
                    return xk9.p0;
                }
            default:
                c67.o(3, this.a, list);
                ((rn6) o77Var.b).D(o77Var, (xk9) list.get(0)).l();
                xk9 xk9Var2 = (xk9) list.get(1);
                rn6 rn6Var2 = (rn6) o77Var.b;
                xk9 xk9VarD2 = rn6Var2.D(o77Var, xk9Var2);
                if (!(xk9VarD2 instanceof vk9)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                xk9 xk9VarD3 = rn6Var2.D(o77Var, (xk9) list.get(2));
                if (!(xk9VarD3 instanceof tk9)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                tk9 tk9Var = (tk9) xk9VarD3;
                HashMap map3 = tk9Var.a;
                if (!map3.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strL2 = tk9Var.d("type").l();
                int iU = map3.containsKey("priority") ? c67.u(tk9Var.d("priority").i().doubleValue()) : 1000;
                bn6 bn6Var = (bn6) this.d;
                vk9 vk9Var = (vk9) xk9VarD2;
                bn6Var.getClass();
                if ("create".equals(strL2)) {
                    treeMap = (TreeMap) bn6Var.c;
                } else {
                    if (!"edit".equals(strL2)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strL2)));
                    }
                    treeMap = (TreeMap) bn6Var.b;
                }
                if (treeMap.containsKey(Integer.valueOf(iU))) {
                    iU = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iU), vk9Var);
                return xk9.p0;
        }
    }

    public lr9(bn6 bn6Var) {
        super("internal.registerCallback");
        this.d = bn6Var;
    }

    public lr9(Callable callable) {
        super("internal.appMetadata");
        this.d = callable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr9(ws9 ws9Var, kt9 kt9Var) {
        super("getValue");
        this.d = kt9Var;
    }

    public lr9(jw9 jw9Var) {
        super("internal.logger");
        this.d = jw9Var;
        this.b.put("log", new fx9(this, false, true));
        this.b.put("silent", new ws9("silent", 1));
        ((pk9) this.b.get("silent")).e("log", new fx9(this, true, true));
        this.b.put("unmonitored", new ws9("unmonitored", 2));
        ((pk9) this.b.get("unmonitored")).e("log", new fx9(this, false, false));
    }
}

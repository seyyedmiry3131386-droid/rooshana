package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zr9 extends tk9 {
    public final sk6 b;

    public zr9(sk6 sk6Var) {
        this.b = sk6Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.tk9, defpackage.xk9
    public final xk9 j(String str, o77 o77Var, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        sk6 sk6Var = this.b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c67.o(0, "getEventName", arrayList);
                    return new cl9(((xj9) sk6Var.c).a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c67.o(0, "getTimestamp", arrayList);
                    return new nk9(Double.valueOf(((xj9) sk6Var.c).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c67.o(1, "getParamValue", arrayList);
                    String strL = ((rn6) o77Var.b).D(o77Var, (xk9) arrayList.get(0)).l();
                    HashMap map = ((xj9) sk6Var.c).c;
                    return a77.t(map.containsKey(strL) ? map.get(strL) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c67.o(0, "getParams", arrayList);
                    HashMap map2 = ((xj9) sk6Var.c).c;
                    tk9 tk9Var = new tk9();
                    for (String str2 : map2.keySet()) {
                        tk9Var.e(str2, a77.t(map2.get(str2)));
                    }
                    return tk9Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c67.o(2, "setParamValue", arrayList);
                    String strL2 = ((rn6) o77Var.b).D(o77Var, (xk9) arrayList.get(0)).l();
                    xk9 xk9VarD = ((rn6) o77Var.b).D(o77Var, (xk9) arrayList.get(1));
                    xj9 xj9Var = (xj9) sk6Var.c;
                    Object objW = c67.w(xk9VarD);
                    HashMap map3 = xj9Var.c;
                    if (objW == null) {
                        map3.remove(strL2);
                        return xk9VarD;
                    }
                    map3.put(strL2, xj9.b(strL2, map3.get(strL2), objW));
                    return xk9VarD;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c67.o(1, "setEventName", arrayList);
                    xk9 xk9VarD2 = ((rn6) o77Var.b).D(o77Var, (xk9) arrayList.get(0));
                    if (xk9.p0.equals(xk9VarD2) || xk9.q0.equals(xk9VarD2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((xj9) sk6Var.c).a = xk9VarD2.l();
                    return new cl9(xk9VarD2.l());
                }
                break;
        }
        return super.j(str, o77Var, arrayList);
    }
}

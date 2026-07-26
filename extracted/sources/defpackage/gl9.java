package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class gl9 implements Comparator {
    public final /* synthetic */ pk9 a;
    public final /* synthetic */ o77 b;

    public gl9(pk9 pk9Var, o77 o77Var) {
        this.a = pk9Var;
        this.b = o77Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        xk9 xk9Var = (xk9) obj;
        xk9 xk9Var2 = (xk9) obj2;
        if (xk9Var instanceof dl9) {
            return !(xk9Var2 instanceof dl9) ? 1 : 0;
        }
        if (xk9Var2 instanceof dl9) {
            return -1;
        }
        pk9 pk9Var = this.a;
        return pk9Var == null ? xk9Var.l().compareTo(xk9Var2.l()) : (int) c67.v(pk9Var.b(this.b, Arrays.asList(xk9Var, xk9Var2)).i().doubleValue());
    }
}

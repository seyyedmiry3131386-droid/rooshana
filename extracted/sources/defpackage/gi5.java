package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class gi5 {
    public final ei5 a;
    public final wi5 b;
    public final Bundle c;
    public Lifecycle$State d;
    public final oi5 e;
    public final String f;
    public final Bundle g;
    public final rn6 h;
    public boolean i;
    public final i64 j;
    public Lifecycle$State k;
    public final rd7 l;
    public final c24 m;

    public gi5(ei5 ei5Var) {
        this.a = ei5Var;
        this.b = ei5Var.b;
        this.c = ei5Var.c;
        this.d = ei5Var.d;
        this.e = ei5Var.e;
        this.f = ei5Var.f;
        this.g = ei5Var.g;
        this.h = new rn6(new bp4(ei5Var, new o06(17, ei5Var)));
        c24 c24VarA = a.a(new ob4(27));
        this.j = new i64(ei5Var, true);
        this.k = Lifecycle$State.b;
        this.l = (rd7) c24VarA.getValue();
        this.m = a.a(new ob4(28));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        b.I();
        Bundle bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        bundleG.putAll(bundle);
        return bundleG;
    }

    public final void b() {
        if (!this.i) {
            rn6 rn6Var = this.h;
            rn6Var.u();
            this.i = true;
            if (this.e != null) {
                rq4.u(this.a);
            }
            rn6Var.v(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.k.ordinal();
        i64 i64Var = this.j;
        if (iOrdinal < iOrdinal2) {
            i64Var.g(this.d);
        } else {
            i64Var.g(this.k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(g27.a(ei5.class).d());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}

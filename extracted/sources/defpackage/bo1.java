package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class bo1 implements ee7 {
    public final Object a;
    public final dj5 b;
    public final List c;
    public final List d;
    public final zn1 e;
    public final bp2 f;
    public final List g;
    public final a h = new a(-1734138355, new ao1(this, 0), true);

    public bo1(Object obj, dj5 dj5Var, List list, List list2, zn1 zn1Var, bp2 bp2Var) {
        this.a = obj;
        this.b = dj5Var;
        this.c = list;
        this.d = list2;
        this.e = zn1Var;
        this.f = bp2Var;
        this.g = br9.B(dj5Var);
    }

    @Override // defpackage.ee7
    public final List a() {
        return this.c;
    }

    @Override // defpackage.ee7
    public final a b() {
        return this.h;
    }

    @Override // defpackage.ee7
    public final List c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bo1.class == obj.getClass()) {
            bo1 bo1Var = (bo1) obj;
            if (js3.i(this.a, bo1Var.a) && js3.i(this.c, bo1Var.c) && js3.i(this.d, bo1Var.d) && js3.i(this.b, bo1Var.b) && js3.i(this.e, bo1Var.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ee7
    public final Object getKey() {
        return this.a;
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + (this.b.hashCode() * 31) + (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.ee7
    public final Map j() {
        Map map;
        dj5 dj5Var = (dj5) kotlin.collections.a.v0(c());
        return (dj5Var == null || (map = dj5Var.c) == null) ? b.I() : map;
    }

    public final String toString() {
        return "DialogScene(key=" + this.a + ", entry=" + this.b + ", previousEntries=" + this.c + ", overlaidEntries=" + this.d + ", dialogProperties=" + this.e + ')';
    }
}

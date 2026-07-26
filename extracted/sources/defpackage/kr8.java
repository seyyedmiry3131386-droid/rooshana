package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class kr8 {
    public final j82 a;
    public final uy7 b;
    public final wo0 c;
    public final zd7 d;
    public final boolean e;
    public final Map f;

    public kr8(j82 j82Var, uy7 uy7Var, wo0 wo0Var, zd7 zd7Var, boolean z, Map map) {
        this.a = j82Var;
        this.b = uy7Var;
        this.c = wo0Var;
        this.d = zd7Var;
        this.e = z;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr8)) {
            return false;
        }
        kr8 kr8Var = (kr8) obj;
        return js3.i(this.a, kr8Var.a) && js3.i(this.b, kr8Var.b) && js3.i(this.c, kr8Var.c) && js3.i(this.d, kr8Var.d) && this.e == kr8Var.e && js3.i(this.f, kr8Var.f);
    }

    public final int hashCode() {
        j82 j82Var = this.a;
        int iHashCode = (j82Var == null ? 0 : j82Var.hashCode()) * 31;
        uy7 uy7Var = this.b;
        int iHashCode2 = (iHashCode + (uy7Var == null ? 0 : uy7Var.hashCode())) * 31;
        wo0 wo0Var = this.c;
        int iHashCode3 = (iHashCode2 + (wo0Var == null ? 0 : wo0Var.hashCode())) * 31;
        zd7 zd7Var = this.d;
        return this.f.hashCode() + ((((iHashCode3 + (zd7Var != null ? zd7Var.hashCode() : 0)) * 961) + (this.e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public /* synthetic */ kr8(j82 j82Var, uy7 uy7Var, wo0 wo0Var, zd7 zd7Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : j82Var, (i & 2) != 0 ? null : uy7Var, (i & 4) != 0 ? null : wo0Var, (i & 8) != 0 ? null : zd7Var, (i & 32) == 0, (i & 64) != 0 ? b.I() : linkedHashMap);
    }
}

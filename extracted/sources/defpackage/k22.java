package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class k22 {
    public static final k22 b = new k22(new kr8((j82) null, (uy7) null, (wo0) null, (zd7) null, (LinkedHashMap) null, 127));
    public final kr8 a;

    public k22(kr8 kr8Var) {
        this.a = kr8Var;
    }

    public final k22 a(k22 k22Var) {
        kr8 kr8Var = k22Var.a;
        j82 j82Var = kr8Var.a;
        kr8 kr8Var2 = this.a;
        if (j82Var == null) {
            j82Var = kr8Var2.a;
        }
        uy7 uy7Var = kr8Var.b;
        if (uy7Var == null) {
            uy7Var = kr8Var2.b;
        }
        wo0 wo0Var = kr8Var.c;
        if (wo0Var == null) {
            wo0Var = kr8Var2.c;
        }
        zd7 zd7Var = kr8Var.d;
        if (zd7Var == null) {
            zd7Var = kr8Var2.d;
        }
        return new k22(new kr8(j82Var, uy7Var, wo0Var, zd7Var, b.P(kr8Var2.f, kr8Var.f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k22) && js3.i(((k22) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        kr8 kr8Var = this.a;
        j82 j82Var = kr8Var.a;
        sb.append(j82Var != null ? j82Var.toString() : null);
        sb.append(",\nSlide - ");
        uy7 uy7Var = kr8Var.b;
        sb.append(uy7Var != null ? uy7Var.toString() : null);
        sb.append(",\nShrink - ");
        wo0 wo0Var = kr8Var.c;
        sb.append(wo0Var != null ? wo0Var.toString() : null);
        sb.append(",\nScale - ");
        zd7 zd7Var = kr8Var.d;
        sb.append(zd7Var != null ? zd7Var.toString() : null);
        return sb.toString();
    }
}

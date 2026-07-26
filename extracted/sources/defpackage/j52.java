package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class j52 {
    public static final j52 b;
    public static final j52 c;
    public final kr8 a;

    static {
        LinkedHashMap linkedHashMap = null;
        j82 j82Var = null;
        uy7 uy7Var = null;
        wo0 wo0Var = null;
        zd7 zd7Var = null;
        b = new j52(new kr8(j82Var, uy7Var, wo0Var, zd7Var, linkedHashMap, 127));
        c = new j52(new kr8(j82Var, uy7Var, wo0Var, zd7Var, linkedHashMap, 95));
    }

    public j52(kr8 kr8Var) {
        this.a = kr8Var;
    }

    public final j52 a(j52 j52Var) {
        kr8 kr8Var = j52Var.a;
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
        return new j52(new kr8(j82Var, uy7Var, wo0Var, zd7Var, kr8Var.e || kr8Var2.e, b.P(kr8Var2.f, kr8Var.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j52) && js3.i(((j52) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(kr8Var.e);
        return sb.toString();
    }
}

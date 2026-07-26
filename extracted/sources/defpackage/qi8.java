package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qi8 {
    public final ll a;
    public final gj8 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final qj1 g;
    public final LayoutDirection h;
    public final oh2 i;
    public final long j;

    public qi8(ll llVar, gj8 gj8Var, List list, int i, boolean z, int i2, qj1 qj1Var, LayoutDirection layoutDirection, oh2 oh2Var, long j) {
        this.a = llVar;
        this.b = gj8Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = qj1Var;
        this.h = layoutDirection;
        this.i = oh2Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi8)) {
            return false;
        }
        qi8 qi8Var = (qi8) obj;
        return js3.i(this.a, qi8Var.a) && js3.i(this.b, qi8Var.b) && js3.i(this.c, qi8Var.c) && this.d == qi8Var.d && this.e == qi8Var.e && this.f == qi8Var.f && js3.i(this.g, qi8Var.g) && this.h == qi8Var.h && js3.i(this.i, qi8Var.i) && h31.b(this.j, qi8Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((((((rm7.i(rm7.h(this.a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31)) * 31)) * 31)) * 31;
        long j = this.j;
        return ((int) ((j >>> 32) ^ j)) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) h31.l(this.j));
        sb.append(')');
        return sb.toString();
    }
}

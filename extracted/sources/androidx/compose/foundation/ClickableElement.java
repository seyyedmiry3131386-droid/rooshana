package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.bp2;
import defpackage.ct0;
import defpackage.gx4;
import defpackage.js3;
import defpackage.mx4;
import defpackage.um3;
import defpackage.v97;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends mx4 {
    public final ab5 b;
    public final um3 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final v97 g;
    public final bp2 h;

    public ClickableElement(ab5 ab5Var, um3 um3Var, boolean z, boolean z2, String str, v97 v97Var, bp2 bp2Var) {
        this.b = ab5Var;
        this.c = um3Var;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = v97Var;
        this.h = bp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return js3.i(this.b, clickableElement.b) && js3.i(this.c, clickableElement.c) && this.d == clickableElement.d && this.e == clickableElement.e && js3.i(this.f, clickableElement.f) && js3.i(this.g, clickableElement.g) && this.h == clickableElement.h;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new ct0(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final int hashCode() {
        ab5 ab5Var = this.b;
        int iHashCode = (ab5Var != null ? ab5Var.hashCode() : 0) * 31;
        um3 um3Var = this.c;
        int iHashCode2 = (((((iHashCode + (um3Var != null ? um3Var.hashCode() : 0)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        v97 v97Var = this.g;
        return this.h.hashCode() + ((iHashCode3 + (v97Var != null ? v97Var.a : 0)) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((ct0) gx4Var).Q0(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}

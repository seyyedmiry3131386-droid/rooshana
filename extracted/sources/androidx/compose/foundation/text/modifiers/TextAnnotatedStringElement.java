package androidx.compose.foundation.text.modifiers;

import defpackage.dp2;
import defpackage.gj8;
import defpackage.gx4;
import defpackage.iv0;
import defpackage.js3;
import defpackage.ll;
import defpackage.mx4;
import defpackage.oh2;
import defpackage.rm7;
import defpackage.tf8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringElement extends mx4 {
    public final ll b;
    public final gj8 c;
    private final iv0 color;
    public final oh2 d;
    public final dp2 e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List j;
    public final dp2 k;
    public final dp2 l;

    public TextAnnotatedStringElement(ll llVar, gj8 gj8Var, oh2 oh2Var, dp2 dp2Var, int i, boolean z, int i2, int i3, List list, dp2 dp2Var2, iv0 iv0Var, dp2 dp2Var3) {
        this.b = llVar;
        this.c = gj8Var;
        this.d = oh2Var;
        this.e = dp2Var;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = dp2Var2;
        this.color = iv0Var;
        this.l = dp2Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return js3.i(this.color, textAnnotatedStringElement.color) && js3.i(this.b, textAnnotatedStringElement.b) && js3.i(this.c, textAnnotatedStringElement.c) && js3.i(this.j, textAnnotatedStringElement.j) && js3.i(this.d, textAnnotatedStringElement.d) && this.e == textAnnotatedStringElement.e && this.l == textAnnotatedStringElement.l && this.f == textAnnotatedStringElement.f && this.g == textAnnotatedStringElement.g && this.h == textAnnotatedStringElement.h && this.i == textAnnotatedStringElement.i && this.k == textAnnotatedStringElement.k;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        iv0 iv0Var = this.color;
        tf8 tf8Var = new tf8();
        tf8Var.o = this.b;
        tf8Var.p = this.c;
        tf8Var.q = this.d;
        tf8Var.r = this.e;
        tf8Var.s = this.f;
        tf8Var.t = this.g;
        tf8Var.u = this.h;
        tf8Var.v = this.i;
        tf8Var.w = this.j;
        tf8Var.x = this.k;
        tf8Var.y = iv0Var;
        tf8Var.z = this.l;
        return tf8Var;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + rm7.h(this.b.hashCode() * 31, 31, this.c)) * 31;
        dp2 dp2Var = this.e;
        int iHashCode2 = (((((((((iHashCode + (dp2Var != null ? dp2Var.hashCode() : 0)) * 31) + this.f) * 31) + (this.g ? 1231 : 1237)) * 31) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        dp2 dp2Var2 = this.k;
        int iHashCode4 = (iHashCode3 + (dp2Var2 != null ? dp2Var2.hashCode() : 0)) * 961;
        iv0 iv0Var = this.color;
        int iHashCode5 = (iHashCode4 + (iv0Var != null ? iv0Var.hashCode() : 0)) * 31;
        dp2 dp2Var3 = this.l;
        return iHashCode5 + (dp2Var3 != null ? dp2Var3.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // defpackage.mx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(defpackage.gx4 r18) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.j(gx4):void");
    }
}

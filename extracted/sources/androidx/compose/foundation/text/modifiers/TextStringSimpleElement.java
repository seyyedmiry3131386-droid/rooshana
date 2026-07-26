package androidx.compose.foundation.text.modifiers;

import defpackage.fj8;
import defpackage.gj8;
import defpackage.gx4;
import defpackage.iv0;
import defpackage.js3;
import defpackage.mx4;
import defpackage.oh2;
import defpackage.rm7;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends mx4 {
    public final String b;
    public final gj8 c;
    private final iv0 color;
    public final oh2 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;

    public TextStringSimpleElement(String str, gj8 gj8Var, oh2 oh2Var, int i, boolean z, int i2, int i3, iv0 iv0Var) {
        this.b = str;
        this.c = gj8Var;
        this.d = oh2Var;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.color = iv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return js3.i(this.color, textStringSimpleElement.color) && js3.i(this.b, textStringSimpleElement.b) && js3.i(this.c, textStringSimpleElement.c) && js3.i(this.d, textStringSimpleElement.d) && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        iv0 iv0Var = this.color;
        fj8 fj8Var = new fj8();
        fj8Var.o = this.b;
        fj8Var.p = this.c;
        fj8Var.q = this.d;
        fj8Var.r = this.e;
        fj8Var.s = this.f;
        fj8Var.t = this.g;
        fj8Var.u = this.h;
        fj8Var.v = iv0Var;
        return fj8Var;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.d.hashCode() + rm7.h(this.b.hashCode() * 31, 31, this.c)) * 31) + this.e) * 31) + (this.f ? 1231 : 1237)) * 31) + this.g) * 31) + this.h) * 31;
        iv0 iv0Var = this.color;
        return iHashCode + (iv0Var != null ? iv0Var.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // defpackage.mx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(defpackage.gx4 r12) {
        /*
            r11 = this;
            fj8 r12 = (defpackage.fj8) r12
            iv0 r0 = r11.color
            iv0 r1 = r12.v
            boolean r1 = defpackage.js3.i(r0, r1)
            r12.v = r0
            r0 = 0
            r2 = 1
            gj8 r3 = r11.c
            if (r1 == 0) goto L26
            gj8 r1 = r12.p
            if (r3 == r1) goto L21
            c28 r4 = r3.a
            c28 r1 = r1.a
            boolean r1 = r4.b(r1)
            if (r1 == 0) goto L26
            goto L24
        L21:
            r3.getClass()
        L24:
            r1 = r0
            goto L27
        L26:
            r1 = r2
        L27:
            java.lang.String r4 = r12.o
            java.lang.String r5 = r11.b
            boolean r4 = defpackage.js3.i(r4, r5)
            if (r4 == 0) goto L32
            goto L38
        L32:
            r12.o = r5
            r0 = 0
            r12.z = r0
            r0 = r2
        L38:
            gj8 r4 = r12.p
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r12.p = r3
            int r3 = r12.u
            int r5 = r11.h
            if (r3 == r5) goto L4a
            r12.u = r5
            r4 = r2
        L4a:
            int r3 = r12.t
            int r5 = r11.g
            if (r3 == r5) goto L53
            r12.t = r5
            r4 = r2
        L53:
            boolean r3 = r12.s
            boolean r5 = r11.f
            if (r3 == r5) goto L5c
            r12.s = r5
            r4 = r2
        L5c:
            oh2 r3 = r12.q
            oh2 r5 = r11.d
            boolean r3 = defpackage.js3.i(r3, r5)
            if (r3 != 0) goto L69
            r12.q = r5
            r4 = r2
        L69:
            int r3 = r12.r
            int r5 = r11.e
            if (r3 != r5) goto L71
            r2 = r4
            goto L73
        L71:
            r12.r = r5
        L73:
            if (r0 != 0) goto L77
            if (r2 == 0) goto La3
        L77:
            o16 r3 = r12.C0()
            java.lang.String r4 = r12.o
            gj8 r5 = r12.p
            oh2 r6 = r12.q
            int r7 = r12.r
            boolean r8 = r12.s
            int r9 = r12.t
            int r10 = r12.u
            r3.a = r4
            r3.b = r5
            r3.c = r6
            r3.d = r7
            r3.e = r8
            r3.f = r9
            r3.g = r10
            long r4 = r3.s
            r6 = 2
            long r4 = r4 << r6
            r6 = 2
            long r4 = r4 | r6
            r3.s = r4
            r3.c()
        La3:
            boolean r3 = r12.n
            if (r3 != 0) goto La8
            goto Lc2
        La8:
            if (r0 != 0) goto Lb0
            if (r1 == 0) goto Lb3
            dj8 r3 = r12.y
            if (r3 == 0) goto Lb3
        Lb0:
            defpackage.t17.f(r12)
        Lb3:
            if (r0 != 0) goto Lb7
            if (r2 == 0) goto Lbd
        Lb7:
            defpackage.zk8.J(r12)
            defpackage.rf0.z(r12)
        Lbd:
            if (r1 == 0) goto Lc2
            defpackage.rf0.z(r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.j(gx4):void");
    }
}

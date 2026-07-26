package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import defpackage.bp2;
import defpackage.br9;
import defpackage.bt2;
import defpackage.ct2;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.e71;
import defpackage.ex4;
import defpackage.hx4;
import defpackage.ir9;
import defpackage.js3;
import defpackage.l16;
import defpackage.li1;
import defpackage.ll;
import defpackage.nr5;
import defpackage.ok4;
import defpackage.pg8;
import defpackage.pi8;
import defpackage.pt0;
import defpackage.px8;
import defpackage.q95;
import defpackage.qg2;
import defpackage.ri8;
import defpackage.rr5;
import defpackage.s08;
import defpackage.si8;
import defpackage.t51;
import defpackage.tg8;
import defpackage.th8;
import defpackage.us3;
import defpackage.uy6;
import defpackage.wb5;
import defpackage.wn5;
import defpackage.wx7;
import defpackage.x44;
import defpackage.x96;
import defpackage.yg;
import defpackage.yq2;
import defpackage.yw2;
import defpackage.zh8;
import defpackage.zi8;
import java.util.ArrayList;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public boolean A;
    public final px8 a;
    public x44 d;
    public bp2 f;
    public pt0 g;
    public e71 h;
    public x96 i;
    public yw2 j;
    public qg2 k;
    public final wb5 l;
    public final wb5 m;
    public long n;
    public zi8 o;
    public long p;
    public final wb5 q;
    public final wb5 r;
    public int s;
    public zh8 t;
    public ir9 u;
    public zi8 v;
    public final wb5 w;
    public final androidx.compose.foundation.text.contextmenu.modifier.c x;
    public final th8 y;
    public final wx7 z;
    public rr5 b = wn5.d;
    public dp2 c = new us3(7);
    public final wb5 e = androidx.compose.runtime.g.h(new zh8((String) null, 0, 7));

    public f(px8 px8Var) {
        this.a = px8Var;
        Boolean bool = Boolean.TRUE;
        this.l = androidx.compose.runtime.g.h(bool);
        this.m = androidx.compose.runtime.g.h(bool);
        this.n = 0L;
        this.p = 0L;
        this.q = androidx.compose.runtime.g.h(null);
        this.r = androidx.compose.runtime.g.h(null);
        this.s = -1;
        this.t = new zh8((String) null, 0L, 7);
        this.w = androidx.compose.runtime.g.h(Boolean.FALSE);
        androidx.compose.foundation.text.contextmenu.modifier.c cVar = new androidx.compose.foundation.text.contextmenu.modifier.c();
        cVar.b = ToolbarHandlerState.a;
        this.x = cVar;
        this.y = new th8(this);
        this.z = new wx7(this);
    }

    public static final Pair a(f fVar) {
        String str;
        zi8 zi8Var;
        ll llVarP = fVar.p();
        if (llVarP == null || (str = llVarP.b) == null || (zi8Var = fVar.v) == null) {
            return null;
        }
        long j = zi8Var.a;
        return new Pair(str, new zi8(uy6.b(fVar.b.q((int) (j >> 32)), fVar.b.q((int) (j & 4294967295L)))));
    }

    public static final void b(f fVar, zi8 zi8Var) {
        ll llVarP;
        String str;
        e71 e71Var;
        if (zi8Var == null) {
            return;
        }
        long j = zi8Var.a;
        x96 x96Var = fVar.i;
        if (x96Var == null || (llVarP = fVar.p()) == null || (str = llVarP.b) == null) {
            return;
        }
        rr5 rr5Var = fVar.b;
        long jB = uy6.b(rr5Var.q((int) (j >> 32)), rr5Var.q((int) (j & 4294967295L)));
        if (str.length() <= 0 || zi8.d(jB) || (e71Var = fVar.h) == null) {
            return;
        }
        bt2.G(e71Var, null, null, new TextFieldSelectionManager$maybeSuggestSelection$1(x96Var, str, jB, zi8Var, fVar, rr5Var, null), 3);
    }

    public static final void c(f fVar, nr5 nr5Var) {
        ((s08) fVar.r).setValue(nr5Var);
    }

    public static final void d(f fVar, Handle handle) {
        ((s08) fVar.q).setValue(handle);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long e(androidx.compose.foundation.text.selection.f r22, defpackage.zh8 r23, long r24, boolean r26, boolean r27, defpackage.y45 r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.f.e(androidx.compose.foundation.text.selection.f, zh8, long, boolean, boolean, y45, boolean):long");
    }

    public static zh8 g(ll llVar, long j) {
        return new zh8(llVar, j, (zi8) null);
    }

    public final li1 f(boolean z) {
        e71 e71Var = this.h;
        if (e71Var != null) {
            return bt2.G(e71Var, null, CoroutineStart.d, new TextFieldSelectionManager$copy$1(this, z, null), 1);
        }
        return null;
    }

    public final void h() {
        e71 e71Var = this.h;
        if (e71Var != null) {
            bt2.G(e71Var, null, CoroutineStart.d, new TextFieldSelectionManager$cut$1(this, null), 1);
        }
    }

    public final void i(nr5 nr5Var) {
        if (!zi8.d(q().b)) {
            x44 x44Var = this.d;
            si8 si8VarD = x44Var != null ? x44Var.d() : null;
            int iF = (nr5Var == null || si8VarD == null) ? zi8.f(q().b) : this.b.h(si8VarD.b(nr5Var.a, true));
            zh8 zh8VarA = zh8.a(q(), null, uy6.b(iF, iF), 5);
            this.c.invoke(zh8VarA);
            this.v = new zi8(zh8VarA.b);
        }
        t((nr5Var == null || q().a.b.length() <= 0) ? HandleState.a : HandleState.c);
        w(false);
    }

    public final void j(boolean z) {
        qg2 qg2Var;
        x44 x44Var = this.d;
        if (x44Var != null && !x44Var.b() && (qg2Var = this.k) != null) {
            qg2 qg2Var2 = qg2.b;
            qg2Var.a();
        }
        this.t = q();
        w(z);
        t(HandleState.b);
    }

    public final hx4 k() {
        if (!n()) {
            return ex4.b;
        }
        return ct2.z(yq2.v0(new TextFieldSelectionManager$contextMenuAreaModifier$1(this, null)), this.x, new TextFieldSelectionManager$contextMenuAreaModifier$2(this, null), new TextFieldSelectionManager$contextMenuAreaModifier$3(this, null), new t51(this, 2));
    }

    public final nr5 l() {
        return (nr5) ((s08) this.r).getValue();
    }

    public final boolean m() {
        return ((Boolean) ((s08) this.l).getValue()).booleanValue();
    }

    public final boolean n() {
        return ((Boolean) ((s08) this.m).getValue()).booleanValue();
    }

    public final long o(boolean z) {
        si8 si8VarD;
        long j;
        x44 x44Var = this.d;
        if (x44Var != null && (si8VarD = x44Var.d()) != null) {
            ri8 ri8Var = si8VarD.a;
            ll llVarP = p();
            if (llVarP != null) {
                if (js3.i(llVarP.b, ri8Var.a.a.b)) {
                    zh8 zh8VarQ = q();
                    if (z) {
                        long j2 = zh8VarQ.b;
                        int i = zi8.c;
                        j = j2 >> 32;
                    } else {
                        long j3 = zh8VarQ.b;
                        int i2 = zi8.c;
                        j = j3 & 4294967295L;
                    }
                    int iQ = this.b.q((int) j);
                    boolean zH = zi8.h(q().b);
                    q95 q95Var = ri8Var.b;
                    long j4 = ri8Var.c;
                    int iD = q95Var.d(iQ);
                    if (iD >= q95Var.f) {
                        return 9205357640488583168L;
                    }
                    boolean z2 = ri8Var.a(((!z || zH) && (z || !zH)) ? Math.max(iQ + (-1), 0) : iQ) == ri8Var.g(iQ);
                    ArrayList arrayList = q95Var.h;
                    q95Var.l(iQ);
                    l16 l16Var = (l16) arrayList.get(iQ == ((ll) q95Var.a.b).b.length() ? br9.y(arrayList) : dt2.j(iQ, arrayList));
                    yg ygVar = l16Var.a;
                    int iD2 = l16Var.d(iQ);
                    pi8 pi8Var = ygVar.d;
                    return (((long) Float.floatToRawIntBits(ok4.s(z2 ? pi8Var.h(iD2, false) : pi8Var.i(iD2, false), 0.0f, (int) (j4 >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(ok4.s(q95Var.b(iD), 0.0f, (int) (j4 & 4294967295L)))));
                }
            }
        }
        return 9205357640488583168L;
    }

    public final ll p() {
        tg8 tg8Var;
        x44 x44Var = this.d;
        if (x44Var == null || (tg8Var = x44Var.a) == null) {
            return null;
        }
        return tg8Var.a;
    }

    public final zh8 q() {
        return (zh8) ((s08) this.e).getValue();
    }

    public final void r() {
        li1 li1Var;
        pg8 pg8Var = this.x.a;
        if (pg8Var == null || (li1Var = pg8Var.u) == null) {
            return;
        }
        li1Var.g(null);
        pg8Var.u = null;
    }

    public final void s() {
        e71 e71Var = this.h;
        if (e71Var != null) {
            bt2.G(e71Var, null, CoroutineStart.d, new TextFieldSelectionManager$paste$1(this, null), 1);
        }
    }

    public final void t(HandleState handleState) {
        x44 x44Var = this.d;
        if (x44Var != null) {
            if (x44Var.a() == handleState) {
                x44Var = null;
            }
            if (x44Var != null) {
                ((s08) x44Var.k).setValue(handleState);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (((java.lang.Boolean) ((defpackage.s08) r3.q).getValue()).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            r4 = this;
            c08 r0 = defpackage.ql3.k()
            if (r0 == 0) goto Lb
            dp2 r1 = r0.e()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            c08 r2 = defpackage.ql3.m(r0)
            boolean r3 = r4.n()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            x44 r3 = r4.d     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L2b
            wb5 r3 = r3.q     // Catch: java.lang.Throwable -> L34
            s08 r3 = (defpackage.s08) r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L34
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L2b
            goto L36
        L2b:
            defpackage.ql3.u(r0, r2, r1)
            androidx.compose.foundation.text.contextmenu.modifier.c r0 = r4.x
            r0.a()
            return
        L34:
            r3 = move-exception
            goto L3a
        L36:
            defpackage.ql3.u(r0, r2, r1)
            return
        L3a:
            defpackage.ql3.u(r0, r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.f.u():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1 r0 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.foundation.text.selection.f r0 = r0.a
            kotlin.b.b(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.b.b(r5)
            pt0 r5 = r4.g
            if (r5 == 0) goto L67
            r0.a = r4
            r0.d = r3
            ye r5 = (defpackage.ye) r5
            ze r5 = r5.a
            android.content.ClipboardManager r5 = r5.a
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L52
            java.lang.String r2 = "text/*"
            boolean r5 = r5.hasMimeType(r2)
            if (r5 != r3) goto L52
            goto L53
        L52:
            r3 = r0
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r5 != r1) goto L5a
            return r1
        L5a:
            r0 = r4
        L5b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            wb5 r0 = r0.w
            s08 r0 = (defpackage.s08) r0
            r0.setValue(r5)
        L67:
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.f.v(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void w(boolean z) {
        x44 x44Var = this.d;
        if (x44Var != null) {
            ((s08) x44Var.l).setValue(Boolean.valueOf(z));
        }
        if (z) {
            u();
        } else {
            r();
        }
    }
}

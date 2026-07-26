package androidx.compose.ui.layout;

import android.os.Handler;
import androidx.compose.runtime.PausedCompositionState;
import androidx.compose.ui.node.LayoutNode$UsageByParent;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.bp2;
import defpackage.c08;
import defpackage.ce7;
import defpackage.d01;
import defpackage.de7;
import defpackage.dp2;
import defpackage.dz0;
import defpackage.g08;
import defpackage.j01;
import defpackage.js3;
import defpackage.kb5;
import defpackage.l37;
import defpackage.m14;
import defpackage.o14;
import defpackage.ov;
import defpackage.p14;
import defpackage.ql3;
import defpackage.qp2;
import defpackage.r14;
import defpackage.rb5;
import defpackage.rm7;
import defpackage.rn3;
import defpackage.s08;
import defpackage.sb5;
import defpackage.tx8;
import defpackage.u14;
import defpackage.uw5;
import defpackage.v14;
import defpackage.v98;
import defpackage.vj3;
import defpackage.w36;
import defpackage.x98;
import defpackage.y98;
import defpackage.zb5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements dz0 {
    public final androidx.compose.ui.node.h a;
    public d01 b;
    public y98 c;
    public int d;
    public int e;
    public final rb5 f;
    public final rb5 g;
    public final r14 h;
    public final o14 i;
    public final rb5 j;
    public final x98 k;
    public final rb5 l;
    public final zb5 m;
    public int n;
    public int o;
    public final String p;

    public g(androidx.compose.ui.node.h hVar, y98 y98Var) {
        this.a = hVar;
        this.c = y98Var;
        long[] jArr = ce7.a;
        this.f = new rb5();
        this.g = new rb5();
        this.h = new r14(this);
        this.i = new o14(this);
        this.j = new rb5();
        this.k = new x98();
        this.l = new rb5();
        this.m = new zb5(0, new Object[16]);
        this.p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void c(g gVar, Object obj) {
        androidx.compose.ui.node.h hVar = gVar.a;
        gVar.h();
        androidx.compose.ui.node.h hVar2 = (androidx.compose.ui.node.h) gVar.j.k(obj);
        if (hVar2 != null) {
            if (gVar.o <= 0) {
                rn3.b("No pre-composed items to dispose");
            }
            int iJ = ((zb5) ((kb5) hVar.r()).b).j(hVar2);
            if (iJ < ((zb5) ((kb5) hVar.r()).b).c - gVar.o) {
                rn3.b("Item is not in pre-composed item range");
            }
            gVar.n++;
            gVar.o--;
            p14 p14Var = (p14) gVar.f.g(hVar2);
            if (p14Var != null) {
                e(p14Var);
            }
            int i = (((zb5) ((kb5) hVar.r()).b).c - gVar.o) - gVar.n;
            gVar.j(iJ, i);
            gVar.g(i);
        }
        if (gVar.m.i(obj)) {
            androidx.compose.ui.node.h.s0(hVar, true, 6);
        }
    }

    public static void e(p14 p14Var) {
        sb5 sb5Var;
        w36 w36Var = p14Var.f;
        if (w36Var != null) {
            w36Var.h.set(PausedCompositionState.b);
            l37 l37Var = w36Var.k;
            if (((sb5) l37Var.h).c()) {
                sb5Var = (sb5) l37Var.h;
                sb5 sb5Var2 = de7.a;
                l37Var.h = new sb5();
                ((zb5) l37Var.d).h();
            } else {
                sb5Var = null;
            }
            l37Var.c();
            j01 j01Var = w36Var.a;
            j01Var.q = null;
            if (sb5Var != null) {
                j01Var.u.k = sb5Var;
                j01Var.w = 2;
            }
            p14Var.f = null;
            j01 j01Var2 = p14Var.c;
            if (j01Var2 != null) {
                j01Var2.p();
            }
            p14Var.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // defpackage.dz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            androidx.compose.ui.node.h r2 = r0.a
            r2.s = r1
            rb5 r1 = r0.f
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            p14 r13 = (defpackage.p14) r13
            j01 r13 = r13.c
            if (r13 == 0) goto L47
            r13.p()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.m0()
            r2.s = r6
            r1.a()
            rb5 r1 = r0.g
            r1.a()
            r0.o = r6
            r0.n = r6
            rb5 r1 = r0.j
            r1.a()
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.g.a():void");
    }

    @Override // defpackage.dz0
    public final void b() {
        i(true);
    }

    public final void d(p14 p14Var, boolean z) {
        w36 w36Var = p14Var.f;
        if (w36Var != null) {
            c08 c08VarK = ql3.k();
            dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
            c08 c08VarM = ql3.m(c08VarK);
            try {
                androidx.compose.ui.node.h hVar = this.a;
                hVar.s = true;
                if (z) {
                    while (!w36Var.c()) {
                        try {
                            w36Var.e(new vj3(6));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                w36Var.a();
                p14Var.f = null;
                hVar.s = false;
            } finally {
                ql3.u(c08VarK, c08VarM, dp2VarE);
            }
        }
    }

    public final v98 f(Object obj) {
        return !this.a.U() ? new u14() : new v14(this, obj);
    }

    public final void g(int i) {
        boolean z;
        boolean z2 = false;
        this.n = 0;
        List listR = this.a.r();
        kb5 kb5Var = (kb5) listR;
        int i2 = (((zb5) kb5Var.b).c - this.o) - 1;
        if (i <= i2) {
            this.k.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.f.g((androidx.compose.ui.node.h) kb5Var.get(i3));
                    js3.m(objG);
                    this.k.a.b(((p14) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.d(this.k);
            c08 c08VarK = ql3.k();
            dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
            c08 c08VarM = ql3.m(c08VarK);
            z = false;
            while (i2 >= i) {
                try {
                    androidx.compose.ui.node.h hVar = (androidx.compose.ui.node.h) ((kb5) listR).get(i2);
                    Object objG2 = this.f.g(hVar);
                    js3.m(objG2);
                    p14 p14Var = (p14) objG2;
                    Object obj = p14Var.a;
                    if (this.k.a.a(obj)) {
                        this.n++;
                        if (((Boolean) ((s08) p14Var.g).getValue()).booleanValue()) {
                            androidx.compose.ui.node.l lVarZ = hVar.z();
                            LayoutNode$UsageByParent layoutNode$UsageByParent = LayoutNode$UsageByParent.c;
                            lVarZ.l = layoutNode$UsageByParent;
                            androidx.compose.ui.node.k kVarY = hVar.y();
                            if (kVarY != null) {
                                kVarY.j = layoutNode$UsageByParent;
                            }
                            l(p14Var, false);
                            if (p14Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        androidx.compose.ui.node.h hVar2 = this.a;
                        hVar2.s = true;
                        this.f.k(hVar);
                        j01 j01Var = p14Var.c;
                        if (j01Var != null) {
                            j01Var.p();
                        }
                        this.a.n0(i2, 1);
                        hVar2.s = false;
                    }
                    this.g.k(obj);
                    i2--;
                } catch (Throwable th) {
                    ql3.u(c08VarK, c08VarM, dp2VarE);
                    throw th;
                }
            }
            ql3.u(c08VarK, c08VarM, dp2VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (g08.c) {
                sb5 sb5Var = g08.j.h;
                if (sb5Var != null) {
                    if (sb5Var.c()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                g08.a();
            }
        }
        h();
    }

    public final void h() {
        int i = ((zb5) ((kb5) this.a.r()).b).c;
        rb5 rb5Var = this.f;
        if (rb5Var.e != i) {
            rn3.a("Inconsistency between the count of nodes tracked by the state (" + rb5Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.n) - this.o < 0) {
            StringBuilder sbR = rm7.r(i, "Incorrect state. Total children ", ". Reusable children ");
            sbR.append(this.n);
            sbR.append(". Precomposed children ");
            sbR.append(this.o);
            rn3.a(sbR.toString());
        }
        rb5 rb5Var2 = this.j;
        if (rb5Var2.e == this.o) {
            return;
        }
        rn3.a("Incorrect state. Precomposed children " + this.o + ". Map size " + rb5Var2.e);
    }

    public final void i(boolean z) {
        this.o = 0;
        this.j.a();
        List listR = this.a.r();
        int i = ((zb5) ((kb5) listR).b).c;
        if (this.n != i) {
            this.n = i;
            c08 c08VarK = ql3.k();
            dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
            c08 c08VarM = ql3.m(c08VarK);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    androidx.compose.ui.node.h hVar = (androidx.compose.ui.node.h) ((kb5) listR).get(i2);
                    p14 p14Var = (p14) this.f.g(hVar);
                    if (p14Var != null && ((Boolean) ((s08) p14Var.g).getValue()).booleanValue()) {
                        androidx.compose.ui.node.l lVarZ = hVar.z();
                        LayoutNode$UsageByParent layoutNode$UsageByParent = LayoutNode$UsageByParent.c;
                        lVarZ.l = layoutNode$UsageByParent;
                        androidx.compose.ui.node.k kVarY = hVar.y();
                        if (kVarY != null) {
                            kVarY.j = layoutNode$UsageByParent;
                        }
                        l(p14Var, z);
                        p14Var.a = e.a;
                    }
                } catch (Throwable th) {
                    ql3.u(c08VarK, c08VarM, dp2VarE);
                    throw th;
                }
            }
            ql3.u(c08VarK, c08VarM, dp2VarE);
            this.g.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        androidx.compose.ui.node.h hVar = this.a;
        hVar.s = true;
        hVar.f0(i, i2, 1);
        hVar.s = false;
    }

    public final void k(Object obj, qp2 qp2Var, boolean z) {
        androidx.compose.ui.node.h hVar = this.a;
        if (hVar.U()) {
            h();
            if (this.g.c(obj)) {
                return;
            }
            this.l.k(obj);
            rb5 rb5Var = this.j;
            Object objG = rb5Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((zb5) ((kb5) hVar.r()).b).j(objG), ((zb5) ((kb5) hVar.r()).b).c);
                    this.o++;
                } else {
                    int i = ((zb5) ((kb5) hVar.r()).b).c;
                    androidx.compose.ui.node.h hVar2 = new androidx.compose.ui.node.h(2);
                    hVar.s = true;
                    hVar.N(i, hVar2);
                    hVar.s = false;
                    this.o++;
                    objG = hVar2;
                }
                rb5Var.m(obj, objG);
            }
            m((androidx.compose.ui.node.h) objG, obj, z, qp2Var);
        }
    }

    public final void l(final p14 p14Var, boolean z) {
        j01 j01Var;
        if (z || !p14Var.h) {
            p14Var.g = androidx.compose.runtime.g.h(Boolean.FALSE);
        } else {
            ((s08) p14Var.g).setValue(Boolean.FALSE);
        }
        if (p14Var.f != null) {
            e(p14Var);
            return;
        }
        if (z) {
            j01 j01Var2 = p14Var.c;
            if (j01Var2 != null) {
                j01Var2.o();
                return;
            }
            return;
        }
        uw5 outOfFrameExecutor = m14.a(this.a).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (p14Var.h || (j01Var = p14Var.c) == null) {
                return;
            }
            j01Var.o();
            return;
        }
        bp2 bp2Var = new bp2() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$deactivateOutOfFrame$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                j01 j01Var3;
                p14 p14Var2 = p14Var;
                if (!((Boolean) ((s08) p14Var2.g).getValue()).booleanValue() && (j01Var3 = p14Var2.c) != null) {
                    j01Var3.o();
                }
                return tx8.a;
            }
        };
        AndroidComposeView androidComposeView = (AndroidComposeView) outOfFrameExecutor;
        ov ovVar = androidComposeView.h;
        boolean zIsEmpty = ovVar.isEmpty();
        ovVar.addLast(bp2Var);
        if (zIsEmpty) {
            Handler handler = androidComposeView.getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(androidComposeView.i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bd, B:64:0x00d1, B:66:0x00d5, B:72:0x010b, B:67:0x00e2, B:68:0x00ed, B:70:0x00f1, B:71:0x0108, B:62:0x00c0, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bd, B:64:0x00d1, B:66:0x00d5, B:72:0x010b, B:67:0x00e2, B:68:0x00ed, B:70:0x00f1, B:71:0x0108, B:62:0x00c0, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(androidx.compose.ui.node.h r10, java.lang.Object r11, boolean r12, defpackage.qp2 r13) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.g.m(androidx.compose.ui.node.h, java.lang.Object, boolean, qp2):void");
    }

    public final androidx.compose.ui.node.h n(Object obj) {
        rb5 rb5Var;
        int i;
        if (this.n == 0) {
            return null;
        }
        kb5 kb5Var = (kb5) this.a.r();
        int i2 = ((zb5) kb5Var.b).c - this.o;
        int i3 = i2 - this.n;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            rb5Var = this.f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = rb5Var.g((androidx.compose.ui.node.h) kb5Var.get(i5));
            js3.m(objG);
            if (((p14) objG).a.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object objG2 = rb5Var.g((androidx.compose.ui.node.h) kb5Var.get(i4));
                js3.m(objG2);
                p14 p14Var = (p14) objG2;
                Object obj2 = p14Var.a;
                if (obj2 == e.a || this.c.j(obj, obj2)) {
                    p14Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.n--;
        androidx.compose.ui.node.h hVar = (androidx.compose.ui.node.h) kb5Var.get(i3);
        Object objG3 = rb5Var.g(hVar);
        js3.m(objG3);
        p14 p14Var2 = (p14) objG3;
        p14Var2.g = androidx.compose.runtime.g.h(Boolean.TRUE);
        p14Var2.e = true;
        p14Var2.d = true;
        return hVar;
    }
}

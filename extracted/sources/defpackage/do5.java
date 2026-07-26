package defpackage;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.m;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class do5 extends jo5 {
    public final gx4 c;
    public final ce4 d;
    public final ue4 e;
    public m f;
    public vg6 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public do5(gx4 gx4Var) {
        this.c = gx4Var;
        ce4 ce4Var = new ce4(1, (byte) 0);
        ce4Var.c = new long[2];
        this.d = ce4Var;
        this.e = new ue4(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02da  */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [zb5] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [zb5] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.jo5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.ue4 r52, defpackage.v04 r53, defpackage.ir9 r54, boolean r55) {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do5.a(ue4, v04, ir9, boolean):boolean");
    }

    @Override // defpackage.jo5
    public final void b(ir9 ir9Var) {
        super.b(ir9Var);
        vg6 vg6Var = this.g;
        if (vg6Var == null) {
            return;
        }
        this.h = this.i;
        List list = vg6Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ah6 ah6Var = (ah6) list.get(i);
            boolean z = ah6Var.d;
            long j = ah6Var.a;
            boolean zA = ir9Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.e(j);
            }
        }
        this.i = false;
        this.j = vg6Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [gx4] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [gx4] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [zb5] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [zb5] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        zb5 zb5Var = this.a;
        Object[] objArr = zb5Var.a;
        int i = zb5Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((do5) objArr[i2]).c();
        }
        ?? J = this.c;
        ?? zb5Var2 = 0;
        while (J != 0) {
            if (J instanceof dh6) {
                ((dh6) J).B();
            } else if ((J.c & 16) != 0 && (J instanceof ti1)) {
                gx4 gx4Var = ((ti1) J).p;
                int i3 = 0;
                J = J;
                zb5Var2 = zb5Var2;
                while (gx4Var != null) {
                    if ((gx4Var.c & 16) != 0) {
                        i3++;
                        zb5Var2 = zb5Var2;
                        if (i3 == 1) {
                            J = gx4Var;
                        } else {
                            if (zb5Var2 == 0) {
                                zb5Var2 = new zb5(0, new gx4[16]);
                            }
                            if (J != 0) {
                                zb5Var2.b(J);
                                J = 0;
                            }
                            zb5Var2.b(gx4Var);
                        }
                    }
                    gx4Var = gx4Var.f;
                    J = J;
                    zb5Var2 = zb5Var2;
                }
                if (i3 == 1) {
                }
            }
            J = y40.j(zb5Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [gx4] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(ir9 ir9Var) {
        ue4 ue4Var = this.e;
        boolean z = false;
        z = false;
        if (!ue4Var.g()) {
            gx4 gx4Var = this.c;
            if (gx4Var.n) {
                vg6 vg6Var = this.g;
                js3.m(vg6Var);
                m mVar = this.f;
                js3.m(mVar);
                long j = mVar.c;
                ?? J = gx4Var;
                ?? zb5Var = 0;
                while (J != 0) {
                    if (J instanceof dh6) {
                        ((dh6) J).t(vg6Var, PointerEventPass.c, j);
                    } else if ((J.c & 16) != 0 && (J instanceof ti1)) {
                        gx4 gx4Var2 = ((ti1) J).p;
                        int i = 0;
                        J = J;
                        zb5Var = zb5Var;
                        while (gx4Var2 != null) {
                            if ((gx4Var2.c & 16) != 0) {
                                i++;
                                zb5Var = zb5Var;
                                if (i == 1) {
                                    J = gx4Var2;
                                } else {
                                    if (zb5Var == 0) {
                                        zb5Var = new zb5(0, new gx4[16]);
                                    }
                                    if (J != 0) {
                                        zb5Var.b(J);
                                        J = 0;
                                    }
                                    zb5Var.b(gx4Var2);
                                }
                            }
                            gx4Var2 = gx4Var2.f;
                            J = J;
                            zb5Var = zb5Var;
                        }
                        if (i == 1) {
                        }
                    }
                    J = y40.j(zb5Var);
                }
                if (gx4Var.n) {
                    zb5 zb5Var2 = this.a;
                    Object[] objArr = zb5Var2.a;
                    int i2 = zb5Var2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((do5) objArr[i3]).d(ir9Var);
                    }
                }
                z = true;
            }
        }
        b(ir9Var);
        ue4Var.b();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [gx4] */
    /* JADX WARN: Type inference failed for: r0v3, types: [gx4] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [gx4] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [zb5] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [zb5] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [gx4] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [zb5] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [zb5] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(ir9 ir9Var, boolean z) {
        if (!this.e.g()) {
            ?? J = this.c;
            if (J.n) {
                vg6 vg6Var = this.g;
                js3.m(vg6Var);
                m mVar = this.f;
                js3.m(mVar);
                long j = mVar.c;
                ?? J2 = J;
                ?? zb5Var = 0;
                while (J2 != 0) {
                    if (J2 instanceof dh6) {
                        ((dh6) J2).t(vg6Var, PointerEventPass.a, j);
                    } else if ((J2.c & 16) != 0 && (J2 instanceof ti1)) {
                        gx4 gx4Var = ((ti1) J2).p;
                        int i = 0;
                        J2 = J2;
                        zb5Var = zb5Var;
                        while (gx4Var != null) {
                            if ((gx4Var.c & 16) != 0) {
                                i++;
                                zb5Var = zb5Var;
                                if (i == 1) {
                                    J2 = gx4Var;
                                } else {
                                    if (zb5Var == 0) {
                                        zb5Var = new zb5(0, new gx4[16]);
                                    }
                                    if (J2 != 0) {
                                        zb5Var.b(J2);
                                        J2 = 0;
                                    }
                                    zb5Var.b(gx4Var);
                                }
                            }
                            gx4Var = gx4Var.f;
                            J2 = J2;
                            zb5Var = zb5Var;
                        }
                        if (i == 1) {
                        }
                    }
                    J2 = y40.j(zb5Var);
                }
                if (J.n) {
                    zb5 zb5Var2 = this.a;
                    Object[] objArr = zb5Var2.a;
                    int i2 = zb5Var2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        do5 do5Var = (do5) objArr[i3];
                        js3.m(this.f);
                        do5Var.e(ir9Var, z);
                    }
                }
                if (J.n) {
                    ?? zb5Var3 = 0;
                    while (J != 0) {
                        if (J instanceof dh6) {
                            ((dh6) J).t(vg6Var, PointerEventPass.b, j);
                        } else if ((J.c & 16) != 0 && (J instanceof ti1)) {
                            gx4 gx4Var2 = ((ti1) J).p;
                            int i4 = 0;
                            J = J;
                            zb5Var3 = zb5Var3;
                            while (gx4Var2 != null) {
                                if ((gx4Var2.c & 16) != 0) {
                                    i4++;
                                    zb5Var3 = zb5Var3;
                                    if (i4 == 1) {
                                        J = gx4Var2;
                                    } else {
                                        if (zb5Var3 == 0) {
                                            zb5Var3 = new zb5(0, new gx4[16]);
                                        }
                                        if (J != 0) {
                                            zb5Var3.b(J);
                                            J = 0;
                                        }
                                        zb5Var3.b(gx4Var2);
                                    }
                                }
                                gx4Var2 = gx4Var2.f;
                                J = J;
                                zb5Var3 = zb5Var3;
                            }
                            if (i4 == 1) {
                            }
                        }
                        J = y40.j(zb5Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, mb5 mb5Var) {
        ce4 ce4Var = this.d;
        if (ce4Var.c(j) && mb5Var.c(this) < 0) {
            ce4Var.e(j);
            this.e.j(j);
        }
        zb5 zb5Var = this.a;
        Object[] objArr = zb5Var.a;
        int i = zb5Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((do5) objArr[i2]).f(j, mb5Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}

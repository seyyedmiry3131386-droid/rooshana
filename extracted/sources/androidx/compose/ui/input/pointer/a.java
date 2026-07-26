package androidx.compose.ui.input.pointer;

import defpackage.db5;
import defpackage.do5;
import defpackage.gx4;
import defpackage.ir9;
import defpackage.jo5;
import defpackage.js3;
import defpackage.mb5;
import defpackage.ue4;
import defpackage.v04;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final v04 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final mb5 f = new mb5();
    public final jo5 g = new jo5();
    public final db5 h = new db5(10);

    public a(v04 v04Var) {
        this.a = v04Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r19, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.a.a(long, java.util.List, boolean):void");
    }

    public final boolean b(ir9 ir9Var, boolean z) {
        ue4 ue4Var = (ue4) ir9Var.c;
        v04 v04Var = this.a;
        jo5 jo5Var = this.g;
        boolean zA = jo5Var.a(ue4Var, v04Var, ir9Var, z);
        zb5 zb5Var = jo5Var.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = zb5Var.a;
        int i = zb5Var.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((do5) objArr[i2]).e(ir9Var, z) || z3;
        }
        Object[] objArr2 = zb5Var.a;
        int i3 = zb5Var.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((do5) objArr2[i4]).d(ir9Var) || z4;
        }
        jo5Var.b(ir9Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            mb5 mb5Var = this.f;
            int i5 = mb5Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((gx4) mb5Var.b(i6));
            }
            mb5Var.j();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            jo5Var.a.h();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        jo5 jo5Var = this.g;
        zb5 zb5Var = jo5Var.a;
        Object[] objArr = zb5Var.a;
        int i = zb5Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((do5) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            jo5Var.a.h();
        }
    }

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
    public final void d(gx4 gx4Var) {
        if (this.b) {
            this.e = true;
            this.f.g(gx4Var);
            return;
        }
        jo5 jo5Var = this.g;
        mb5 mb5Var = jo5Var.b;
        mb5Var.j();
        mb5Var.g(jo5Var);
        while (mb5Var.e()) {
            jo5 jo5Var2 = (jo5) mb5Var.l(mb5Var.b - 1);
            int i = 0;
            while (true) {
                zb5 zb5Var = jo5Var2.a;
                if (i < zb5Var.c) {
                    do5 do5Var = (do5) zb5Var.a[i];
                    if (js3.i(do5Var.c, gx4Var)) {
                        jo5Var2.a.k(do5Var);
                        do5Var.c();
                    } else {
                        mb5Var.g(do5Var);
                        i++;
                    }
                }
            }
        }
    }
}

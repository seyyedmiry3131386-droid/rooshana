package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vc implements mz1 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public cp8 h;
    public cp8 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public cp8 v;
    public long w;
    public final ao0 b = new ao0(new byte[7], 7);
    public final h26 c = new h26(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public vc(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0207  */
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
    @Override // defpackage.mz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.h26 r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc.a(h26):void");
    }

    @Override // defpackage.mz1
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // defpackage.mz1
    public final void e(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.mz1
    public final void f(x72 x72Var, ft8 ft8Var) {
        ft8Var.a();
        ft8Var.b();
        this.g = ft8Var.e;
        ft8Var.b();
        cp8 cp8VarO = x72Var.o(ft8Var.d, 1);
        this.h = cp8VarO;
        this.v = cp8VarO;
        if (!this.a) {
            this.i = new uo1();
            return;
        }
        ft8Var.a();
        ft8Var.b();
        cp8 cp8VarO2 = x72Var.o(ft8Var.d, 5);
        this.i = cp8VarO2;
        rj2 rj2Var = new rj2();
        ft8Var.b();
        rj2Var.a = ft8Var.e;
        rj2Var.l = tv4.m(this.f);
        rj2Var.m = tv4.m("application/id3");
        rm7.w(rj2Var, cp8VarO2);
    }

    @Override // defpackage.mz1
    public final void d(boolean z) {
    }
}

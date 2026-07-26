package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kc9 implements lc9 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public long a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public long f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public kc9(long j, t34 t34Var, a34 a34Var, int i, int i2, pd pdVar, int i3, int i4, long j2, b bVar) {
        this.j = a34Var;
        this.b = i;
        this.c = i2;
        this.k = pdVar;
        this.d = i3;
        this.e = i4;
        this.f = j2;
        this.l = bVar;
        ya5 ya5Var = qq3.a;
        this.g = new ya5();
        this.h = t34Var;
        this.i = a34Var;
        this.a = j31.b(h31.h(j), Integer.MAX_VALUE, 5);
    }

    @Override // defpackage.lc9
    public void a(long j) {
        this.d = 0;
        this.a = j;
        this.e = 0;
        this.f = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:4:0x002a). Please report as a decompilation issue!!! */
    @Override // defpackage.lc9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(defpackage.w72 r25, long r26) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc9.b(w72, long):boolean");
    }

    @Override // defpackage.lc9
    public void c(int i, long j) {
        ((x72) this.g).t(new oc9((jg0) this.i, this.b, i, j));
        ((cp8) this.h).f((androidx.media3.common.b) this.l);
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
    public w34 d(int i, long j) {
        long j2;
        List list;
        t34 t34Var = (t34) this.h;
        Object objD = t34Var.d(i);
        Object objB = t34Var.b(i);
        a34 a34Var = (a34) this.i;
        ya5 ya5Var = (ya5) this.g;
        List list2 = (List) ya5Var.b(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            t34 t34Var2 = a34Var.c;
            ya5 ya5Var2 = a34Var.d;
            List listR = (List) ya5Var2.b(i);
            if (listR == null) {
                Object objD2 = t34Var2.d(i);
                listR = a34Var.b.r(a34Var.a.a(i, objD2, t34Var2.b(i)), objD2);
                ya5Var2.h(i, listR);
            }
            int size = listR.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((yk4) listR.get(i2)).t(j));
            }
            j2 = j;
            ya5Var.h(i, arrayList);
            list = arrayList;
        }
        return new w34(i, list, (pd) this.k, ((a34) this.j).b.getLayoutDirection(), this.d, this.e, i != this.b + (-1) ? this.c : 0, this.f, objD, objB, ((b) this.l).n, j2);
    }

    public void e(int i) {
        long j = this.a;
        long j2 = this.f;
        jg0 jg0Var = (jg0) this.i;
        long j3 = jg0Var.c;
        String str = j29.a;
        long jD0 = j + j29.d0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * jg0Var.b;
        ((cp8) this.h).a(jD0, 1, i2, this.e - i2, null);
        this.f += (long) i;
        this.e -= i2;
    }

    public kc9(x72 x72Var, cp8 cp8Var, jg0 jg0Var) throws ParserException {
        this.g = x72Var;
        this.h = cp8Var;
        this.i = jg0Var;
        int i = jg0Var.c;
        int iMax = Math.max(1, i / 10);
        this.c = iMax;
        h26 h26Var = new h26((byte[]) jg0Var.f);
        h26Var.q();
        int iQ = h26Var.q();
        this.b = iQ;
        int i2 = jg0Var.b;
        int i3 = jg0Var.d;
        int i4 = (((i3 - (i2 * 4)) * 8) / (jg0Var.e * i2)) + 1;
        if (iQ == i4) {
            int iF = j29.f(iMax, iQ);
            this.j = new byte[iF * i3];
            this.k = new h26(iQ * 2 * i2 * iF);
            int i5 = ((i3 * i) * 8) / iQ;
            rj2 rj2Var = new rj2();
            rj2Var.m = tv4.m("audio/raw");
            rj2Var.h = i5;
            rj2Var.i = i5;
            rj2Var.n = iMax * 2 * i2;
            rj2Var.E = i2;
            rj2Var.F = i;
            rj2Var.G = 2;
            this.l = new androidx.media3.common.b(rj2Var);
            return;
        }
        throw ParserException.a(null, "Expected frames per block: " + i4 + "; got: " + iQ);
    }
}

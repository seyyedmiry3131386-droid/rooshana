package androidx.compose.ui.node;

import defpackage.b96;
import defpackage.dp2;
import defpackage.js3;
import defpackage.pc3;
import defpackage.rd;
import defpackage.sd;
import defpackage.tx8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final b96 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public sd f;
    public boolean b = true;
    public final HashMap g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public a(sd sdVar) {
        this.a = (b96) sdVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [b96, sd] */
    public static final void a(a aVar, rd rdVar, int i, m mVar) {
        long jB;
        HashMap map = aVar.g;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = aVar.b(mVar, jB);
                mVar = mVar.s;
                js3.m(mVar);
                if (mVar.equals(aVar.a.f())) {
                    break loop0;
                }
            } while (!aVar.c(mVar).containsKey(rdVar));
            float fD = aVar.d(mVar, rdVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fD);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fD);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(rdVar instanceof pc3 ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32)));
        if (map.containsKey(rdVar)) {
            int iIntValue = ((Number) kotlin.collections.b.J(map, rdVar)).intValue();
            pc3 pc3Var = androidx.compose.ui.layout.a.a;
            iRound = ((Number) rdVar.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(rdVar, Integer.valueOf(iRound));
    }

    public abstract long b(m mVar, long j);

    public abstract Map c(m mVar);

    public abstract int d(m mVar, rd rdVar);

    public final boolean e() {
        return this.c || this.d || this.e;
    }

    public final boolean f() {
        i();
        return this.f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b96, sd] */
    public final void g() {
        this.b = true;
        ?? r0 = this.a;
        sd sdVarG = r0.g();
        if (sdVarG == null) {
            return;
        }
        if (this.c) {
            sdVarG.requestLayout();
        }
        if (this.d) {
            r0.N();
        }
        if (this.e) {
            r0.requestLayout();
        }
        sdVarG.c().g();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b96, sd] */
    public final void h() {
        HashMap map = this.g;
        map.clear();
        dp2 dp2Var = new dp2() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [b96, sd] */
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a aVar;
                sd sdVar = (sd) obj;
                if (sdVar.m() != Integer.MAX_VALUE) {
                    if (sdVar.c().b) {
                        sdVar.B();
                    }
                    Iterator it = sdVar.c().g.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        aVar = this.g;
                        if (!zHasNext) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        a.a(aVar, (rd) entry.getKey(), ((Number) entry.getValue()).intValue(), sdVar.f());
                    }
                    m mVar = sdVar.f().s;
                    js3.m(mVar);
                    while (!mVar.equals(aVar.a.f())) {
                        for (rd rdVar : aVar.c(mVar).keySet()) {
                            a.a(aVar, rdVar, aVar.d(mVar, rdVar), mVar);
                        }
                        mVar = mVar.s;
                        js3.m(mVar);
                    }
                }
                return tx8.a;
            }
        };
        ?? r2 = this.a;
        r2.e(dp2Var);
        map.putAll(c(r2.f()));
        this.b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [b96, sd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sd] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r2 = this;
            boolean r0 = r2.e()
            b96 r1 = r2.a
            if (r0 == 0) goto L9
            goto L51
        L9:
            sd r0 = r1.g()
            if (r0 != 0) goto L10
            goto L53
        L10:
            androidx.compose.ui.node.a r0 = r0.c()
            sd r1 = r0.f
            if (r1 == 0) goto L23
            androidx.compose.ui.node.a r0 = r1.c()
            boolean r0 = r0.e()
            if (r0 == 0) goto L23
            goto L51
        L23:
            sd r0 = r2.f
            if (r0 == 0) goto L53
            androidx.compose.ui.node.a r1 = r0.c()
            boolean r1 = r1.e()
            if (r1 == 0) goto L32
            goto L53
        L32:
            sd r1 = r0.g()
            if (r1 == 0) goto L41
            androidx.compose.ui.node.a r1 = r1.c()
            if (r1 == 0) goto L41
            r1.i()
        L41:
            sd r0 = r0.g()
            if (r0 == 0) goto L50
            androidx.compose.ui.node.a r0 = r0.c()
            if (r0 == 0) goto L50
            sd r1 = r0.f
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.a.i():void");
    }
}

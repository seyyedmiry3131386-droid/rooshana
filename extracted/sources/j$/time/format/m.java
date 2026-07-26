package j$.time.format;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements f {
    public final j$.time.temporal.p a;
    public final v b;
    public final b c;
    public volatile i d;

    public m(j$.time.temporal.p pVar, v vVar, b bVar) {
        this.a = pVar;
        this.b = vVar;
        this.c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        String strA;
        Long lA = pVar.a(this.a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) pVar.a.l(j$.time.temporal.q.b);
        if (mVar == null || mVar == j$.time.chrono.t.c) {
            b bVar = this.c;
            long jLongValue = lA.longValue();
            v vVar = this.b;
            Locale locale = pVar.b.b;
            strA = bVar.a.a(jLongValue, vVar);
        } else {
            b bVar2 = this.c;
            long jLongValue2 = lA.longValue();
            v vVar2 = this.b;
            Locale locale2 = pVar.b.b;
            strA = bVar2.a.a(jLongValue2, vVar2);
        }
        if (strA != null) {
            sb.append(strA);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, u.NORMAL);
        }
        return this.d.i(pVar, sb);
    }

    public final String toString() {
        v vVar = v.FULL;
        j$.time.temporal.p pVar = this.a;
        v vVar2 = this.b;
        if (vVar2 == vVar) {
            return "Text(" + pVar + ")";
        }
        return "Text(" + pVar + "," + vVar2 + ")";
    }
}

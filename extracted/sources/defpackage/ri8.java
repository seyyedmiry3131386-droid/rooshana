package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class ri8 {
    public final qi8 a;
    public final q95 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public ri8(qi8 qi8Var, q95 q95Var, long j) {
        this.a = qi8Var;
        this.b = q95Var;
        this.c = j;
        ArrayList arrayList = q95Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((l16) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            l16 l16Var = (l16) a.u0(arrayList);
            fD = l16Var.a.d.d(r4.g - 1) + l16Var.f;
        }
        this.e = fD;
        this.f = q95Var.g;
    }

    public final ResolvedTextDirection a(int i) {
        q95 q95Var = this.b;
        ArrayList arrayList = q95Var.h;
        q95Var.l(i);
        l16 l16Var = (l16) arrayList.get(i == ((ll) q95Var.a.b).b.length() ? br9.y(arrayList) : dt2.j(i, arrayList));
        return l16Var.a.d.f.isRtlCharAt(l16Var.d(i)) ? ResolvedTextDirection.b : ResolvedTextDirection.a;
    }

    public final sy6 b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        q95 q95Var = this.b;
        q95Var.k(i);
        ArrayList arrayList = q95Var.h;
        l16 l16Var = (l16) arrayList.get(dt2.j(i, arrayList));
        yg ygVar = l16Var.a;
        int iD = l16Var.d(i);
        CharSequence charSequence = ygVar.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbR = rm7.r(iD, "offset(", ") is out of bounds [0,");
            sbR.append(charSequence.length());
            sbR.append(')');
            sn3.a(sbR.toString());
        }
        pi8 pi8Var = ygVar.d;
        Layout layout = pi8Var.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = pi8Var.g(lineForOffset);
        float fE = pi8Var.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fH = pi8Var.i(iD, false);
                fH2 = pi8Var.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = pi8Var.h(iD, false);
                fH2 = pi8Var.h(iD + 1, true);
            } else {
                fI = pi8Var.i(iD, false);
                fI2 = pi8Var.i(iD + 1, true);
            }
            float f = fH;
            fI = fH2;
            fI2 = f;
        } else {
            fI = pi8Var.h(iD, false);
            fI2 = pi8Var.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return l16Var.a(new sy6(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final sy6 c(int i) {
        q95 q95Var = this.b;
        ArrayList arrayList = q95Var.h;
        q95Var.l(i);
        l16 l16Var = (l16) arrayList.get(i == ((ll) q95Var.a.b).b.length() ? br9.y(arrayList) : dt2.j(i, arrayList));
        yg ygVar = l16Var.a;
        int iD = l16Var.d(i);
        CharSequence charSequence = ygVar.e;
        pi8 pi8Var = ygVar.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbR = rm7.r(iD, "offset(", ") is out of bounds [0,");
            sbR.append(charSequence.length());
            sbR.append(']');
            sn3.a(sbR.toString());
        }
        float fH = pi8Var.h(iD, false);
        int lineForOffset = pi8Var.f.getLineForOffset(iD);
        return l16Var.a(new sy6(fH, pi8Var.g(lineForOffset), fH, pi8Var.e(lineForOffset)));
    }

    public final float d(int i) {
        q95 q95Var = this.b;
        q95Var.m(i);
        ArrayList arrayList = q95Var.h;
        l16 l16Var = (l16) arrayList.get(dt2.k(i, arrayList));
        yg ygVar = l16Var.a;
        int i2 = i - l16Var.d;
        pi8 pi8Var = ygVar.d;
        return pi8Var.f.getLineLeft(i2) + (i2 == pi8Var.g + (-1) ? pi8Var.j : 0.0f);
    }

    public final float e(int i) {
        q95 q95Var = this.b;
        q95Var.m(i);
        ArrayList arrayList = q95Var.h;
        l16 l16Var = (l16) arrayList.get(dt2.k(i, arrayList));
        yg ygVar = l16Var.a;
        int i2 = i - l16Var.d;
        pi8 pi8Var = ygVar.d;
        return pi8Var.f.getLineRight(i2) + (i2 == pi8Var.g + (-1) ? pi8Var.k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri8)) {
            return false;
        }
        ri8 ri8Var = (ri8) obj;
        return js3.i(this.a, ri8Var.a) && this.b.equals(ri8Var.b) && zq3.b(this.c, ri8Var.c) && this.d == ri8Var.d && this.e == ri8Var.e && js3.i(this.f, ri8Var.f);
    }

    public final int f(int i) {
        q95 q95Var = this.b;
        q95Var.m(i);
        ArrayList arrayList = q95Var.h;
        l16 l16Var = (l16) arrayList.get(dt2.k(i, arrayList));
        yg ygVar = l16Var.a;
        return ygVar.d.f.getLineStart(i - l16Var.d) + l16Var.b;
    }

    public final ResolvedTextDirection g(int i) {
        q95 q95Var = this.b;
        ArrayList arrayList = q95Var.h;
        q95Var.l(i);
        l16 l16Var = (l16) arrayList.get(i == ((ll) q95Var.a.b).b.length() ? br9.y(arrayList) : dt2.j(i, arrayList));
        yg ygVar = l16Var.a;
        int iD = l16Var.d(i);
        pi8 pi8Var = ygVar.d;
        return pi8Var.f.getParagraphDirection(pi8Var.f.getLineForOffset(iD)) == 1 ? ResolvedTextDirection.a : ResolvedTextDirection.b;
    }

    public final eh h(int i, int i2) {
        q95 q95Var = this.b;
        ll llVar = (ll) q95Var.a.b;
        if (i < 0 || i > i2 || i2 > llVar.b.length()) {
            StringBuilder sbB = bl4.B(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbB.append(llVar.b.length());
            sbB.append("), or start > end!");
            sn3.a(sbB.toString());
        }
        if (i == i2) {
            return gh.a();
        }
        eh ehVarA = gh.a();
        dt2.m(q95Var.h, uy6.b(i, i2), new uo3(ehVarA, i, i2, 3));
        return ehVarA;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        long j = this.c;
        return this.f.hashCode() + dw1.g(this.e, dw1.g(this.d, (((int) (j ^ (j >>> 32))) + iHashCode) * 31, 31), 31);
    }

    public final long i(int i) {
        int iV;
        int iQ;
        int iQ2;
        q95 q95Var = this.b;
        ArrayList arrayList = q95Var.h;
        q95Var.l(i);
        l16 l16Var = (l16) arrayList.get(i == ((ll) q95Var.a.b).b.length() ? br9.y(arrayList) : dt2.j(i, arrayList));
        yg ygVar = l16Var.a;
        int iD = l16Var.d(i);
        aj0 aj0VarJ = ygVar.d.j();
        if (aj0VarJ.p(aj0VarJ.v(iD))) {
            aj0VarJ.d(iD);
            iV = iD;
            while (iV != -1 && (!aj0VarJ.p(iV) || aj0VarJ.l(iV))) {
                iV = aj0VarJ.v(iV);
            }
        } else {
            aj0VarJ.d(iD);
            iV = aj0VarJ.o(iD) ? (!aj0VarJ.m(iD) || aj0VarJ.j(iD)) ? aj0VarJ.v(iD) : iD : aj0VarJ.j(iD) ? aj0VarJ.v(iD) : -1;
        }
        if (iV == -1) {
            iV = iD;
        }
        if (aj0VarJ.l(aj0VarJ.q(iD))) {
            aj0VarJ.d(iD);
            iQ = iD;
            while (iQ != -1 && (aj0VarJ.p(iQ) || !aj0VarJ.l(iQ))) {
                iQ = aj0VarJ.q(iQ);
            }
        } else {
            aj0VarJ.d(iD);
            if (aj0VarJ.j(iD)) {
                if (!aj0VarJ.m(iD) || aj0VarJ.o(iD)) {
                    iQ2 = aj0VarJ.q(iD);
                    iQ = iQ2;
                } else {
                    iQ = iD;
                }
            } else if (aj0VarJ.o(iD)) {
                iQ2 = aj0VarJ.q(iD);
                iQ = iQ2;
            } else {
                iQ = -1;
            }
        }
        if (iQ != -1) {
            iD = iQ;
        }
        return l16Var.b(uy6.b(iV, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) zq3.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}

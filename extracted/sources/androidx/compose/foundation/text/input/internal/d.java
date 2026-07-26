package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.bt2;
import defpackage.do3;
import defpackage.dp2;
import defpackage.i3;
import defpackage.js3;
import defpackage.ok4;
import defpackage.pk4;
import defpackage.q3;
import defpackage.rf0;
import defpackage.ri8;
import defpackage.rr5;
import defpackage.s08;
import defpackage.sy6;
import defpackage.uy6;
import defpackage.v04;
import defpackage.zh8;
import defpackage.zi8;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final dp2 a;
    public final do3 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public zh8 j;
    public ri8 k;
    public rr5 l;
    public sy6 m;
    public sy6 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = pk4.a();
    public final Matrix q = new Matrix();

    public d(dp2 dp2Var, do3 do3Var) {
        this.a = dp2Var;
        this.b = do3Var;
    }

    public final void a() {
        boolean z;
        do3 do3Var = this.b;
        InputMethodManager inputMethodManagerQ = do3Var.q();
        View view = (View) do3Var.a;
        if (!inputMethodManagerQ.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        pk4.d(fArr);
        v04 v04Var = (v04) ((s08) ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1) this.a).a.r).getValue();
        if (v04Var != null) {
            if (!v04Var.h()) {
                v04Var = null;
            }
            if (v04Var != null) {
                v04Var.i(fArr);
            }
        }
        sy6 sy6Var = this.n;
        js3.m(sy6Var);
        float f = -sy6Var.a;
        sy6 sy6Var2 = this.n;
        js3.m(sy6Var2);
        pk4.f(fArr, f, -sy6Var2.b);
        Matrix matrix = this.q;
        bt2.S(matrix, fArr);
        zh8 zh8Var = this.j;
        js3.m(zh8Var);
        long j = zh8Var.b;
        rr5 rr5Var = this.l;
        js3.m(rr5Var);
        ri8 ri8Var = this.k;
        js3.m(ri8Var);
        sy6 sy6Var3 = this.m;
        js3.m(sy6Var3);
        sy6 sy6Var4 = this.n;
        js3.m(sy6Var4);
        boolean z2 = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        boolean z5 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        zi8 zi8Var = zh8Var.c;
        int iG = zi8.g(j);
        builder.setSelectionRange(iG, zi8.f(j));
        if (!z2 || iG < 0) {
            z = z3;
        } else {
            int iQ = rr5Var.q(iG);
            sy6 sy6VarC = ri8Var.c(iQ);
            z = z3;
            float fS = ok4.s(sy6VarC.a, 0.0f, (int) (ri8Var.c >> 32));
            boolean zP = rf0.p(sy6Var3, fS, sy6VarC.b);
            boolean zP2 = rf0.p(sy6Var3, fS, sy6VarC.d);
            boolean z6 = ri8Var.a(iQ) == ResolvedTextDirection.b;
            int i = (zP || zP2) ? 1 : 0;
            if (!zP || !zP2) {
                i |= 2;
            }
            if (z6) {
                i |= 4;
            }
            int i2 = i;
            float f2 = sy6VarC.b;
            float f3 = sy6VarC.d;
            builder.setInsertionMarkerLocation(fS, f2, f3, f3, i2);
        }
        if (z) {
            int iG2 = zi8Var != null ? zi8.g(zi8Var.a) : -1;
            int iF = zi8Var != null ? zi8.f(zi8Var.a) : -1;
            if (iG2 >= 0 && iG2 < iF) {
                builder.setComposingText(iG2, zh8Var.a.b.subSequence(iG2, iF));
                int iQ2 = rr5Var.q(iG2);
                int iQ3 = rr5Var.q(iF);
                float[] fArr2 = new float[(iQ3 - iQ2) * 4];
                ri8Var.b.a(uy6.b(iQ2, iQ3), fArr2);
                int i3 = iG2;
                while (i3 < iF) {
                    int iQ4 = rr5Var.q(i3);
                    int i4 = (iQ4 - iQ2) * 4;
                    float f4 = fArr2[i4];
                    int i5 = iF;
                    float f5 = fArr2[i4 + 1];
                    int i6 = iQ2;
                    float f6 = fArr2[i4 + 2];
                    float f7 = fArr2[i4 + 3];
                    int i7 = i3;
                    int i8 = (sy6Var3.a < f6 ? 1 : 0) & (f4 < sy6Var3.c ? 1 : 0) & (sy6Var3.b < f7 ? 1 : 0) & (f5 < sy6Var3.d ? 1 : 0);
                    if (!rf0.p(sy6Var3, f4, f5) || !rf0.p(sy6Var3, f6, f7)) {
                        i8 |= 2;
                    }
                    if (ri8Var.a(iQ4) == ResolvedTextDirection.b) {
                        i8 |= 4;
                    }
                    builder.addCharacterBounds(i7, f4, f5, f6, f7, i8);
                    i3 = i7 + 1;
                    iF = i5;
                    iQ2 = i6;
                }
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33 && z4) {
            q3.r(builder, sy6Var4);
        }
        if (i9 >= 34 && z5) {
            i3.b(builder, ri8Var, sy6Var3);
        }
        do3Var.q().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}

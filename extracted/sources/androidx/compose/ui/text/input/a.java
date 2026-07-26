package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.i3;
import defpackage.js3;
import defpackage.ok4;
import defpackage.pk4;
import defpackage.q3;
import defpackage.ri8;
import defpackage.rr5;
import defpackage.sy6;
import defpackage.tx8;
import defpackage.uy6;
import defpackage.wn5;
import defpackage.zh8;
import defpackage.zi8;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final AndroidComposeView a;
    public final b b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public zh8 j;
    public ri8 k;
    public rr5 l;
    public sy6 n;
    public sy6 o;
    public final Object c = new Object();
    public dp2 m = new dp2() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        @Override // defpackage.dp2
        public final /* synthetic */ Object invoke(Object obj) {
            float[] fArr = ((pk4) obj).a;
            return tx8.a;
        }
    };
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = pk4.a();
    public final Matrix r = new Matrix();

    public a(AndroidComposeView androidComposeView, b bVar) {
        this.a = androidComposeView;
        this.b = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c24, java.lang.Object] */
    public final void a() {
        boolean z;
        b bVar = this.b;
        ?? r2 = bVar.b;
        InputMethodManager inputMethodManager = (InputMethodManager) r2.getValue();
        View view = bVar.a;
        if (inputMethodManager.isActive(view)) {
            dp2 dp2Var = this.m;
            float[] fArr = this.q;
            dp2Var.invoke(new pk4(fArr));
            this.a.r(fArr);
            Matrix matrix = this.r;
            bt2.S(matrix, fArr);
            zh8 zh8Var = this.j;
            js3.m(zh8Var);
            long j = zh8Var.b;
            rr5 rr5Var = this.l;
            js3.m(rr5Var);
            ri8 ri8Var = this.k;
            js3.m(ri8Var);
            sy6 sy6Var = this.n;
            js3.m(sy6Var);
            sy6 sy6Var2 = this.o;
            js3.m(sy6Var2);
            boolean z2 = this.f;
            boolean z3 = this.g;
            boolean z4 = this.h;
            boolean z5 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
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
                boolean zU = wn5.u(sy6Var, fS, sy6VarC.b);
                boolean zU2 = wn5.u(sy6Var, fS, sy6VarC.d);
                boolean z6 = ri8Var.a(iQ) == ResolvedTextDirection.b;
                int i = (zU || zU2) ? 1 : 0;
                if (!zU || !zU2) {
                    i |= 2;
                }
                if (z6) {
                    i |= 4;
                }
                int i2 = i;
                float f = sy6VarC.b;
                float f2 = sy6VarC.d;
                builder.setInsertionMarkerLocation(fS, f, f2, f2, i2);
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
                        float f3 = fArr2[i4];
                        int i5 = iF;
                        float f4 = fArr2[i4 + 1];
                        int i6 = iQ2;
                        float f5 = fArr2[i4 + 2];
                        float f6 = fArr2[i4 + 3];
                        int i7 = i3;
                        int i8 = (sy6Var.a < f5 ? 1 : 0) & (f3 < sy6Var.c ? 1 : 0) & (sy6Var.b < f6 ? 1 : 0) & (f4 < sy6Var.d ? 1 : 0);
                        if (!wn5.u(sy6Var, f3, f4) || !wn5.u(sy6Var, f5, f6)) {
                            i8 |= 2;
                        }
                        if (ri8Var.a(iQ4) == ResolvedTextDirection.b) {
                            i8 |= 4;
                        }
                        builder.addCharacterBounds(i7, f3, f4, f5, f6, i8);
                        i3 = i7 + 1;
                        iF = i5;
                        iQ2 = i6;
                    }
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33 && z4) {
                q3.q(builder, sy6Var2);
            }
            if (i9 >= 34 && z5) {
                i3.a(builder, ri8Var, sy6Var);
            }
            ((InputMethodManager) r2.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}

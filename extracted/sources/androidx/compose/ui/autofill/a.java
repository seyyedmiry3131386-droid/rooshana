package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.dp2;
import defpackage.e3;
import defpackage.en7;
import defpackage.fn7;
import defpackage.gn7;
import defpackage.k30;
import defpackage.kg2;
import defpackage.l30;
import defpackage.lb7;
import defpackage.mn7;
import defpackage.rb5;
import defpackage.sp2;
import defpackage.t61;
import defpackage.tx8;
import defpackage.y32;
import defpackage.y40;
import defpackage.za5;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l30 implements gn7, kg2 {
    public final k30 a;
    public final mn7 b;
    public final AndroidComposeView c;
    public final androidx.compose.ui.spatial.a d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final za5 h;
    public boolean i;

    public a(k30 k30Var, mn7 mn7Var, AndroidComposeView androidComposeView, androidx.compose.ui.spatial.a aVar, String str) {
        this.a = k30Var;
        this.b = mn7Var;
        this.c = androidComposeView;
        this.d = aVar;
        this.e = str;
        androidComposeView.setImportantForAutofill(1);
        k30 k30VarD = lb7.d(androidComposeView);
        AutofillId autofillId = k30VarD != null ? (AutofillId) k30VarD.a : null;
        if (autofillId == null) {
            throw t61.r("Required value was null.");
        }
        this.g = autofillId;
        this.h = new za5();
    }

    @Override // defpackage.kg2
    public final void a(d dVar, d dVar2) {
        h hVarH;
        en7 en7VarH;
        h hVarH2;
        en7 en7VarH2;
        if (dVar != null && (hVarH2 = y40.H(dVar)) != null && (en7VarH2 = hVarH2.H()) != null) {
            rb5 rb5Var = en7VarH2.a;
            if (rb5Var.b(androidx.compose.ui.semantics.a.g) || rb5Var.b(androidx.compose.ui.semantics.a.h)) {
                this.a.g(this.c, hVarH2.b);
            }
        }
        if (dVar2 == null || (hVarH = y40.H(dVar2)) == null || (en7VarH = hVarH.H()) == null) {
            return;
        }
        rb5 rb5Var2 = en7VarH.a;
        if (rb5Var2.b(androidx.compose.ui.semantics.a.g) || rb5Var2.b(androidx.compose.ui.semantics.a.h)) {
            final int i = hVarH.b;
            this.d.a.y(i, new sp2() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // defpackage.sp2
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Number) obj).intValue();
                    int iIntValue2 = ((Number) obj2).intValue();
                    int iIntValue3 = ((Number) obj3).intValue();
                    int iIntValue4 = ((Number) obj4).intValue();
                    a aVar = this.g;
                    aVar.a.f(aVar.c, i, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
                    return tx8.a;
                }
            });
        }
    }

    public final void b(SparseArray sparseArray) {
        en7 en7VarH;
        dp2 dp2Var;
        dp2 dp2Var2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueH = y32.h(sparseArray.get(iKeyAt));
            fn7 fn7Var = (fn7) this.b.c.b(iKeyAt);
            if (fn7Var != null && (en7VarH = ((h) fn7Var).H()) != null) {
                e3 e3Var = (e3) androidx.compose.ui.semantics.b.a(en7VarH, androidx.compose.ui.semantics.a.g);
                if (e3Var != null && (dp2Var2 = (dp2) e3Var.b) != null) {
                }
                e3 e3Var2 = (e3) androidx.compose.ui.semantics.b.a(en7VarH, androidx.compose.ui.semantics.a.h);
                if (e3Var2 != null && (dp2Var = (dp2) e3Var2.b) != null) {
                }
            }
        }
    }

    public final void c(final h hVar) {
        this.d.a.y(hVar.b, new sp2() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // defpackage.sp2
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                int iIntValue3 = ((Number) obj3).intValue();
                int iIntValue4 = ((Number) obj4).intValue();
                a aVar = this.g;
                Rect rect = aVar.f;
                rect.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                aVar.a.i(aVar.c, hVar.b, rect);
                return tx8.a;
            }
        });
    }
}

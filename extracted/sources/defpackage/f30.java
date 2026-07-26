package defpackage;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class f30 {
    public static AutofillValue a(String str) {
        return AutofillValue.forText(str);
    }

    public static AutofillValue b(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static void c(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void d(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public static void e(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public static void f(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void g(ViewStructure viewStructure, boolean z) {
        viewStructure.setDataIsSensitive(z);
    }

    public static void h(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }
}

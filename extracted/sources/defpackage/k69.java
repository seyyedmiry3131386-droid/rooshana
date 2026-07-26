package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class k69 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(i);
    }
}

package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class mf {
    public static final mf a = new mf();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(lf.a);
    }
}

package defpackage;

import android.view.View;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public final class hf {
    public static final hf a = new hf();

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}

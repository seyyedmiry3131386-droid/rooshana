package androidx.core.view;

import android.view.View;
import defpackage.dw;
import defpackage.ho7;
import defpackage.mo7;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final dw a(View view) {
        return new dw(new ViewKt$allViews$1(view, null));
    }

    public static final ho7 b(View view) {
        return mo7.s(ViewKt$ancestors$1.a, view.getParent());
    }
}

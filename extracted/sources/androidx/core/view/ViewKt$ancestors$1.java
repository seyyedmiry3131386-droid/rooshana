package androidx.core.view;

import android.view.ViewParent;
import defpackage.dp2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements dp2 {
    public static final ViewKt$ancestors$1 a = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}

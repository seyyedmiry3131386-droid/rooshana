package com.microsoft.clarity.g;

import android.view.View;
import defpackage.dp2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.microsoft.clarity.g.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0071s extends FunctionReferenceImpl implements dp2 {
    public C0071s(C0076x c0076x) {
        super(1, c0076x, C0076x.class, "isVisibleRootView", "isVisibleRootView(Landroid/view/View;)Z", 0);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return Boolean.valueOf(C0076x.a((C0076x) this.receiver, (View) obj));
    }
}

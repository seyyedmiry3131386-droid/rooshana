package com.microsoft.clarity.g;

import android.view.View;
import defpackage.dp2;
import defpackage.js3;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.g.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0075w extends Lambda implements dp2 {
    public final /* synthetic */ View a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075w(View view) {
        super(1);
        this.a = view;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        js3.p(weakReference, "it");
        return Boolean.valueOf(js3.i(weakReference.get(), this.a));
    }
}

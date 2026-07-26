package com.microsoft.clarity.g;

import defpackage.dp2;
import defpackage.js3;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.g.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0068o extends Lambda implements dp2 {
    public static final C0068o a = new C0068o();

    public C0068o() {
        super(1);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        js3.p(weakReference, "r");
        return Boolean.valueOf(weakReference.get() == null);
    }
}

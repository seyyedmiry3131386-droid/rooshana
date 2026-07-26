package com.microsoft.clarity.g;

import android.graphics.Bitmap;
import defpackage.js3;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class B {
    public final Bitmap a;
    public final WeakReference b;
    public long c;

    public B(Bitmap bitmap, WeakReference weakReference, long j) {
        js3.p(bitmap, "bitmap");
        js3.p(weakReference, "hwBitmapRef");
        this.a = bitmap;
        this.b = weakReference;
        this.c = j;
    }
}

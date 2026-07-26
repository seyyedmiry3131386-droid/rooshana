package com.microsoft.clarity.g;

import android.graphics.Bitmap;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends Lambda implements bp2 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ E b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Bitmap bitmap, E e, int i) {
        super(0);
        this.a = bitmap;
        this.b = e;
        this.c = i;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        tx8 tx8Var;
        Bitmap bitmapCopy = this.a.copy(Bitmap.Config.ARGB_8888, false);
        E e = this.b;
        Object obj = e.c;
        int i = this.c;
        Bitmap bitmap = this.a;
        synchronized (obj) {
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = e.b;
            js3.o(bitmapCopy, "bitmapCopy");
            linkedHashMap.put(numValueOf, new B(bitmapCopy, new WeakReference(bitmap), System.currentTimeMillis()));
            tx8Var = tx8.a;
        }
        return tx8Var;
    }
}

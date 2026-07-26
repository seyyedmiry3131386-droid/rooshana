package io.sentry.android.core.internal.threaddump;

import android.graphics.Bitmap;
import defpackage.js3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final int a;
    public int b;
    public final Object c;

    public b(ArrayList arrayList) {
        this.c = arrayList;
        this.a = arrayList.size();
    }

    public a a() {
        int i = this.b;
        if (i < 0 || i >= this.a) {
            return null;
        }
        ArrayList arrayList = (ArrayList) this.c;
        this.b = i + 1;
        return (a) arrayList.get(i);
    }

    public b(Bitmap bitmap, int i, int i2) {
        js3.p(bitmap, "bitmap");
        this.c = bitmap;
        this.a = i;
        this.b = i2;
    }
}

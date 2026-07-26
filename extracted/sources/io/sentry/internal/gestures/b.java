package io.sentry.internal.gestures;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final WeakReference a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public b(View view, String str, String str2, String str3, String str4) {
        this.a = new WeakReference(view);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (io.sentry.config.a.t(this.b, bVar.b) && io.sentry.config.a.t(this.c, bVar.c) && io.sentry.config.a.t(this.d, bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.d});
    }
}

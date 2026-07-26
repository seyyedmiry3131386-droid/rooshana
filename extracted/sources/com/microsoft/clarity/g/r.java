package com.microsoft.clarity.g;

import android.view.Window;
import defpackage.bt2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Comparator {
    public final /* synthetic */ C0070q a;

    public r(C0070q c0070q) {
        this.a = c0070q;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : bt2.t(Boolean.valueOf(((Window) obj).isFloating()), Boolean.valueOf(((Window) obj2).isFloating()));
    }
}

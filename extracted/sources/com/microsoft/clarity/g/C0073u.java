package com.microsoft.clarity.g;

import android.view.View;
import defpackage.bt2;
import java.util.Comparator;

/* JADX INFO: renamed from: com.microsoft.clarity.g.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0073u implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return bt2.t(Float.valueOf(((View) obj).getZ()), Float.valueOf(((View) obj2).getZ()));
    }
}

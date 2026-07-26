package com.microsoft.clarity.g;

import android.view.Window;
import defpackage.bt2;
import java.util.Comparator;

/* JADX INFO: renamed from: com.microsoft.clarity.g.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0070q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return bt2.t(Float.valueOf(((Window) obj).getDecorView().getZ()), Float.valueOf(((Window) obj2).getDecorView().getZ()));
    }
}

package com.microsoft.clarity.g;

import defpackage.bt2;
import java.util.Comparator;

/* JADX INFO: renamed from: com.microsoft.clarity.g.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0058e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return bt2.t(Integer.valueOf(((String) obj).length()), Integer.valueOf(((String) obj2).length()));
    }
}

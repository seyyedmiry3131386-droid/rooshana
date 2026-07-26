package com.microsoft.clarity.g;

import defpackage.bt2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return bt2.t(Integer.valueOf(((m0) obj2).a), Integer.valueOf(((m0) obj).a));
    }
}

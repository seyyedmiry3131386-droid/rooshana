package com.microsoft.clarity.g;

import defpackage.bt2;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return bt2.t(Long.valueOf(((B) ((Map.Entry) obj2).getValue()).c), Long.valueOf(((B) ((Map.Entry) obj).getValue()).c));
    }
}

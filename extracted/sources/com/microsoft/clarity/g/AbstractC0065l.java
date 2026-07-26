package com.microsoft.clarity.g;

import com.microsoft.clarity.models.ApplicationFramework;

/* JADX INFO: renamed from: com.microsoft.clarity.g.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0065l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ApplicationFramework.values().length];
        try {
            iArr[ApplicationFramework.Native.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApplicationFramework.ReactNative.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

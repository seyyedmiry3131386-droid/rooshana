package com.microsoft.clarity.n;

import com.microsoft.clarity.models.AssetType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AssetType.values().length];
        try {
            iArr[AssetType.Typeface.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AssetType.Image.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AssetType.Web.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AssetType.Unsupported.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}

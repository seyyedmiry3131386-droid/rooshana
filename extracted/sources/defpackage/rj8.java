package defpackage;

import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.theme.ThemeStyle;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class rj8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ThemeMode.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ThemeMode themeMode = ThemeMode.a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ThemeStyle.values().length];
        try {
            iArr2[ThemeStyle.h.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ThemeStyle.i.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ThemeStyle.m.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ThemeStyle.n.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ThemeStyle.l.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ThemeStyle.k.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ThemeStyle.j.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
    }
}

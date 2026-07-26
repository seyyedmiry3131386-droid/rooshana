package com.microsoft.clarity.models.project;

import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public enum UrlFilterType {
    Unknown(0),
    IsExactly(1),
    StartsWith(2),
    EndsWith(3),
    Contains(4);

    public static final Companion Companion = new Companion(null);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final UrlFilterType fromInt(int i) {
            UrlFilterType urlFilterType;
            UrlFilterType[] urlFilterTypeArrValues = UrlFilterType.values();
            int length = urlFilterTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    urlFilterType = null;
                    break;
                }
                urlFilterType = urlFilterTypeArrValues[i2];
                if (urlFilterType.getValue() == i) {
                    break;
                }
                i2++;
            }
            return urlFilterType == null ? UrlFilterType.Unknown : urlFilterType;
        }

        private Companion() {
        }
    }

    UrlFilterType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}

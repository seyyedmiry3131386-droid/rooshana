package com.microsoft.clarity.models.project;

import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public enum ImageCompressionFormat {
    Unknown(0),
    PNG(1),
    WEBP_LOSSY(2);

    public static final Companion Companion = new Companion(null);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final ImageCompressionFormat fromInt(int i) {
            ImageCompressionFormat imageCompressionFormat;
            ImageCompressionFormat[] imageCompressionFormatArrValues = ImageCompressionFormat.values();
            int length = imageCompressionFormatArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    imageCompressionFormat = null;
                    break;
                }
                imageCompressionFormat = imageCompressionFormatArrValues[i2];
                if (imageCompressionFormat.getValue() == i) {
                    break;
                }
                i2++;
            }
            return imageCompressionFormat == null ? ImageCompressionFormat.Unknown : imageCompressionFormat;
        }

        private Companion() {
        }
    }

    ImageCompressionFormat(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}

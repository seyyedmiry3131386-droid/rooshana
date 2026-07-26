package com.microsoft.clarity.models.project;

import defpackage.js3;
import defpackage.yd1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageCompressionConfig {
    public static final Companion Companion = new Companion(null);
    private final ImageCompressionFormat format;
    private final int quality;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final ImageCompressionConfig fromJson(JSONObject jSONObject) {
            js3.p(jSONObject, "json");
            return new ImageCompressionConfig(ImageCompressionFormat.Companion.fromInt(jSONObject.getInt("format")), jSONObject.getInt("quality"));
        }

        private Companion() {
        }
    }

    public ImageCompressionConfig(ImageCompressionFormat imageCompressionFormat, int i) {
        js3.p(imageCompressionFormat, "format");
        this.format = imageCompressionFormat;
        this.quality = i;
    }

    public final ImageCompressionFormat getFormat() {
        return this.format;
    }

    public final int getQuality() {
        return this.quality;
    }
}

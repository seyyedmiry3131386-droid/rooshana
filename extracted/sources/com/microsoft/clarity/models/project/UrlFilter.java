package com.microsoft.clarity.models.project;

import defpackage.f88;
import defpackage.js3;
import defpackage.m88;
import defpackage.yd1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlFilter {
    public static final Companion Companion = new Companion(null);
    private final UrlFilterType pattern;
    private final String url;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final UrlFilter fromJson(String str) throws JSONException {
            js3.p(str, "jsonString");
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            js3.o(string, "json.getString(\"url\")");
            return new UrlFilter(string, UrlFilterType.Companion.fromInt(jSONObject.getInt("pattern")));
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UrlFilterType.values().length];
            try {
                iArr[UrlFilterType.IsExactly.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UrlFilterType.StartsWith.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UrlFilterType.EndsWith.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UrlFilterType.Contains.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UrlFilter(String str, UrlFilterType urlFilterType) {
        js3.p(str, "url");
        js3.p(urlFilterType, "pattern");
        this.url = str;
        this.pattern = urlFilterType;
    }

    public final UrlFilterType getPattern() {
        return this.pattern;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean matches(String str) {
        js3.p(str, "urlString");
        int i = WhenMappings.$EnumSwitchMapping$0[this.pattern.ordinal()];
        if (i == 1) {
            return js3.i(this.url, str);
        }
        if (i == 2) {
            return m88.Z(str, this.url, false);
        }
        if (i == 3) {
            return m88.S(str, this.url, false);
        }
        if (i != 4) {
            return false;
        }
        return f88.c0(str, this.url, false);
    }

    public String toString() {
        return "{\"url\": \"" + this.url + "\", \"pattern\": " + this.pattern.getValue() + '}';
    }
}

package com.microsoft.clarity.models.project;

import com.microsoft.clarity.models.project.UrlFilter;
import defpackage.js3;
import defpackage.yd1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewCaptureConfig {
    public static final Companion Companion = new Companion(null);
    private final List<UrlFilter> allowedUrls;
    private final boolean disableCapture;
    private final List<UrlFilter> disallowedUrls;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final WebViewCaptureConfig fromJson(JSONObject jSONObject) throws JSONException {
            js3.p(jSONObject, "json");
            boolean z = jSONObject.getBoolean("disableCapture");
            UrlFilter.Companion companion = UrlFilter.Companion;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("allowedUrls");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArrayOptJSONArray.getJSONObject(i).toString();
                    js3.o(string, "it.getJSONObject(i).toString()");
                    arrayList.add(companion.fromJson(string));
                }
            }
            UrlFilter.Companion companion2 = UrlFilter.Companion;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("disallowedUrls");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray2 != null) {
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    String string2 = jSONArrayOptJSONArray2.getJSONObject(i2).toString();
                    js3.o(string2, "it.getJSONObject(i).toString()");
                    arrayList2.add(companion2.fromJson(string2));
                }
            }
            return new WebViewCaptureConfig(z, arrayList, arrayList2);
        }

        private Companion() {
        }
    }

    public WebViewCaptureConfig(boolean z, List<UrlFilter> list, List<UrlFilter> list2) {
        js3.p(list, "allowedUrls");
        js3.p(list2, "disallowedUrls");
        this.disableCapture = z;
        this.allowedUrls = list;
        this.disallowedUrls = list2;
    }

    public final List<UrlFilter> getAllowedUrls() {
        return this.allowedUrls;
    }

    public final boolean getDisableCapture() {
        return this.disableCapture;
    }

    public final List<UrlFilter> getDisallowedUrls() {
        return this.disallowedUrls;
    }
}

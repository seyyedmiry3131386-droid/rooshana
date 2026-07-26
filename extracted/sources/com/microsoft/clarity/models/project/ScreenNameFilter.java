package com.microsoft.clarity.models.project;

import defpackage.dw1;
import defpackage.js3;
import defpackage.yd1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenNameFilter {
    public static final Companion Companion = new Companion(null);
    private final String screenName;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final ScreenNameFilter fromJson(String str) throws JSONException {
            js3.p(str, "jsonString");
            String string = new JSONObject(str).getString("screenName");
            js3.o(string, "json.getString(\"screenName\")");
            return new ScreenNameFilter(string);
        }

        private Companion() {
        }
    }

    public ScreenNameFilter(String str) {
        js3.p(str, "screenName");
        this.screenName = str;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public String toString() {
        return dw1.s(new StringBuilder("{\"screenName\": \""), this.screenName, "\"}");
    }
}

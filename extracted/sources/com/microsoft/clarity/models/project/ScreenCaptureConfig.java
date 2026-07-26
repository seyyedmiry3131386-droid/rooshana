package com.microsoft.clarity.models.project;

import com.microsoft.clarity.models.project.ScreenNameFilter;
import defpackage.js3;
import defpackage.yd1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenCaptureConfig {
    public static final Companion Companion = new Companion(null);
    private final List<ScreenNameFilter> allowedScreens;
    private final List<ScreenNameFilter> disallowedScreens;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final ScreenCaptureConfig fromJson(JSONObject jSONObject) {
            js3.p(jSONObject, "json");
            ScreenNameFilter.Companion companion = ScreenNameFilter.Companion;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("allowedScreens");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArrayOptJSONArray.getJSONObject(i).toString();
                    js3.o(string, "it.getJSONObject(i).toString()");
                    arrayList.add(companion.fromJson(string));
                }
            }
            ScreenNameFilter.Companion companion2 = ScreenNameFilter.Companion;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("disallowedScreens");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray2 != null) {
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    String string2 = jSONArrayOptJSONArray2.getJSONObject(i2).toString();
                    js3.o(string2, "it.getJSONObject(i).toString()");
                    arrayList2.add(companion2.fromJson(string2));
                }
            }
            return new ScreenCaptureConfig(arrayList, arrayList2);
        }

        private Companion() {
        }
    }

    public ScreenCaptureConfig(List<ScreenNameFilter> list, List<ScreenNameFilter> list2) {
        js3.p(list, "allowedScreens");
        js3.p(list2, "disallowedScreens");
        this.allowedScreens = list;
        this.disallowedScreens = list2;
    }

    public final List<ScreenNameFilter> getAllowedScreens() {
        return this.allowedScreens;
    }

    public final List<ScreenNameFilter> getDisallowedScreens() {
        return this.disallowedScreens;
    }
}

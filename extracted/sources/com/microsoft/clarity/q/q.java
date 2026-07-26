package com.microsoft.clarity.q;

import defpackage.js3;
import defpackage.m88;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    public static String a(String str) {
        js3.p(str, "string");
        return m88.X(m88.X(m88.X(m88.X(str, "\\", "\\\\"), "\"", "\\\""), "\r\n", " "), "\n", " ");
    }

    public static Set a(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                js3.o(string, "jsonArray.getString(i)");
                linkedHashSet.add(string);
            }
            return linkedHashSet;
        }
        return EmptySet.a;
    }
}

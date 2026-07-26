package com.google.gson.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class JsonToken {
    public static final JsonToken a;
    public static final JsonToken b;
    public static final JsonToken c;
    public static final JsonToken d;
    public static final JsonToken e;
    public static final JsonToken f;
    public static final JsonToken g;
    public static final JsonToken h;
    public static final JsonToken i;
    public static final JsonToken j;
    public static final /* synthetic */ JsonToken[] k;

    static {
        JsonToken jsonToken = new JsonToken("BEGIN_ARRAY", 0);
        a = jsonToken;
        JsonToken jsonToken2 = new JsonToken("END_ARRAY", 1);
        b = jsonToken2;
        JsonToken jsonToken3 = new JsonToken("BEGIN_OBJECT", 2);
        c = jsonToken3;
        JsonToken jsonToken4 = new JsonToken("END_OBJECT", 3);
        d = jsonToken4;
        JsonToken jsonToken5 = new JsonToken("NAME", 4);
        e = jsonToken5;
        JsonToken jsonToken6 = new JsonToken("STRING", 5);
        f = jsonToken6;
        JsonToken jsonToken7 = new JsonToken("NUMBER", 6);
        g = jsonToken7;
        JsonToken jsonToken8 = new JsonToken("BOOLEAN", 7);
        h = jsonToken8;
        JsonToken jsonToken9 = new JsonToken("NULL", 8);
        i = jsonToken9;
        JsonToken jsonToken10 = new JsonToken("END_DOCUMENT", 9);
        j = jsonToken10;
        k = new JsonToken[]{jsonToken, jsonToken2, jsonToken3, jsonToken4, jsonToken5, jsonToken6, jsonToken7, jsonToken8, jsonToken9, jsonToken10};
    }

    public static JsonToken valueOf(String str) {
        return (JsonToken) Enum.valueOf(JsonToken.class, str);
    }

    public static JsonToken[] values() {
        return (JsonToken[]) k.clone();
    }
}

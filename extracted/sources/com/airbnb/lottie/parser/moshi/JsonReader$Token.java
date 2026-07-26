package com.airbnb.lottie.parser.moshi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class JsonReader$Token {
    public static final JsonReader$Token a;
    public static final JsonReader$Token b;
    public static final JsonReader$Token c;
    public static final JsonReader$Token d;
    public static final JsonReader$Token e;
    public static final JsonReader$Token f;
    public static final JsonReader$Token g;
    public static final JsonReader$Token h;
    public static final JsonReader$Token i;
    public static final JsonReader$Token j;
    public static final /* synthetic */ JsonReader$Token[] k;

    static {
        JsonReader$Token jsonReader$Token = new JsonReader$Token("BEGIN_ARRAY", 0);
        a = jsonReader$Token;
        JsonReader$Token jsonReader$Token2 = new JsonReader$Token("END_ARRAY", 1);
        b = jsonReader$Token2;
        JsonReader$Token jsonReader$Token3 = new JsonReader$Token("BEGIN_OBJECT", 2);
        c = jsonReader$Token3;
        JsonReader$Token jsonReader$Token4 = new JsonReader$Token("END_OBJECT", 3);
        d = jsonReader$Token4;
        JsonReader$Token jsonReader$Token5 = new JsonReader$Token("NAME", 4);
        e = jsonReader$Token5;
        JsonReader$Token jsonReader$Token6 = new JsonReader$Token("STRING", 5);
        f = jsonReader$Token6;
        JsonReader$Token jsonReader$Token7 = new JsonReader$Token("NUMBER", 6);
        g = jsonReader$Token7;
        JsonReader$Token jsonReader$Token8 = new JsonReader$Token("BOOLEAN", 7);
        h = jsonReader$Token8;
        JsonReader$Token jsonReader$Token9 = new JsonReader$Token("NULL", 8);
        i = jsonReader$Token9;
        JsonReader$Token jsonReader$Token10 = new JsonReader$Token("END_DOCUMENT", 9);
        j = jsonReader$Token10;
        k = new JsonReader$Token[]{jsonReader$Token, jsonReader$Token2, jsonReader$Token3, jsonReader$Token4, jsonReader$Token5, jsonReader$Token6, jsonReader$Token7, jsonReader$Token8, jsonReader$Token9, jsonReader$Token10};
    }

    public static JsonReader$Token valueOf(String str) {
        return (JsonReader$Token) Enum.valueOf(JsonReader$Token.class, str);
    }

    public static JsonReader$Token[] values() {
        return (JsonReader$Token[]) k.clone();
    }
}

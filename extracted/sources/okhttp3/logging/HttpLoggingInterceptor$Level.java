package okhttp3.logging;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class HttpLoggingInterceptor$Level {
    public static final HttpLoggingInterceptor$Level a;
    public static final HttpLoggingInterceptor$Level b;
    public static final HttpLoggingInterceptor$Level c;
    public static final /* synthetic */ HttpLoggingInterceptor$Level[] d;

    static {
        HttpLoggingInterceptor$Level httpLoggingInterceptor$Level = new HttpLoggingInterceptor$Level("NONE", 0);
        a = httpLoggingInterceptor$Level;
        HttpLoggingInterceptor$Level httpLoggingInterceptor$Level2 = new HttpLoggingInterceptor$Level("BASIC", 1);
        HttpLoggingInterceptor$Level httpLoggingInterceptor$Level3 = new HttpLoggingInterceptor$Level("HEADERS", 2);
        b = httpLoggingInterceptor$Level3;
        HttpLoggingInterceptor$Level httpLoggingInterceptor$Level4 = new HttpLoggingInterceptor$Level("BODY", 3);
        c = httpLoggingInterceptor$Level4;
        HttpLoggingInterceptor$Level[] httpLoggingInterceptor$LevelArr = {httpLoggingInterceptor$Level, httpLoggingInterceptor$Level2, httpLoggingInterceptor$Level3, httpLoggingInterceptor$Level4};
        d = httpLoggingInterceptor$LevelArr;
        a.a(httpLoggingInterceptor$LevelArr);
    }

    public static HttpLoggingInterceptor$Level valueOf(String str) {
        return (HttpLoggingInterceptor$Level) Enum.valueOf(HttpLoggingInterceptor$Level.class, str);
    }

    public static HttpLoggingInterceptor$Level[] values() {
        return (HttpLoggingInterceptor$Level[]) d.clone();
    }
}

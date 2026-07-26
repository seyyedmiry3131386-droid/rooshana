package defpackage;

import android.text.TextUtils;
import io.sentry.android.core.t0;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l68 {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public final String a;
    public final String b;
    public final long c;

    public l68(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            t0.m("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static l68 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new l68(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new l68(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            t0.m("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }
}

package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dd2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public dd2(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = e88.a;
        rq4.q("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static dd2 a(Context context) {
        bn6 bn6Var = new bn6(context, 9);
        String strS = bn6Var.s("google_app_id");
        if (TextUtils.isEmpty(strS)) {
            return null;
        }
        return new dd2(strS, bn6Var.s("google_api_key"), bn6Var.s("firebase_database_url"), bn6Var.s("ga_trackingId"), bn6Var.s("gcm_defaultSenderId"), bn6Var.s("google_storage_bucket"), bn6Var.s("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dd2)) {
            return false;
        }
        dd2 dd2Var = (dd2) obj;
        return vy2.w(this.b, dd2Var.b) && vy2.w(this.a, dd2Var.a) && vy2.w(this.c, dd2Var.c) && vy2.w(this.d, dd2Var.d) && vy2.w(this.e, dd2Var.e) && vy2.w(this.f, dd2Var.f) && vy2.w(this.g, dd2Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        hh2 hh2Var = new hh2(this);
        hh2Var.d(this.b, "applicationId");
        hh2Var.d(this.a, "apiKey");
        hh2Var.d(this.c, "databaseUrl");
        hh2Var.d(this.e, "gcmSenderId");
        hh2Var.d(this.f, "storageBucket");
        hh2Var.d(this.g, "projectId");
        return hh2Var.toString();
    }
}

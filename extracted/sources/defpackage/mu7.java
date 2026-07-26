package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mu7 {
    public final SharedPreferences a;
    public final Set b;

    public mu7(SharedPreferences sharedPreferences, Set set) {
        js3.p(sharedPreferences, "prefs");
        this.a = sharedPreferences;
        this.b = set;
    }

    public final void a(String str) {
        Set set = this.b;
        if (set != null && !set.contains(str)) {
            throw new IllegalStateException("Can't access key outside migration: ".concat(str).toString());
        }
    }

    public final String b(String str) {
        a(str);
        return this.a.getString(str, "");
    }
}

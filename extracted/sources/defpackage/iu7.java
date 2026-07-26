package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class iu7 {
    public static final /* synthetic */ int b = 0;
    public final String a;

    static {
        eh5.a("SharedPreferencesHelper");
    }

    public iu7() {
        this.a = null;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor editorClear = dh5.a.getSharedPreferences(this.a, 0).edit().clear();
        if (z) {
            editorClear.apply();
        } else {
            editorClear.commit();
        }
    }

    public String b() {
        return dh5.a.getSharedPreferences(this.a, 0).getString("DOWNLOAD_ITEMS_ORDER", null);
    }

    public void c(String str) {
        dh5.a.getSharedPreferences(this.a, 0).edit().putString("DOWNLOAD_ITEMS_ORDER", str).apply();
    }

    public iu7(String str) {
        this.a = str;
    }
}

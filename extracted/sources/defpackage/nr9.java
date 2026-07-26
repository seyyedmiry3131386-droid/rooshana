package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class nr9 {
    public static final wv a = new wv(0);

    public static synchronized Uri a() {
        wv wvVar = a;
        Uri uri = (Uri) wvVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        wvVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}

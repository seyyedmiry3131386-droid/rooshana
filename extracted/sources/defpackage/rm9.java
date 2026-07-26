package defpackage;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class rm9 {
    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}

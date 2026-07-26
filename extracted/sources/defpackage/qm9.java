package defpackage;

import com.google.android.gms.cloudmessaging.zzd;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qm9 extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? zzd.class : super.loadClass(str, z);
    }
}

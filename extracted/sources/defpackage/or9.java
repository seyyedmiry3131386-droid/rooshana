package defpackage;

import android.net.Uri;
import io.sentry.android.core.t0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class or9 {
    public static final Object g = new Object();
    public static volatile dr9 h;
    public static final AtomicInteger i;
    public final xe1 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public final /* synthetic */ int f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ or9(xe1 xe1Var, String str, Object obj, int i2) {
        this.f = i2;
        if (((Uri) xe1Var.b) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = xe1Var;
        this.b = str;
        this.c = obj;
    }

    public final Object a(Object obj) {
        switch (this.f) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String string = obj.toString();
                    String str = this.b;
                    t0.d("PhenotypeFlag", dw1.p("Invalid long value for ", str, ": ", string, new StringBuilder(str.length() + 25 + string.length())));
                }
                break;
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!ar9.b.matcher(str2).matches()) {
                            if (ar9.c.matcher(str2).matches()) {
                            }
                        }
                    }
                    String string2 = obj.toString();
                    String str3 = this.b;
                    t0.d("PhenotypeFlag", dw1.p("Invalid boolean value for ", str3, ": ", string2, new StringBuilder(str3.length() + 28 + string2.length())));
                    break;
                }
                break;
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String string3 = obj.toString();
                        String str4 = this.b;
                        t0.d("PhenotypeFlag", dw1.p("Invalid double value for ", str4, ": ", string3, new StringBuilder(str4.length() + 27 + string3.length())));
                    }
                }
                break;
            default:
                if (obj instanceof String) {
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[PHI: r2
      0x005c: PHI (r2v1 com.google.common.base.Optional) = 
      (r2v0 com.google.common.base.Optional)
      (r2v0 com.google.common.base.Optional)
      (r2v4 com.google.common.base.Optional)
      (r2v4 com.google.common.base.Optional)
     binds: [B:8:0x0016, B:10:0x001a, B:12:0x0026, B:18:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001c, B:13:0x0028, B:15:0x0038, B:19:0x004c, B:26:0x0062, B:28:0x006f, B:30:0x0077, B:33:0x0087, B:35:0x0095, B:47:0x00ba, B:50:0x00c2, B:51:0x00c5, B:52:0x00c9, B:39:0x009e, B:41:0x00a2, B:43:0x00b0, B:45:0x00b6, B:53:0x00ce, B:54:0x00d0, B:16:0x0045, B:55:0x00d1), top: B:61:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001c, B:13:0x0028, B:15:0x0038, B:19:0x004c, B:26:0x0062, B:28:0x006f, B:30:0x0077, B:33:0x0087, B:35:0x0095, B:47:0x00ba, B:50:0x00c2, B:51:0x00c5, B:52:0x00c9, B:39:0x009e, B:41:0x00a2, B:43:0x00b0, B:45:0x00b6, B:53:0x00ce, B:54:0x00d0, B:16:0x0045, B:55:0x00d1), top: B:61:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or9.b():java.lang.Object");
    }
}

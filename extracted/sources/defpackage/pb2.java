package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import nene.downloadmanager.exceptions.downloadfail.NeneStorageException;

/* JADX INFO: loaded from: classes3.dex */
public final class pb2 {
    public static pb2 a;
    public static final HashMap b;

    static {
        eh5.a("FileManager");
        a = null;
        b = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r7, boolean r8, boolean r9) throws nene.downloadmanager.exceptions.downloadfail.NeneStorageException {
        /*
            android.text.TextUtils.isEmpty(r7)
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.lang.String r7 = r0.getName()
            java.lang.String r1 = ".part-"
            java.lang.String r1 = defpackage.t61.i(r7, r1)
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L61
            boolean r2 = r0.exists()
            if (r2 != 0) goto L1f
            goto L61
        L1f:
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L5b
            java.io.File[] r2 = r0.listFiles()
            if (r2 != 0) goto L2c
            goto L5b
        L2c:
            int r0 = r2.length
            r3 = 0
            r4 = 0
        L2f:
            if (r4 >= r0) goto L57
            r5 = r2[r4]
            if (r8 == 0) goto L45
            java.lang.String r6 = r5.getName()     // Catch: nene.downloadmanager.exceptions.downloadfail.NeneStorageException -> L43
            boolean r6 = r6.equals(r7)     // Catch: nene.downloadmanager.exceptions.downloadfail.NeneStorageException -> L43
            if (r6 == 0) goto L45
            defpackage.am5.a(r5)     // Catch: nene.downloadmanager.exceptions.downloadfail.NeneStorageException -> L43
            goto L54
        L43:
            r3 = move-exception
            goto L54
        L45:
            if (r9 == 0) goto L54
            java.lang.String r6 = r5.getName()     // Catch: nene.downloadmanager.exceptions.downloadfail.NeneStorageException -> L43
            boolean r6 = r6.startsWith(r1)     // Catch: nene.downloadmanager.exceptions.downloadfail.NeneStorageException -> L43
            if (r6 == 0) goto L54
            defpackage.am5.a(r5)     // Catch: nene.downloadmanager.exceptions.downloadfail.NeneStorageException -> L43
        L54:
            int r4 = r4 + 1
            goto L2f
        L57:
            if (r3 != 0) goto L5a
            goto L61
        L5a:
            throw r3
        L5b:
            r0.toString()
            r0.isDirectory()
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb2.a(java.lang.String, boolean, boolean):void");
    }

    public static pb2 d() {
        if (a == null) {
            synchronized (pb2.class) {
                try {
                    if (a == null) {
                        a = new pb2();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public static boolean f(long j, String str) throws InterruptedException {
        HashMap map = b;
        synchronized (map) {
            try {
                ob2 ob2Var = new ob2();
                ob2Var.a = false;
                ob2Var.b = false;
                ob2 ob2Var2 = (ob2) map.put(str, ob2Var);
                if (ob2Var2 == null) {
                    return true;
                }
                map.put(str, ob2Var2);
                if (j > 0) {
                    Thread.sleep(j);
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, boolean z, boolean z2) {
        TextUtils.isEmpty(str);
        if (z27.b <= 0) {
            z27.b = Looper.getMainLooper().getThread().getId();
        }
        if (Thread.currentThread().getId() == z27.b) {
            try {
                f(0L, str);
            } catch (InterruptedException unused) {
            }
            new nb2(this, str, z, z2).execute(new Void[0]);
        } else {
            try {
                a(str, z, z2);
            } catch (NeneStorageException unused2) {
            }
            e(str);
        }
    }

    public final void c(String str) {
        TextUtils.isEmpty(str);
        HashMap map = b;
        synchronized (map) {
            try {
                ob2 ob2Var = (ob2) map.get(str);
                if (ob2Var == null) {
                    b(str, true, true);
                } else {
                    ob2Var.a = true;
                    ob2Var.b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(String str) {
        HashMap map = b;
        synchronized (map) {
            try {
                ob2 ob2Var = (ob2) map.remove(str);
                if (ob2Var == null) {
                    return;
                }
                boolean z = ob2Var.a;
                if (z || ob2Var.b) {
                    b(str, z, ob2Var.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class qo8 implements Runnable {
    public static final Object g = new Object();
    public static Boolean h;
    public static Boolean i;
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public qo8(fq9 fq9Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream, ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream, long j, ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2) {
        this.c = autoCloseInputStream;
        this.d = autoCloseOutputStream;
        this.b = j;
        this.e = autoCloseOutputStream2;
        this.f = fq9Var;
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (g) {
            try {
                Boolean bool = i;
                zBooleanValue = (bool == null && bool == null) ? context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                i = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (g) {
            try {
                Boolean bool = h;
                zBooleanValue = (bool == null && bool == null) ? context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                h = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean c() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.c     // Catch: java.lang.Throwable -> L14
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L14
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r0 = move-exception
            goto L24
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L21
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            monitor-exit(r2)
            return r0
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo8.c():boolean");
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InputStream inputStream;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        byte[] bArr;
        boolean z = false;
        switch (this.a) {
            case 0:
                oo8 oo8Var = (oo8) this.f;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.e;
                Context context = (Context) this.c;
                if (b(context)) {
                    wakeLock.acquire(t21.a);
                }
                try {
                    try {
                        oo8Var.e(true);
                        if (!((z21) this.d).f()) {
                            oo8Var.e(false);
                            if (!b(context)) {
                                return;
                            }
                        } else if (!a(context) || c()) {
                            if (oo8Var.f()) {
                                oo8Var.e(false);
                            } else {
                                oo8Var.g(this.b);
                            }
                            if (!b(context)) {
                                return;
                            }
                        } else {
                            po8 po8Var = new po8();
                            po8Var.a = this;
                            context.registerReceiver(po8Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            if (!b(context)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        t0.d("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                        oo8Var.e(false);
                        if (!b(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        return;
                    }
                } catch (Throwable th) {
                    if (b(context)) {
                        try {
                            wakeLock.release();
                            break;
                        } catch (RuntimeException unused2) {
                        }
                    }
                    throw th;
                }
            default:
                try {
                    inputStream = (InputStream) this.c;
                    autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) this.d;
                    bArr = new byte[65536];
                } catch (IOException e2) {
                    try {
                        if (((fq9) this.f).c) {
                            String.format("Terminating copying stream for Payload %d due to shutdown of OutgoingPayloadStreamer.", Long.valueOf(this.b));
                        } else {
                            t0.n("NearbyConnections", String.format("Exception copying stream for Payload %d", Long.valueOf(this.b)), e2);
                        }
                        yq2.O((InputStream) this.c);
                        fq9.a((ParcelFileDescriptor.AutoCloseOutputStream) this.e, true, this.b);
                    } catch (Throwable th2) {
                        th = th2;
                        z = true;
                        yq2.O((InputStream) this.c);
                        fq9.a((ParcelFileDescriptor.AutoCloseOutputStream) this.e, z, this.b);
                        yq2.O((ParcelFileDescriptor.AutoCloseOutputStream) this.d);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    yq2.O((InputStream) this.c);
                    fq9.a((ParcelFileDescriptor.AutoCloseOutputStream) this.e, z, this.b);
                    yq2.O((ParcelFileDescriptor.AutoCloseOutputStream) this.d);
                    throw th;
                }
                while (true) {
                    int i2 = inputStream.read(bArr, 0, 65536);
                    if (i2 == -1) {
                        yq2.O((InputStream) this.c);
                        fq9.a((ParcelFileDescriptor.AutoCloseOutputStream) this.e, false, this.b);
                        yq2.O((ParcelFileDescriptor.AutoCloseOutputStream) this.d);
                        return;
                    }
                    autoCloseOutputStream.write(bArr, 0, i2);
                }
                break;
        }
    }

    public qo8(oo8 oo8Var, Context context, z21 z21Var, long j) {
        this.f = oo8Var;
        this.c = context;
        this.b = j;
        this.d = z21Var;
        this.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}

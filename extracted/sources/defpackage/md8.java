package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class md8 implements Runnable {
    public final long a;
    public final PowerManager.WakeLock b;
    public final FirebaseMessaging c;
    public final ThreadPoolExecutor d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new oh5("firebase-iid-executor"));

    public md8(FirebaseMessaging firebaseMessaging, long j) {
        this.c = firebaseMessaging;
        this.a = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.c.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.c.c.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.c.a() != null) {
                return true;
            }
            t0.d("FirebaseMessaging", "Token retrieval failed: null");
            return false;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                t0.m("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            t0.m("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            t0.m("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.b;
        vp7 vp7VarT = vp7.T();
        FirebaseMessaging firebaseMessaging = this.c;
        if (vp7VarT.a0(firebaseMessaging.c)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.j = true;
                }
                if (!firebaseMessaging.i.f()) {
                    firebaseMessaging.g(false);
                    if (vp7.T().a0(firebaseMessaging.c)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (!vp7.T().Z(firebaseMessaging.c) || a()) {
                    if (b()) {
                        firebaseMessaging.g(false);
                    } else {
                        firebaseMessaging.i(this.a);
                    }
                    if (vp7.T().a0(firebaseMessaging.c)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                ld8 ld8Var = new ld8();
                ld8Var.a = this;
                ld8Var.a();
                if (vp7.T().a0(firebaseMessaging.c)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                t0.d("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.g(false);
                if (vp7.T().a0(firebaseMessaging.c)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (vp7.T().a0(firebaseMessaging.c)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}

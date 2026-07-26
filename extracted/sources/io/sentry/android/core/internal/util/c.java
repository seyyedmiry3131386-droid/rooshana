package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import io.sentry.IConnectionStatusProvider$ConnectionStatus;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a0;
import io.sentry.android.core.c0;
import io.sentry.android.core.i0;
import io.sentry.android.core.j0;
import io.sentry.b6;
import io.sentry.n0;
import io.sentry.o0;
import io.sentry.u0;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements o0, a0 {
    public static volatile ConnectivityManager m;
    public final Context a;
    public final b6 b;
    public final j0 c;
    public final d d;
    public final ArrayList e;
    public final AutoClosableReentrantLock f;
    public volatile b g;
    public volatile NetworkCapabilities h;
    public volatile Network i;
    public volatile long j;
    public final AtomicBoolean k;
    public static final AutoClosableReentrantLock l = new AutoClosableReentrantLock();
    public static final AutoClosableReentrantLock n = new AutoClosableReentrantLock();
    public static final ArrayList o = new ArrayList();
    public static final int[] p = {1, 0, 3, 2};
    public static final int[] q = new int[2];

    public c(Context context, j0 j0Var, SentryAndroidOptions sentryAndroidOptions) {
        d dVar = d.a;
        this.f = new AutoClosableReentrantLock();
        this.j = 0L;
        this.k = new AtomicBoolean(false);
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = sentryAndroidOptions;
        this.c = j0Var;
        this.d = dVar;
        this.e = new ArrayList();
        int[] iArr = q;
        iArr[0] = 12;
        iArr[1] = 16;
        K(new a(this, 3));
        c0.e.b(this);
    }

    public static ConnectivityManager I(Context context, u0 u0Var) {
        if (m != null) {
            return m;
        }
        io.sentry.r rVarA = l.a();
        try {
            if (m != null) {
                ConnectivityManager connectivityManager = m;
                rVarA.close();
                return connectivityManager;
            }
            m = (ConnectivityManager) context.getSystemService("connectivity");
            if (m == null) {
                u0Var.i(SentryLevel.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = m;
            rVarA.close();
            return connectivityManager2;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean J(Context context, u0 u0Var, j0 j0Var, b bVar) {
        j0Var.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            u0Var.i(SentryLevel.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerI = I(context, u0Var);
        if (connectivityManagerI == null) {
            return false;
        }
        if (!io.sentry.config.a.I(context)) {
            u0Var.i(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManagerI.registerDefaultNetworkCallback(bVar);
            return true;
        } catch (Throwable th) {
            u0Var.f(SentryLevel.WARNING, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    public static boolean d(Context context, u0 u0Var, j0 j0Var, ConnectivityManager.NetworkCallback networkCallback) {
        j0Var.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            u0Var.i(SentryLevel.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        if (!io.sentry.config.a.I(context)) {
            u0Var.i(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        io.sentry.r rVarA = n.a();
        try {
            o.add(networkCallback);
            rVarA.close();
            return true;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String y(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    @Override // io.sentry.o0
    public final IConnectionStatusProvider$ConnectionStatus A0() {
        this.d.getClass();
        if (SystemClock.uptimeMillis() - this.j >= 120000) {
            R(null);
        }
        return u();
    }

    public final String D() {
        NetworkCapabilities networkCapabilities = this.h;
        if (networkCapabilities != null) {
            return y(networkCapabilities);
        }
        Context context = this.a;
        u0 logger = this.b.getLogger();
        j0 j0Var = this.c;
        ConnectivityManager connectivityManagerI = I(context, logger);
        if (connectivityManagerI != null) {
            if (!io.sentry.config.a.I(context)) {
                logger.i(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                j0Var.getClass();
                Network activeNetwork = connectivityManagerI.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.i(SentryLevel.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerI.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.i(SentryLevel.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th) {
                logger.f(SentryLevel.ERROR, "Failed to retrieve network info", th);
                return null;
            }
        }
        return null;
    }

    @Override // io.sentry.o0
    public final boolean E0(n0 n0Var) {
        io.sentry.r rVarA = this.f.a();
        try {
            this.e.add(n0Var);
            rVarA.close();
            k();
            return this.g != null;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.o0
    public final String G() {
        this.d.getClass();
        if (SystemClock.uptimeMillis() - this.j >= 120000) {
            R(null);
        }
        return D();
    }

    public final void K(Runnable runnable) {
        b6 b6Var = this.b;
        try {
            b6Var.getExecutorService().submit(runnable);
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.ERROR, "AndroidConnectionStatusProvider submit failed", th);
        }
    }

    public final void P(boolean z) {
        io.sentry.r rVarA = this.f.a();
        if (z) {
            try {
                this.e.clear();
            } catch (Throwable th) {
                try {
                    rVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        b bVar = this.g;
        this.g = null;
        if (bVar != null) {
            Context context = this.a;
            u0 logger = this.b.getLogger();
            ConnectivityManager connectivityManagerI = I(context, logger);
            if (connectivityManagerI != null) {
                try {
                    connectivityManagerI.unregisterNetworkCallback(bVar);
                } catch (Throwable th3) {
                    logger.f(SentryLevel.WARNING, "unregisterNetworkCallback failed", th3);
                }
            }
        }
        this.h = null;
        this.i = null;
        this.j = 0L;
        rVarA.close();
        this.b.getLogger().i(SentryLevel.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public final void R(NetworkCapabilities networkCapabilities) {
        io.sentry.r rVarA = this.f.a();
        try {
            if (networkCapabilities != null) {
                this.h = networkCapabilities;
            } else {
                if (!io.sentry.config.a.I(this.a)) {
                    this.b.getLogger().i(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.h = null;
                    this.d.getClass();
                    this.j = SystemClock.uptimeMillis();
                    rVarA.close();
                    return;
                }
                this.c.getClass();
                ConnectivityManager connectivityManagerI = I(this.a, this.b.getLogger());
                if (connectivityManagerI != null) {
                    Network activeNetwork = connectivityManagerI.getActiveNetwork();
                    this.h = activeNetwork != null ? connectivityManagerI.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.h = null;
                }
            }
            this.d.getClass();
            this.j = SystemClock.uptimeMillis();
            this.b.getLogger().i(SentryLevel.DEBUG, "Cache updated - Status: " + u() + ", Type: " + D(), new Object[0]);
        } catch (Throwable th) {
            try {
                this.b.getLogger().f(SentryLevel.WARNING, "Failed to update connection status cache", th);
                this.h = null;
                this.d.getClass();
                this.j = SystemClock.uptimeMillis();
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        rVarA.close();
    }

    @Override // io.sentry.o0
    public final void S0(n0 n0Var) {
        io.sentry.r rVarA = this.f.a();
        try {
            this.e.remove(n0Var);
            rVarA.close();
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.a0
    public final void b() {
        if (this.g != null) {
            return;
        }
        K(new a(this, 2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        K(new a(this, 1));
    }

    @Override // io.sentry.android.core.a0
    public final void g() {
        if (this.g == null) {
            return;
        }
        K(new a(this, 0));
    }

    public final void k() {
        if (i0.i() && this.g == null) {
            io.sentry.r rVarA = this.f.a();
            try {
                if (this.g != null) {
                    rVarA.close();
                    return;
                }
                b bVar = new b(this);
                if (J(this.a, this.b.getLogger(), this.c, bVar)) {
                    this.g = bVar;
                    this.b.getLogger().i(SentryLevel.DEBUG, "Network callback registered successfully", new Object[0]);
                } else {
                    this.b.getLogger().i(SentryLevel.WARNING, "Failed to register network callback", new Object[0]);
                }
                rVarA.close();
            } catch (Throwable th) {
                try {
                    rVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final IConnectionStatusProvider$ConnectionStatus u() {
        if (this.h != null) {
            NetworkCapabilities networkCapabilities = this.h;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.c.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i : p) {
                        if (networkCapabilities.hasTransport(i)) {
                            return IConnectionStatusProvider$ConnectionStatus.CONNECTED;
                        }
                    }
                }
            }
            return IConnectionStatusProvider$ConnectionStatus.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerI = I(this.a, this.b.getLogger());
        if (connectivityManagerI == null) {
            return IConnectionStatusProvider$ConnectionStatus.UNKNOWN;
        }
        Context context = this.a;
        u0 logger = this.b.getLogger();
        if (!io.sentry.config.a.I(context)) {
            logger.i(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return IConnectionStatusProvider$ConnectionStatus.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerI.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? IConnectionStatusProvider$ConnectionStatus.CONNECTED : IConnectionStatusProvider$ConnectionStatus.DISCONNECTED;
            }
            logger.i(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return IConnectionStatusProvider$ConnectionStatus.DISCONNECTED;
        } catch (Throwable th) {
            logger.f(SentryLevel.WARNING, "Could not retrieve Connection Status", th);
            return IConnectionStatusProvider$ConnectionStatus.UNKNOWN;
        }
    }
}

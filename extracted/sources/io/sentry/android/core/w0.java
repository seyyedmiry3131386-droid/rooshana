package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final String f;

    public w0(NetworkCapabilities networkCapabilities, j0 j0Var, long j) {
        io.sentry.config.a.W(networkCapabilities, "NetworkCapabilities is required");
        io.sentry.config.a.W(j0Var, "BuildInfoProvider is required");
        this.a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.c = signalStrength > -100 ? signalStrength : 0;
        this.e = networkCapabilities.hasTransport(4);
        String strY = io.sentry.android.core.internal.util.c.y(networkCapabilities);
        this.f = strY == null ? "" : strY;
        this.d = j;
    }
}

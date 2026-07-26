package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.SentryLevel;
import io.sentry.c4;
import io.sentry.o4;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends ConnectivityManager.NetworkCallback {
    public final j0 b;
    public final o4 e;
    public NetworkCapabilities c = null;
    public long d = 0;
    public final c4 a = c4.a;

    public x0(j0 j0Var, o4 o4Var) {
        io.sentry.config.a.W(j0Var, "BuildInfoProvider is required");
        this.b = j0Var;
        io.sentry.config.a.W(o4Var, "SentryDateProvider is required");
        this.e = o4Var;
    }

    public static io.sentry.f a(String str) {
        io.sentry.f fVar = new io.sentry.f();
        fVar.e = "system";
        fVar.g = "network.event";
        fVar.c(str, PackageListMetaDataDTO.KEY_ACTION);
        fVar.i = SentryLevel.INFO;
        return fVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.k(a("NETWORK_AVAILABLE"));
        this.c = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        w0 w0Var;
        long jD = this.e.a().d();
        NetworkCapabilities networkCapabilities2 = this.c;
        long j = this.d;
        j0 j0Var = this.b;
        if (networkCapabilities2 == null) {
            w0Var = new w0(networkCapabilities, j0Var, jD);
        } else {
            w0 w0Var2 = new w0(networkCapabilities2, j0Var, j);
            w0Var = new w0(networkCapabilities, j0Var, jD);
            int iAbs = Math.abs(w0Var2.c - w0Var.c);
            int i = w0Var.a;
            int i2 = w0Var2.a;
            int iAbs2 = Math.abs(i2 - i);
            int i3 = w0Var.b;
            int i4 = w0Var2.b;
            int iAbs3 = Math.abs(i4 - i3);
            boolean z = ((double) Math.abs(w0Var2.d - w0Var.d)) / 1000000.0d < 5000.0d;
            boolean z2 = z || iAbs <= 5;
            boolean z3 = z || ((double) iAbs2) <= Math.max(1000.0d, ((double) Math.abs(i2)) * 0.1d);
            boolean z4 = z || ((double) iAbs3) <= Math.max(1000.0d, ((double) Math.abs(i4)) * 0.1d);
            if (w0Var2.e == w0Var.e && w0Var2.f.equals(w0Var.f) && z2 && z3 && z4) {
                w0Var = null;
            }
        }
        if (w0Var == null) {
            return;
        }
        this.c = networkCapabilities;
        this.d = jD;
        io.sentry.f fVarA = a("NETWORK_CAPABILITIES_CHANGED");
        fVarA.c(Integer.valueOf(w0Var.a), "download_bandwidth");
        fVarA.c(Integer.valueOf(w0Var.b), "upload_bandwidth");
        fVarA.c(Boolean.valueOf(w0Var.e), "vpn_active");
        fVarA.c(w0Var.f, "network_type");
        int i5 = w0Var.c;
        if (i5 != 0) {
            fVarA.c(Integer.valueOf(i5), "signal_strength");
        }
        io.sentry.h0 h0Var = new io.sentry.h0();
        h0Var.d(w0Var, "android:networkCapabilities");
        this.a.h(fVarA, h0Var);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.k(a("NETWORK_LOST"));
        this.c = null;
    }
}

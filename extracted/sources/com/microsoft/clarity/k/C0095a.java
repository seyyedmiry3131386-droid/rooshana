package com.microsoft.clarity.k;

import android.net.ConnectivityManager;
import android.net.Network;
import defpackage.js3;

/* JADX INFO: renamed from: com.microsoft.clarity.k.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0095a extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C0096b a;

    public C0095a(C0096b c0096b) {
        this.a = c0096b;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        js3.p(network, "network");
        super.onAvailable(network);
        this.a.a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        js3.p(network, "network");
        super.onLost(network);
        this.a.a(false);
    }
}

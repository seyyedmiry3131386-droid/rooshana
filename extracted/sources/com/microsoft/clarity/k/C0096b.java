package com.microsoft.clarity.k;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.microsoft.clarity.i.C0081c;
import com.microsoft.clarity.models.observers.NetworkConnectedEvent;
import com.microsoft.clarity.models.observers.NetworkDisconnectedEvent;
import defpackage.js3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.microsoft.clarity.k.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0096b {
    public final List a;
    public boolean b;
    public boolean c;

    public C0096b(Context context) {
        NetworkCapabilities networkCapabilities;
        js3.p(context, "context");
        this.a = DesugarCollections.synchronizedList(new ArrayList());
        Object systemService = context.getSystemService("connectivity");
        js3.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        C0095a c0095a = new C0095a(this);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        a((activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasCapability(12));
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c0095a);
    }

    public final void a(boolean z) {
        this.c = z;
        List list = this.a;
        js3.o(list, "callbacks");
        C0081c[] c0081cArr = (C0081c[]) list.toArray(new C0081c[0]);
        a(z, (C0081c[]) Arrays.copyOf(c0081cArr, c0081cArr.length));
    }

    public final void a(boolean z, C0081c... c0081cArr) {
        if (this.b) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (C0081c c0081c : c0081cArr) {
            if (z) {
                new NetworkConnectedEvent(jCurrentTimeMillis);
                c0081c.getClass();
                c0081c.a.g.h = true;
            } else {
                NetworkDisconnectedEvent networkDisconnectedEvent = new NetworkDisconnectedEvent(jCurrentTimeMillis);
                c0081c.getClass();
                c0081c.a.i.add(networkDisconnectedEvent);
                c0081c.a.g.h = false;
            }
        }
    }
}

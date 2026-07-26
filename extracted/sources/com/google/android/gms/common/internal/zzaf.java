package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import defpackage.rq4;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf extends Exception {
    public final ConnectionResult a;

    public zzaf(ConnectionResult connectionResult) {
        rq4.h("ResolvableConnectionException can only be created with a connection result containing a resolution.", (connectionResult.b == 0 || connectionResult.c == null) ? false : true);
        this.a = connectionResult;
    }
}

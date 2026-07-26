package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.fp7;
import defpackage.rn6;

/* JADX INFO: loaded from: classes.dex */
public final class zabs extends BroadcastReceiver {
    public Context a;
    public final rn6 b;

    public zabs(rn6 rn6Var) {
        this.b = rn6Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((fp7) this.b.c).getClass();
            throw null;
        }
    }
}

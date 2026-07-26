package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class GoogleApiClient {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static Set a() {
        Set set = a;
        synchronized (set) {
        }
        return set;
    }

    public Looper b() {
        throw new UnsupportedOperationException();
    }

    public abstract void connect();

    public abstract void disconnect();
}

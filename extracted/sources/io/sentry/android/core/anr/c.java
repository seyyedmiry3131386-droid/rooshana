package io.sentry.android.core.anr;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final ArrayList a;

    static {
        ArrayList arrayList = new ArrayList(11);
        a = arrayList;
        arrayList.add("java.lang");
        arrayList.add("java.util");
        arrayList.add("android.app");
        arrayList.add("android.os.Handler");
        arrayList.add("android.os.Looper");
        arrayList.add("android.view");
        arrayList.add("android.widget");
        arrayList.add("com.android.internal");
        arrayList.add("com.google.android");
        arrayList.add("kotlin");
        arrayList.add("kotlinx.coroutines");
    }
}

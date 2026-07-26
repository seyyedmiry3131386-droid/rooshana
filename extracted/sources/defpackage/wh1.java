package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import com.google.common.collect.p1;

/* JADX INFO: loaded from: classes.dex */
public final class wh1 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ ci1 a;

    public wh1(ci1 ci1Var) {
        this.a = ci1Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        p1 p1Var = ci1.l;
        this.a.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        p1 p1Var = ci1.l;
        this.a.f();
    }
}

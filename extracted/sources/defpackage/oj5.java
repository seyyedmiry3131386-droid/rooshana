package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public final class oj5 extends sj5 {
    public final Class r;

    public oj5(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.sj5
    public final Object a(Bundle bundle, String str) {
        js3.p(bundle, "bundle");
        return (Parcelable[]) bundle.get(str);
    }

    @Override // defpackage.sj5
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.sj5
    /* JADX INFO: renamed from: d */
    public final Object g(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // defpackage.sj5
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        js3.p(str, "key");
        this.r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !oj5.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.r, ((oj5) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}

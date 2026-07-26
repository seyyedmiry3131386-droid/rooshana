package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class pj5 extends sj5 {
    public final Class r;

    public pj5(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // defpackage.sj5
    public final Object a(Bundle bundle, String str) {
        js3.p(bundle, "bundle");
        return bundle.get(str);
    }

    @Override // defpackage.sj5
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.sj5
    /* JADX INFO: renamed from: d */
    public final Object g(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.sj5
    public final void e(Bundle bundle, String str, Object obj) {
        js3.p(str, "key");
        this.r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !pj5.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.r, ((pj5) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}

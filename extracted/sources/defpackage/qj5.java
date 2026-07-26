package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class qj5 extends sj5 {
    public final Class r;

    public qj5(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
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
        return (Serializable[]) bundle.get(str);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // defpackage.sj5
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r4 = (Serializable[]) obj;
        js3.p(str, "key");
        this.r.cast(r4);
        bundle.putSerializable(str, r4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !qj5.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.r, ((qj5) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}

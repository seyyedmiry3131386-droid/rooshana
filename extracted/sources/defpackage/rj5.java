package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class rj5 extends sj5 {
    public final Class r;

    public rj5(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // defpackage.sj5
    public final Object a(Bundle bundle, String str) {
        js3.p(bundle, "bundle");
        return (Serializable) bundle.get(str);
    }

    @Override // defpackage.sj5
    public String b() {
        return this.r.getName();
    }

    @Override // defpackage.sj5
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        js3.p(str, "key");
        js3.p(serializable, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj5)) {
            return false;
        }
        return js3.i(this.r, ((rj5) obj).r);
    }

    @Override // defpackage.sj5
    public Serializable g(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public rj5(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}

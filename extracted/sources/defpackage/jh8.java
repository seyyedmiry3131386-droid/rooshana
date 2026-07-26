package defpackage;

import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jh8 implements zp2 {
    public final /* synthetic */ PropertyReference0Impl a;

    public jh8(PropertyReference0Impl propertyReference0Impl) {
        this.a = propertyReference0Impl;
    }

    public final float a() {
        return ((Number) this.a.get()).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jh8)) {
            return false;
        }
        return this.a.equals(((zp2) obj).getFunctionDelegate());
    }

    @Override // defpackage.zp2
    public final np2 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

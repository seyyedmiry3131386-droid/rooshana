package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public final class nj5 extends rj5 {
    public final Class s;

    public nj5(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // defpackage.rj5, defpackage.sj5
    public final String b() {
        return this.s.getName();
    }

    @Override // defpackage.rj5
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Enum g(String str) {
        Object obj;
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Class cls = this.s;
        Object[] enumConstants = cls.getEnumConstants();
        js3.o(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (m88.T(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r4 = (Enum) obj;
        if (r4 != null) {
            return r4;
        }
        StringBuilder sbN = t61.n("Enum value ", str, " not found for type ");
        sbN.append(cls.getName());
        sbN.append('.');
        throw new IllegalArgumentException(sbN.toString());
    }
}

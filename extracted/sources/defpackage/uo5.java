package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class uo5 implements no7 {
    public static final uo5 a = new uo5();

    @Override // defpackage.no7
    public final String a() {
        return "kotlin.Nothing";
    }

    @Override // defpackage.no7
    public final boolean c() {
        return false;
    }

    @Override // defpackage.no7
    public final int d(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.no7
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.no7
    public final String f(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.no7
    public final List g(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.no7
    public final List getAnnotations() {
        return EmptyList.a;
    }

    @Override // defpackage.no7
    public final o37 getKind() {
        return g98.e;
    }

    @Override // defpackage.no7
    public final no7 h(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (g98.e.hashCode() * 31) - 1818355776;
    }

    @Override // defpackage.no7
    public final boolean i(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.no7
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}

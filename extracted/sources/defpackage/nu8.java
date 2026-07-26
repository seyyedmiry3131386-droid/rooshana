package defpackage;

import com.google.gson.reflect.TypeToken;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public final class nu8 implements rt8 {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ qt8 c;

    public nu8(Class cls, Class cls2, qt8 qt8Var) {
        this.a = cls;
        this.b = cls2;
        this.c = qt8Var;
    }

    @Override // defpackage.rt8
    public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (rawType == this.a || rawType == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + Marker.ANY_NON_NULL_MARKER + this.a.getName() + ",adapter=" + this.c + "]";
    }
}

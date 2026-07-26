package defpackage;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class lu8 implements rt8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ qt8 c;

    public /* synthetic */ lu8(Class cls, qt8 qt8Var, int i) {
        this.a = i;
        this.b = cls;
        this.c = qt8Var;
    }

    @Override // defpackage.rt8
    public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
        switch (this.a) {
            case 0:
                if (typeToken.getRawType() == this.b) {
                    return this.c;
                }
                return null;
            default:
                Class<?> rawType = typeToken.getRawType();
                if (this.b.isAssignableFrom(rawType)) {
                    return new uu0(this, rawType);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Factory[type=" + this.b.getName() + ",adapter=" + this.c + "]";
            default:
                return "Factory[typeHierarchy=" + this.b.getName() + ",adapter=" + this.c + "]";
        }
    }
}

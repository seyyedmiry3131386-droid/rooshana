package defpackage;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public class v22 implements rt8 {
    @Override // defpackage.rt8
    public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
            return null;
        }
        if (!rawType.isEnum()) {
            rawType = rawType.getSuperclass();
        }
        return new w22(rawType);
    }
}

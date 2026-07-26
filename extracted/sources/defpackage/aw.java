package defpackage;

import com.google.gson.internal.a;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class aw implements rt8 {
    @Override // defpackage.rt8
    public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
        Type type = typeToken.getType();
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new bw(vv2Var, vv2Var.d(TypeToken.get(genericComponentType)), a.f(genericComponentType));
    }
}

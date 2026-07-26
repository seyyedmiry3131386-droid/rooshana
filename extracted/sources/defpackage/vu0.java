package defpackage;

import com.google.gson.internal.a;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public final class vu0 implements rt8 {
    public final /* synthetic */ int a;
    public final gv b;

    public /* synthetic */ vu0(gv gvVar, int i) {
        this.a = i;
        this.b = gvVar;
    }

    @Override // defpackage.rt8
    public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.a;
        gv gvVar = this.b;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                Type typeG = a.g(type, rawType, Collection.class);
                cls = typeG instanceof ParameterizedType ? ((ParameterizedType) typeG).getActualTypeArguments()[0] : Object.class;
                return new uu0(new ci4(vv2Var, vv2Var.d(TypeToken.get(cls)), cls), gvVar.t(typeToken, false));
            default:
                Type type2 = typeToken.getType();
                Class rawType2 = typeToken.getRawType();
                if (!Map.class.isAssignableFrom(rawType2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(rawType2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeG2 = a.g(type2, rawType2, Map.class);
                    actualTypeArguments = typeG2 instanceof ParameterizedType ? ((ParameterizedType) typeG2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new ci4(this, new ci4(vv2Var, (type3 == Boolean.TYPE || type3 == Boolean.class) ? vu8.c : vv2Var.d(TypeToken.get(type3)), type3), new ci4(vv2Var, vv2Var.d(TypeToken.get(type4)), type4), gvVar.t(typeToken, false));
        }
    }
}

package defpackage;

import com.google.gson.reflect.TypeToken;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class su3 implements rt8 {
    public static final ru3 c = new ru3(0);
    public final gv a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new ru3(0);
    }

    public su3(gv gvVar) {
        this.a = gvVar;
    }

    @Override // defpackage.rt8
    public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
        qu3 qu3Var = (qu3) typeToken.getRawType().getAnnotation(qu3.class);
        if (qu3Var == null) {
            return null;
        }
        return b(this.a, vv2Var, typeToken, qu3Var, true);
    }

    public final qt8 b(gv gvVar, vv2 vv2Var, TypeToken typeToken, qu3 qu3Var, boolean z) {
        qt8 qt8VarA;
        Object objA = gvVar.t(TypeToken.get(qu3Var.value()), true).a();
        boolean zNullSafe = qu3Var.nullSafe();
        if (objA instanceof qt8) {
            qt8VarA = (qt8) objA;
        } else {
            if (!(objA instanceof rt8)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            rt8 rt8Var = (rt8) objA;
            if (z) {
                rt8 rt8Var2 = (rt8) this.b.putIfAbsent(typeToken.getRawType(), rt8Var);
                if (rt8Var2 != null) {
                    rt8Var = rt8Var2;
                }
            }
            qt8VarA = rt8Var.a(vv2Var, typeToken);
        }
        return (qt8VarA == null || !zNullSafe) ? qt8VarA : qt8VarA.a();
    }
}

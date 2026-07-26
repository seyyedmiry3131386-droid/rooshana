package defpackage;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.json.internal.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pu3 {
    public static final ou3 d = new ou3(new bv3(false, false, false, true, "    ", "type", true, ClassDiscriminatorMode.b), wo7.a);
    public final bv3 a;
    public final rb4 b;
    public final ql4 c = new ql4(15);

    public pu3(bv3 bv3Var, rb4 rb4Var) {
        this.a = bv3Var;
        this.b = rb4Var;
    }

    public final Object a(px3 px3Var, String str) {
        js3.p(px3Var, "deserializer");
        js3.p(str, "string");
        w78 w78Var = new w78(str);
        Object objE = new c(this, WriteMode.c, w78Var, px3Var.getDescriptor(), null).e(px3Var);
        w78Var.r();
        return objE;
    }

    public final kv3 b(px3 px3Var, Object obj) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new kw3(this, new lj6(ref$ObjectRef, 1), 1).g(px3Var, obj);
        Object obj2 = ref$ObjectRef.a;
        if (obj2 != null) {
            return (kv3) obj2;
        }
        js3.V("result");
        throw null;
    }

    public final String c(px3 px3Var, Object obj) {
        js3.p(px3Var, "serializer");
        dc0 dc0Var = new dc0((char) 0, 4);
        op0 op0Var = op0.c;
        dc0Var.c = op0Var.d(128);
        try {
            y40.p(this, dc0Var, px3Var, obj);
            String string = dc0Var.toString();
            char[] cArr = (char[]) dc0Var.c;
            op0Var.getClass();
            js3.p(cArr, "array");
            op0Var.b(cArr);
            return string;
        } catch (Throwable th) {
            op0 op0Var2 = op0.c;
            char[] cArr2 = (char[]) dc0Var.c;
            op0Var2.getClass();
            js3.p(cArr2, "array");
            op0Var2.b(cArr2);
            throw th;
        }
    }
}

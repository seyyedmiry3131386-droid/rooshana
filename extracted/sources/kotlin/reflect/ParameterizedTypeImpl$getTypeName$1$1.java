package kotlin.reflect;

import defpackage.br9;
import defpackage.dp2;
import defpackage.ho7;
import defpackage.js3;
import defpackage.m88;
import defpackage.mo7;
import defpackage.s7;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements dp2 {
    static {
        new ParameterizedTypeImpl$getTypeName$1$1();
    }

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, s7.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Type type = (Type) obj;
        js3.p(type, "p0");
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        ho7 ho7VarS = mo7.s(TypesJVMKt$typeToString$unwrap$1.a, type);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) mo7.u(ho7VarS)).getName());
        Iterator it = ho7VarS.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                br9.O();
                throw null;
            }
        }
        sb.append(m88.W(i, "[]"));
        return sb.toString();
    }
}

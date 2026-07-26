package kotlin.reflect;

import defpackage.dp2;
import defpackage.js3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements dp2 {
    public static final TypesJVMKt$typeToString$unwrap$1 a = new TypesJVMKt$typeToString$unwrap$1();

    public TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Class cls = (Class) obj;
        js3.p(cls, "p0");
        return cls.getComponentType();
    }
}

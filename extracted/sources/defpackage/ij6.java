package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke;
import androidx.datastore.preferences.protobuf.f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ij6 extends f {
    private static final ij6 DEFAULT_INSTANCE;
    private static volatile k26 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private sr3 strings_ = jn6.d;

    static {
        ij6 ij6Var = new ij6();
        DEFAULT_INSTANCE = ij6Var;
        f.j(ij6.class, ij6Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void l(ij6 ij6Var, Iterable iterable) {
        sr3 sr3Var = ij6Var.strings_;
        if (!((a2) sr3Var).a) {
            int size = sr3Var.size();
            ij6Var.strings_ = sr3Var.g(size == 0 ? 10 : size * 2);
        }
        List list = ij6Var.strings_;
        Charset charset = ur3.a;
        if (iterable instanceof j44) {
            List listK = ((j44) iterable).k();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listK.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof ByteString) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                ByteString.h(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof ak6) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size2 = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    public static ij6 m() {
        return DEFAULT_INSTANCE;
    }

    public static hj6 o() {
        return (hj6) ((er2) DEFAULT_INSTANCE.c(GeneratedMessageLite$MethodToInvoke.e));
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final Object c(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        k26 gr2Var;
        switch (generatedMessageLite$MethodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new iv6(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new ij6();
            case 4:
                return new hj6(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                k26 k26Var = PARSER;
                if (k26Var != null) {
                    return k26Var;
                }
                synchronized (ij6.class) {
                    try {
                        gr2Var = PARSER;
                        if (gr2Var == null) {
                            gr2Var = new gr2();
                            PARSER = gr2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return gr2Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final sr3 n() {
        return this.strings_;
    }
}

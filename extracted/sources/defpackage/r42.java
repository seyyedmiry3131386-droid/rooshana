package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r42 implements rt8, Cloneable {
    public static final r42 c = new r42();
    public final List a;
    public final List b;

    public r42() {
        List list = Collections.EMPTY_LIST;
        this.a = list;
        this.b = list;
    }

    @Override // defpackage.rt8
    public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean zB = b(rawType, true);
        boolean zB2 = b(rawType, false);
        if (zB || zB2) {
            return new q42(this, zB2, zB, vv2Var, typeToken);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            j27 j27Var = m27.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.a : this.b).iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (r42) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

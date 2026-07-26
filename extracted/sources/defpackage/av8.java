package defpackage;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class av8 {
    public final TypeVariable a;

    public av8(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof av8)) {
            return false;
        }
        TypeVariable typeVariable = ((av8) obj).a;
        TypeVariable typeVariable2 = this.a;
        return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && typeVariable2.getName().equals(typeVariable.getName());
    }

    public final int hashCode() {
        TypeVariable typeVariable = this.a;
        return Arrays.hashCode(new Object[]{typeVariable.getGenericDeclaration(), typeVariable.getName()});
    }

    public final String toString() {
        return this.a.toString();
    }
}

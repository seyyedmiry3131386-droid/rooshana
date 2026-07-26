package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
public final class zu8 extends vo4 {
    public final /* synthetic */ TypeVariable c;
    public final /* synthetic */ vo4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu8(TypeVariable typeVariable, vo4 vo4Var) {
        super(15);
        this.c = typeVariable;
        this.d = vo4Var;
    }

    @Override // defpackage.vo4
    public final Type l(TypeVariable typeVariable, zu8 zu8Var) {
        return typeVariable.getGenericDeclaration().equals(this.c.getGenericDeclaration()) ? typeVariable : this.d.l(typeVariable, zu8Var);
    }
}

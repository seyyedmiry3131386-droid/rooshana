package kotlin.jvm.internal;

import defpackage.aq2;
import defpackage.cx3;
import defpackage.g27;
import defpackage.js3;
import defpackage.yw3;

/* JADX INFO: loaded from: classes3.dex */
public class FunctionReference extends CallableReference implements aq2, cx3 {
    private final int arity;
    private final int flags;

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public yw3 computeReflected() {
        g27.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && js3.i(getBoundReceiver(), functionReference.getBoundReceiver()) && js3.i(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof cx3) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.aq2
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.cx3
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.cx3
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.cx3
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.cx3
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.cx3
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        yw3 yw3VarCompute = compute();
        if (yw3VarCompute != this) {
            return yw3VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public cx3 getReflected() {
        return (cx3) super.getReflected();
    }
}

package kotlin.jvm.internal;

import defpackage.js3;
import defpackage.ox3;
import defpackage.yw3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyReference extends CallableReference implements ox3 {
    public final boolean a;

    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = (i & 2) == 2;
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ox3 getReflected() {
        if (this.a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (ox3) super.getReflected();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final yw3 compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && js3.i(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof ox3) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        yw3 yw3VarCompute = compute();
        if (yw3VarCompute != this) {
            return yw3VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}

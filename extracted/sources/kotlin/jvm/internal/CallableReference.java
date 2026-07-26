package kotlin.jvm.internal;

import defpackage.bx3;
import defpackage.g27;
import defpackage.qx3;
import defpackage.qy5;
import defpackage.yw3;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CallableReference implements yw3, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient yw3 reflected;
    private final String signature;

    public static class NoReceiver implements Serializable {
        public static final NoReceiver a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return a;
        }
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.yw3
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.yw3
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public yw3 compute() {
        yw3 yw3Var = this.reflected;
        if (yw3Var != null) {
            return yw3Var;
        }
        yw3 yw3VarComputeReflected = computeReflected();
        this.reflected = yw3VarComputeReflected;
        return yw3VarComputeReflected;
    }

    public abstract yw3 computeReflected();

    @Override // defpackage.xw3
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.yw3
    public String getName() {
        return this.name;
    }

    public bx3 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return g27.a(cls);
        }
        g27.a.getClass();
        return new qy5(cls);
    }

    @Override // defpackage.yw3
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public yw3 getReflected() {
        yw3 yw3VarCompute = compute();
        if (yw3VarCompute != this) {
            return yw3VarCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // defpackage.yw3
    public qx3 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.yw3
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.yw3
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.yw3
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.yw3
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.yw3
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}

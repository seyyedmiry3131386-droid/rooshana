package kotlin.random;

import defpackage.yu6;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class Random$Default extends yu6 implements Serializable {

    public static final class Serialized implements Serializable {
        public static final Serialized a = new Serialized();
        private static final long serialVersionUID = 0;

        private Serialized() {
        }

        private final Object readResolve() {
            return yu6.a;
        }
    }

    public /* synthetic */ Random$Default(int i) {
        this();
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return Serialized.a;
    }

    @Override // defpackage.yu6
    public final int a(int i) {
        return yu6.b.a(i);
    }

    @Override // defpackage.yu6
    public final int b() {
        return yu6.b.b();
    }

    @Override // defpackage.yu6
    public final int c(int i, int i2) {
        return yu6.b.c(i, i2);
    }

    private Random$Default() {
    }
}

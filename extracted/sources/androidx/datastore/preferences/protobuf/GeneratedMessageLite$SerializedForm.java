package androidx.datastore.preferences.protobuf;

import defpackage.er2;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class GeneratedMessageLite$SerializedForm implements Serializable {
    private static final long serialVersionUID = 0;

    public Object readResolve() throws ObjectStreamException {
        try {
            Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
            declaredField.setAccessible(true);
            ((er2) ((f) ((a) declaredField.get(null))).c(GeneratedMessageLite$MethodToInvoke.e)).getClass();
            throw null;
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException("Unable to understand proto buffer", e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Unable to find proto buffer class: null", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Unable to call parsePartialFrom", e3);
        } catch (NoSuchFieldException e4) {
            throw new RuntimeException("Unable to find DEFAULT_INSTANCE in null", e4);
        } catch (SecurityException e5) {
            throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e5);
        }
    }
}

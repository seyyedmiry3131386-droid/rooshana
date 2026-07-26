package org.junit.runner;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class Result implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = ObjectStreamClass.lookup(SerializedForm.class).getFields();
    private static final long serialVersionUID = 1;
    public final AtomicInteger a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    public final CopyOnWriteArrayList d;
    public final AtomicLong e;
    public final AtomicLong f;
    public SerializedForm g;

    public Result(SerializedForm serializedForm) {
        this.a = serializedForm.a;
        this.b = serializedForm.b;
        this.c = serializedForm.c;
        this.d = new CopyOnWriteArrayList(serializedForm.d);
        this.e = new AtomicLong(serializedForm.e);
        this.f = new AtomicLong(serializedForm.f);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.g = new SerializedForm(objectInputStream.readFields());
    }

    private Object readResolve() {
        return new Result(this.g);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        SerializedForm serializedForm = new SerializedForm(this);
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("fCount", serializedForm.a);
        putFieldPutFields.put("fIgnoreCount", serializedForm.b);
        putFieldPutFields.put("fFailures", serializedForm.d);
        putFieldPutFields.put("fRunTime", serializedForm.e);
        putFieldPutFields.put("fStartTime", serializedForm.f);
        putFieldPutFields.put("assumptionFailureCount", serializedForm.c);
        objectOutputStream.writeFields();
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 1;
        public final AtomicInteger a;
        public final AtomicInteger b;
        public final AtomicInteger c;
        public final List d;
        public final long e;
        public final long f;

        public SerializedForm(Result result) {
            this.a = result.a;
            this.b = result.b;
            this.c = result.c;
            this.d = DesugarCollections.synchronizedList(new ArrayList(result.d));
            this.e = result.e.longValue();
            this.f = result.f.longValue();
        }

        public SerializedForm(ObjectInputStream.GetField getField) {
            this.a = (AtomicInteger) getField.get("fCount", (Object) null);
            this.b = (AtomicInteger) getField.get("fIgnoreCount", (Object) null);
            this.c = (AtomicInteger) getField.get("assumptionFailureCount", (Object) null);
            this.d = (List) getField.get("fFailures", (Object) null);
            this.e = getField.get("fRunTime", 0L);
            this.f = getField.get("fStartTime", 0L);
        }
    }
}

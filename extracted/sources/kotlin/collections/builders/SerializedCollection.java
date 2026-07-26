package kotlin.collections.builders;

import defpackage.a77;
import defpackage.br9;
import defpackage.js3;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class SerializedCollection implements Externalizable {
    private static final long serialVersionUID = 0;
    public Collection a;
    public final int b;

    public SerializedCollection() {
        this(0, EmptyList.a);
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Collection collectionQ;
        js3.p(objectInput, "input");
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b) + '.');
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + '.');
        }
        int i3 = 0;
        if (i == 0) {
            ListBuilder listBuilder = new ListBuilder(i2);
            while (i3 < i2) {
                listBuilder.add(objectInput.readObject());
                i3++;
            }
            collectionQ = br9.q(listBuilder);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
            }
            SetBuilder setBuilder = new SetBuilder(new MapBuilder(i2));
            while (i3 < i2) {
                setBuilder.add(objectInput.readObject());
                i3++;
            }
            collectionQ = a77.a(setBuilder);
        }
        this.a = collectionQ;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        js3.p(objectOutput, "output");
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public SerializedCollection(int i, Collection collection) {
        js3.p(collection, "collection");
        this.a = collection;
        this.b = i;
    }
}

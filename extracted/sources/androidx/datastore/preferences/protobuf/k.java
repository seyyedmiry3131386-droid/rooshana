package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterator {
    public final ArrayDeque a;
    public ByteString.LeafByteString b;

    public k(ByteString byteString) {
        if (!(byteString instanceof RopeByteString)) {
            this.a = null;
            this.b = (ByteString.LeafByteString) byteString;
            return;
        }
        RopeByteString ropeByteString = (RopeByteString) byteString;
        ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.h);
        this.a = arrayDeque;
        arrayDeque.push(ropeByteString);
        ByteString byteString2 = ropeByteString.e;
        while (byteString2 instanceof RopeByteString) {
            RopeByteString ropeByteString2 = (RopeByteString) byteString2;
            this.a.push(ropeByteString2);
            byteString2 = ropeByteString2.e;
        }
        this.b = (ByteString.LeafByteString) byteString2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ByteString.LeafByteString next() {
        ByteString.LeafByteString leafByteString;
        ByteString.LeafByteString leafByteString2 = this.b;
        if (leafByteString2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                leafByteString = null;
                break;
            }
            ByteString byteString = ((RopeByteString) arrayDeque.pop()).f;
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                arrayDeque.push(ropeByteString);
                byteString = ropeByteString.e;
            }
            leafByteString = (ByteString.LeafByteString) byteString;
        } while (leafByteString.size() == 0);
        this.b = leafByteString;
        return leafByteString2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

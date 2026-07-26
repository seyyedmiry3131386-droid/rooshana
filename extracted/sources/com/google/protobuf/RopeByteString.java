package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.kt3;
import defpackage.lu0;
import defpackage.sj0;
import defpackage.tr3;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class RopeByteString extends ByteString {
    private static final long serialVersionUID = 1;
    public final int d;
    public final ByteString e;
    public final ByteString f;
    public final int g;
    public final int h;

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.e = byteString;
        this.f = byteString2;
        int size = byteString.size();
        this.g = size;
        this.d = byteString2.size() + size;
        this.h = Math.max(byteString.l(), byteString2.l()) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer a() {
        return ByteBuffer.wrap(t()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final byte c(int i) {
        ByteString.e(i, this.d);
        return m(i);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i = this.d;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.a;
                int i3 = byteString.a;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    t tVar = new t(this);
                    ByteString.LeafByteString next = tVar.next();
                    t tVar2 = new t(byteString);
                    ByteString.LeafByteString next2 = tVar2.next();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int size2 = next.size() - i4;
                        int size3 = next2.size() - i5;
                        int iMin = Math.min(size2, size3);
                        if (!(i4 == 0 ? next.y(next2, i5, iMin) : next2.y(next, i4, iMin))) {
                            break;
                        }
                        i6 += iMin;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            i4 = 0;
                            next = tVar.next();
                        } else {
                            i4 += iMin;
                            next = next;
                        }
                        if (iMin == size3) {
                            next2 = tVar2.next();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new s(this);
    }

    @Override // com.google.protobuf.ByteString
    public final void j(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.e;
        int i5 = this.g;
        if (i4 <= i5) {
            byteString.j(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.f;
        if (i >= i5) {
            byteString2.j(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.j(bArr, i, i2, i6);
        byteString2.j(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int l() {
        return this.h;
    }

    @Override // com.google.protobuf.ByteString
    public final byte m(int i) {
        int i2 = this.g;
        return i < i2 ? this.e.m(i) : this.f.m(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean n() {
        int iR = this.e.r(0, 0, this.g);
        ByteString byteString = this.f;
        return byteString.r(iR, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    /* JADX INFO: renamed from: o */
    public final sj0 iterator() {
        return new s(this);
    }

    @Override // com.google.protobuf.ByteString
    public final lu0 p() {
        ByteString.LeafByteString leafByteString;
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.h);
        arrayDeque.push(this);
        ByteString byteString = this.e;
        while (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            arrayDeque.push(ropeByteString);
            byteString = ropeByteString.e;
        }
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) byteString;
        while (true) {
            if (!(leafByteString2 != null)) {
                int i = 0;
                int iRemaining = 0;
                for (ByteBuffer byteBuffer : arrayList) {
                    iRemaining += byteBuffer.remaining();
                    i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
                }
                if (i == 2) {
                    return new d(iRemaining, arrayList);
                }
                kt3 kt3Var = new kt3();
                kt3Var.a = arrayList.iterator();
                kt3Var.c = 0;
                for (ByteBuffer byteBuffer2 : arrayList) {
                    kt3Var.c++;
                }
                kt3Var.d = -1;
                if (!kt3Var.b()) {
                    kt3Var.b = tr3.c;
                    kt3Var.d = 0;
                    kt3Var.e = 0;
                    kt3Var.i = 0L;
                }
                return lu0.h(kt3Var);
            }
            if (leafByteString2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    leafByteString = null;
                    break;
                }
                ByteString byteString2 = ((RopeByteString) arrayDeque.pop()).f;
                while (byteString2 instanceof RopeByteString) {
                    RopeByteString ropeByteString2 = (RopeByteString) byteString2;
                    arrayDeque.push(ropeByteString2);
                    byteString2 = ropeByteString2.e;
                }
                leafByteString = (ByteString.LeafByteString) byteString2;
                if (leafByteString.size() == 0) {
                }
            }
            arrayList.add(leafByteString2.a());
            leafByteString2 = leafByteString;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final int q(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.e;
        int i5 = this.g;
        if (i4 <= i5) {
            return byteString.q(i, i2, i3);
        }
        ByteString byteString2 = this.f;
        if (i2 >= i5) {
            return byteString2.q(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.q(byteString.q(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int r(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.e;
        int i5 = this.g;
        if (i4 <= i5) {
            return byteString.r(i, i2, i3);
        }
        ByteString byteString2 = this.f;
        if (i2 >= i5) {
            return byteString2.r(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.r(byteString.r(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString s(int i, int i2) {
        int i3 = this.d;
        int iF = ByteString.f(i, i2, i3);
        if (iF == 0) {
            return ByteString.b;
        }
        if (iF == i3) {
            return this;
        }
        ByteString byteString = this.e;
        int i4 = this.g;
        if (i2 <= i4) {
            return byteString.s(i, i2);
        }
        ByteString byteString2 = this.f;
        return i >= i4 ? byteString2.s(i - i4, i2 - i4) : new RopeByteString(byteString.s(i, byteString.size()), byteString2.s(0, i2 - i4));
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.d;
    }

    @Override // com.google.protobuf.ByteString
    public final String v(Charset charset) {
        return new String(t(), charset);
    }

    public Object writeReplace() {
        return new ByteString.LiteralByteString(t());
    }

    @Override // com.google.protobuf.ByteString
    public final void x(j jVar) {
        this.e.x(jVar);
        this.f.x(jVar);
    }
}

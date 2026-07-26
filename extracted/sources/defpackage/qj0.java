package defpackage;

import com.google.protobuf.ByteString;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class qj0 extends sj0 {
    public int b;
    public final int c;
    public final /* synthetic */ ByteString d;

    public qj0(ByteString byteString) {
        super(0);
        this.d = byteString;
        this.b = 0;
        this.c = byteString.size();
    }

    @Override // defpackage.sj0
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.d.m(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}

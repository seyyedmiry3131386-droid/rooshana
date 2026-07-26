package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class rj0 extends sj0 {
    public int b;
    public final int c;
    public final /* synthetic */ ByteString d;

    public rj0(ByteString byteString) {
        super(1);
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
        return this.d.l(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}

package defpackage;

import java.util.RandomAccess;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class tv5 extends z0 implements RandomAccess {
    public final ByteString[] a;
    public final int[] b;

    public tv5(ByteString[] byteStringArr, int[] iArr) {
        this.a = byteStringArr;
        this.b = iArr;
    }

    @Override // defpackage.o
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.z0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // defpackage.z0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}

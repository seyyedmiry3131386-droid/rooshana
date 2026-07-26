package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class vy1 {
    public final int a;
    public String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public vy1(ByteBuffer byteBuffer, boolean z) {
        this.a = byteBuffer.getInt(0);
        this.c = byteBuffer.getInt(4);
        this.d = (int) (z ? byteBuffer.getLong(8) : byteBuffer.getInt(8));
        this.e = (int) (z ? byteBuffer.getLong(24) : byteBuffer.getInt(16));
        this.f = (int) (z ? byteBuffer.getLong(32) : byteBuffer.getInt(20));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ELFSectionHeaderEntry{nameIdx=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", flags=");
        sb.append(this.d);
        sb.append(", offset=");
        sb.append(this.e);
        sb.append(", size=");
        return dw1.q(sb, this.f, '}');
    }
}

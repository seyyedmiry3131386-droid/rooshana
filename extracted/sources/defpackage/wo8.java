package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wo8 {
    public final boolean a;
    public final String b;
    public final bp8 c;
    public final int d;
    public final byte[] e;

    public wo8(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 1;
        vy2.j((i == 0) ^ (bArr2 == null));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str) {
                case "cbc1":
                case "cbcs":
                    i4 = 2;
                    break;
                case "cenc":
                case "cens":
                    break;
                default:
                    wn5.k0("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.c = new bp8(bArr, i4, i2, i3);
    }
}

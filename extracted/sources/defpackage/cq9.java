package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cq9 {
    public static final /* synthetic */ int a = 0;

    static {
        byte b = (byte) (((byte) 1) | 2);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((b & 2) == 0) {
            sb.append(" skipChecks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

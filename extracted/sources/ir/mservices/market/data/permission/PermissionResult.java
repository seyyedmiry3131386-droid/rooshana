package ir.mservices.market.data.permission;

/* JADX INFO: loaded from: classes3.dex */
public enum PermissionResult {
    NOT_SET(0),
    GRANTED(1),
    DENIED(2),
    DENIED_FOREVER(3);

    public final int a;

    PermissionResult(int i) {
        this.a = i;
    }
}

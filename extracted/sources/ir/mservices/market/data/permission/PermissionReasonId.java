package ir.mservices.market.data.permission;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PermissionReasonId {
    public static final PermissionReasonId a;
    public static final PermissionReasonId b;
    public static final PermissionReasonId c;
    public static final PermissionReasonId d;
    public static final PermissionReasonId e;
    public static final PermissionReasonId f;
    public static final PermissionReasonId g;
    public static final PermissionReasonId h;
    public static final PermissionReasonId i;
    public static final /* synthetic */ PermissionReasonId[] j;

    static {
        PermissionReasonId permissionReasonId = new PermissionReasonId("DEFAULT", 0);
        a = permissionReasonId;
        PermissionReasonId permissionReasonId2 = new PermissionReasonId("READ_STORAGE", 1);
        b = permissionReasonId2;
        PermissionReasonId permissionReasonId3 = new PermissionReasonId("PHOTO_READ_STORAGE", 2);
        PermissionReasonId permissionReasonId4 = new PermissionReasonId("WRITE_STORAGE", 3);
        c = permissionReasonId4;
        PermissionReasonId permissionReasonId5 = new PermissionReasonId("NOTIFICATION_UPDATE", 4);
        d = permissionReasonId5;
        PermissionReasonId permissionReasonId6 = new PermissionReasonId("NOTIFICATION_DOWNLOAD", 5);
        e = permissionReasonId6;
        PermissionReasonId permissionReasonId7 = new PermissionReasonId("NOTIFICATION_SUPPORT", 6);
        f = permissionReasonId7;
        PermissionReasonId permissionReasonId8 = new PermissionReasonId("USAGE_STATE_SERVICE", 7);
        g = permissionReasonId8;
        PermissionReasonId permissionReasonId9 = new PermissionReasonId("MOVIE_WRITE_STORAGE", 8);
        h = permissionReasonId9;
        PermissionReasonId permissionReasonId10 = new PermissionReasonId("REEL_WRITE_STORAGE", 9);
        i = permissionReasonId10;
        j = new PermissionReasonId[]{permissionReasonId, permissionReasonId2, permissionReasonId3, permissionReasonId4, permissionReasonId5, permissionReasonId6, permissionReasonId7, permissionReasonId8, permissionReasonId9, permissionReasonId10};
    }

    public static PermissionReasonId valueOf(String str) {
        return (PermissionReasonId) Enum.valueOf(PermissionReasonId.class, str);
    }

    public static PermissionReasonId[] values() {
        return (PermissionReasonId[]) j.clone();
    }
}

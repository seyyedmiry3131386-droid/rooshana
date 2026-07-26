package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vz implements dp2 {
    public static final vz b = new vz(0);
    public static final vz c = new vz(1);
    public static final vz d = new vz(2);
    public static final vz e = new vz(3);
    public static final vz f = new vz(4);
    public static final vz g = new vz(5);
    public static final vz h = new vz(6);
    public static final vz i = new vz(7);
    public static final vz j = new vz(8);
    public static final vz k = new vz(9);
    public static final vz l = new vz(10);
    public static final vz m = new vz(11);
    public static final vz n = new vz(12);
    public static final vz o = new vz(13);
    public static final vz p = new vz(14);
    public static final vz q = new vz(15);
    public static final vz r = new vz(16);
    public final /* synthetic */ int a;

    public /* synthetic */ vz(int i2) {
        this.a = i2;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException(o40.x(obj, "Unknown screen "));
            case 1:
                return obj.toString();
            case 2:
                return obj.toString();
            case 3:
                return obj.toString();
            case 4:
                return obj.toString();
            case 5:
                throw new IllegalStateException(o40.x(obj, "Unknown screen "));
            case 6:
                return obj.toString();
            case 7:
                return obj.toString();
            case 8:
                return obj.toString();
            case 9:
                return obj.toString();
            case 10:
                return obj.toString();
            case 11:
                return obj.toString();
            case 12:
                return obj.toString();
            case 13:
                return obj.toString();
            case 14:
                return obj.toString();
            case 15:
                if (js3.i(obj, Boolean.FALSE)) {
                    return new zu0(zu0.h);
                }
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new zu0(gu9.d(((Integer) obj).intValue()));
            default:
                return null;
        }
    }
}

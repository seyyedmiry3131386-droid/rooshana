package defpackage;

import com.google.android.datatransport.cct.internal.ClientInfo$ClientType;

/* JADX INFO: loaded from: classes.dex */
public final class m10 implements uq5 {
    public static final m10 a = new m10();
    public static final xa2 b = xa2.a("clientType");
    public static final xa2 c = xa2.a("androidClientInfo");

    @Override // defpackage.p12
    public final void a(Object obj, Object obj2) {
        vq5 vq5Var = (vq5) obj2;
        i20 i20Var = (i20) ((kt0) obj);
        i20Var.getClass();
        vq5Var.a(b, ClientInfo$ClientType.a);
        vq5Var.a(c, i20Var.a);
    }
}

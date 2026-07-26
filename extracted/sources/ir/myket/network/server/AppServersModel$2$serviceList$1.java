package ir.myket.network.server;

import defpackage.dp2;
import defpackage.f88;
import defpackage.js3;
import defpackage.ls;
import defpackage.m88;
import defpackage.ps;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class AppServersModel$2$serviceList$1 extends FunctionReferenceImpl implements dp2 {
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        String str = (String) obj;
        ps psVar = (ps) this.receiver;
        ls lsVar = ps.Companion;
        psVar.getClass();
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() < 2 || !m88.Z(str, "/", false) || !f88.f0(str, "/")) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }
}
